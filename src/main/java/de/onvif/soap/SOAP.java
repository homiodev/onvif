package de.onvif.soap;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.timeout.IdleStateHandler;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.UnmarshalException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.soap.MessageFactory;
import jakarta.xml.soap.SOAPConstants;
import jakarta.xml.soap.SOAPElement;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.soap.SOAPPart;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.oasis_open.docs.wsn.b_2.Renew;
import org.oasis_open.docs.wsn.b_2.Unsubscribe;
import org.onvif.ver10.events.wsdl.CreatePullPointSubscription;
import org.onvif.ver10.events.wsdl.PullMessages;
import org.w3c.dom.Document;

@Log4j2
public class SOAP implements OnvifCodec.OnvifEventHandler {

    public static final DatatypeFactory DATATYPE_FACTORY;

    static {
        try {
            DATATYPE_FACTORY = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    private final OnvifDeviceState onvifDeviceState;
    private final Map<String, AsyncClassListener> asyncSoapMessageToType = new HashMap<>();
    private final String entityID;
    @Setter
    private boolean logging = Boolean.parseBoolean(System.getProperty("soap.debug", "false"));
    private Bootstrap bootstrap;
    private EventLoopGroup mainEventLoopGroup = new NioEventLoopGroup();

    public SOAP(OnvifDeviceState onvifDeviceState) {
        this.entityID = onvifDeviceState.getEntityID();
        this.onvifDeviceState = onvifDeviceState;
    }

    public static <T> T parseMessage(Class<T> responseClass, String message, String entityID) {
        try {
            SOAPMessage soapResponse =
                    MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL)
                            .createMessage(null, new ByteArrayInputStream(message.getBytes()));
            Unmarshaller unmarshaller = JAXBContext.newInstance(responseClass).createUnmarshaller();
            return (T) unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument());
        } catch (Exception e) {
            log.warn(
                    "[{}]: Could not unmarshal for <{}>, ended in SOAP fault. Msg: <{}>",
                    entityID,
                    responseClass.getSimpleName(),
                    message);
        }
        return null;
    }

    public static String removeIpFromUrl(String url) {
        int index = url.indexOf("//");
        if (index != -1) { // now remove the :port
            index = url.indexOf("/", index + 2);
        }
        if (index == -1) {
            return "";
        }
        return url.substring(index);
    }

    @SneakyThrows
    private static String toString(Document document) {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        transformer.transform(
                new DOMSource(document),
                new StreamResult(new OutputStreamWriter(out, StandardCharsets.UTF_8)));
        return out.toString();
    }

    @SneakyThrows
    public Object createSOAPDeviceRequest(Object soapRequestElem, Class soapResponseClass) {
        return createSOAPRequest(
                soapRequestElem,
                soapResponseClass,
                onvifDeviceState.getServerDeviceUri(),
                onvifDeviceState.getServerDeviceIpLessUri(),
                false);
    }

    @SneakyThrows
    public Object createSOAPDeviceRequestThrowError(Object soapRequestElem, Class soapResponseClass) {
        return createSOAPRequest(
                soapRequestElem,
                soapResponseClass,
                onvifDeviceState.getServerDeviceUri(),
                onvifDeviceState.getServerDeviceIpLessUri(),
                true);
    }

    public <T> T createSOAPDeviceRequestType(Object soapRequestElem, Class<T> soapResponseClass) {
        return (T) createSOAPDeviceRequest(soapRequestElem, soapResponseClass);
    }

    public <T> T createSOAPDeviceRequestTypeThrowError(
            Object soapRequestElem, Class<T> soapResponseClass) {
        return (T) createSOAPDeviceRequestThrowError(soapRequestElem, soapResponseClass);
    }

    @SneakyThrows
    public <T> T createSOAPPtzRequest(Object soapRequestElem, Class<T> soapResponseClass) {
        return createSOAPRequest(
                soapRequestElem,
                soapResponseClass,
                onvifDeviceState.getServerPtzUri(),
                onvifDeviceState.getServerPtzIpLessUri(),
                false);
    }

    @SneakyThrows
    public <T> T createSOAPMediaRequest(Object soapRequestElem, Class<T> soapResponseClass) {
        return createSOAPRequest(
                soapRequestElem,
                soapResponseClass,
                onvifDeviceState.getServerMediaUri(),
                onvifDeviceState.getServerMediaIpLessUri(),
                false);
    }

    @SneakyThrows
    public <T> T createSOAPImagingRequest(Object soapRequestElem, Class<T> soapResponseClass) {
        return createSOAPRequest(
                soapRequestElem,
                soapResponseClass,
                onvifDeviceState.getServerImagingUri(),
                onvifDeviceState.getServerImagingIpLessUri(),
                false);
    }

    @SneakyThrows
    public Object createSOAPEventsRequest(Object soapRequestElem, Class soapResponseClass) {
        return createSOAPRequest(
                soapRequestElem,
                soapResponseClass,
                onvifDeviceState.getServerEventsUri(),
                onvifDeviceState.getServerEventsIpLessUri(),
                false);
    }

    @SneakyThrows
    public void sendSOAPEventRequestAsync(Object soapRequestElem) {
        sendSOAPRequestAsync(soapRequestElem, onvifDeviceState.getServerEventsIpLessUri());
    }

    @SneakyThrows
    public void sendSOAPSubscribeRequestAsync(Object soapRequestElem) {
        sendSOAPRequestAsync(soapRequestElem, onvifDeviceState.getSubscriptionIpLessUri());
    }

    @Override
    @SneakyThrows
    public void handle(String message, int code) {
        log.debug("[{}]: Onvif {} reply is:{}", entityID, code, message);
        boolean handled = false;
        for (Map.Entry<String, AsyncClassListener> entry : asyncSoapMessageToType.entrySet()) {
            if (message.contains(entry.getKey())) {
                handled = true;
                Object soapResponseElem = parseMessage(entry.getValue().responseClass, message, entityID);
                if (soapResponseElem != null) {
                    for (Consumer<Object> consumer : entry.getValue().handlers.values()) {
                        consumer.accept(soapResponseElem);
                    }
                }
            }
        }
        if (!handled) {
            if (code != 200) {
                log.error(
                        "[{}]: Accepted not expected onvif soap message with code: <{}>. Msg: <{}>",
                        entityID,
                        code,
                        message);
            } else {
                log.warn(
                        "[{}]: Accepted not expected onvif soap message with code: <{}>. Msg: <{}>",
                        entityID,
                        code,
                        message);
            }
        }
    }

    /**
     * @return SOAP Response Element
     */
    public <T> T createSOAPRequest(
            Object soapRequestElem,
            Class<T> soapResponseClass,
            String soapUri,
            String xAddr,
            boolean throwError)
            throws IOException, SOAPException, JAXBException, ParserConfigurationException {
        HttpSOAPConnection soapConnection;
        SOAPMessage soapResponse = null;

        try {
            // Create SOAP Connection
            soapConnection = new HttpSOAPConnection(entityID);

            SOAPMessage soapMessage = createSoapMessage(soapRequestElem, xAddr);

            // Print the request message
            if (logging) {
                log.info(
                        "[{}]: Request sync SOAP Message ({}): ",
                        entityID,
                        soapRequestElem.getClass().getSimpleName());
                ByteArrayOutputStream bout = new ByteArrayOutputStream();
                soapMessage.writeTo(bout);
                log.info("[{}]: {}", entityID, bout.toString());
            }

            soapResponse = soapConnection.call(soapMessage, soapUri);

            // print SOAP Response
            if (logging) {
                log.info(
                        "[{}]: Response sync SOAP Message ({}): ", entityID, soapResponseClass.getSimpleName());
                ByteArrayOutputStream bout = new ByteArrayOutputStream();
                soapResponse.writeTo(bout);
                log.info("[{}]: {}", entityID, bout.toString());
            }

            if (soapResponse.getSOAPBody().getFault() != null) {
                Iterator<?> iterator = soapResponse.getSOAPBody().getFault().getFaultSubcodes();
                if (iterator.hasNext()) {
                    String error = ((QName) iterator.next()).getLocalPart();
                    if ("NotAuthorized".equals(error)) {
                        throw new BadCredentialException(
                                "Wrong credential to authorize access to soap URI: " + soapUri);
                    }
                    throw new RuntimeException(
                            "Unknown fault <" + error + "> during access to soap URI: " + soapUri);
                }
                if (throwError) {
                    String faultCode = soapResponse.getSOAPBody().getFault().getFaultCode();
                    throw new IllegalStateException(
                            "Get onvif fault response for <"
                                    + soapResponseClass.getSimpleName()
                                    + ">. Code: <"
                                    + faultCode
                                    + ">. Full: "
                                    + soapResponse.getSOAPBody().getFault().toString());
                }
            }

            Object soapResponseElem = null;
            Unmarshaller unmarshaller = JAXBContext.newInstance(soapResponseClass).createUnmarshaller();
            Document document = soapResponse.getSOAPBody().extractContentAsDocument();
            try {
                soapResponseElem = unmarshaller.unmarshal(document);
            } catch (UnmarshalException e) {
                log.warn(
                        "[{}]: Could not unmarshal for <{}>, ended in SOAP fault. Source: '{}'",
                        entityID,
                        soapResponseClass.getSimpleName(),
                        toString(document));
                if (throwError) {
                    throw new IllegalStateException(
                            "Error unmarshal for "
                                    + soapResponseClass.getSimpleName()
                                    + ". Doc: "
                                    + toString(document));
                }
            }

            return (T) soapResponseElem;
        } catch (SocketException e) {
            throw new ConnectException(e.getMessage());
        } catch (SOAPException e) {
            log.error(
                    "[{}]: Unexpected response. Response should be from class {}, but response is: {}",
                    entityID,
                    soapResponseClass,
                    soapResponse);
            throw e;
        } catch (ParserConfigurationException | JAXBException | IOException e) {
            log.error("[{}]: Unhandled exception: {}", entityID, e.getMessage());
            throw e;
        }
    }

    public <T> void addAsyncListener(Class<T> responseClass, String key, Consumer<T> consumer) {
        asyncSoapMessageToType.putIfAbsent(
                responseClass.getSimpleName(), new AsyncClassListener(responseClass));
        asyncSoapMessageToType
                .get(responseClass.getSimpleName())
                .handlers
                .put(key, (Consumer<Object>) consumer);
    }

    public void dispose() {
        if (bootstrap != null) {
            if (!mainEventLoopGroup.isShutdown()) {
                try {
                    mainEventLoopGroup.awaitTermination(3, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    log.info("[{}]: Onvif was not shutdown correctly due to being interrupted", entityID);
                } finally {
                    mainEventLoopGroup = new NioEventLoopGroup();
                    bootstrap = null;
                }
            }
        }
    }

    protected SOAPMessage createSoapMessage(Object soapRequestElem, String xAddr)
            throws SOAPException, ParserConfigurationException, JAXBException {
        MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
        SOAPMessage soapMessage = messageFactory.createMessage();

        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Marshaller marshaller = JAXBContext.newInstance(soapRequestElem.getClass()).createMarshaller();
        marshaller.marshal(soapRequestElem, document);
        soapMessage.getSOAPBody().addDocument(document);

        createSoapHeader(soapMessage, xAddr);

        soapMessage.saveChanges();
        return soapMessage;
    }

    protected void createSoapHeader(SOAPMessage soapMessage, String xAddr) throws SOAPException {
        onvifDeviceState.createNonce();
        String encrypedPassword = onvifDeviceState.getEncryptedPassword();
        if (encrypedPassword != null && onvifDeviceState.getUsername() != null) {

            SOAPPart sp = soapMessage.getSOAPPart();
            SOAPEnvelope se = sp.getEnvelope();
            SOAPHeader header = soapMessage.getSOAPHeader();
            se.addNamespaceDeclaration(
                    "wsse",
                    "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
            se.addNamespaceDeclaration(
                    "wsu",
                    "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");

            SOAPElement securityElem = header.addChildElement("Security", "wsse");
            securityElem.setAttribute("mustUnderstand", "1");

            SOAPElement usernameTokenElem = securityElem.addChildElement("UsernameToken", "wsse");

            SOAPElement usernameElem = usernameTokenElem.addChildElement("Username", "wsse");
            usernameElem.setTextContent(onvifDeviceState.getUsername());

            SOAPElement passwordElem = usernameTokenElem.addChildElement("Password", "wsse");
            passwordElem.setAttribute(
                    "Type",
                    "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest");
            passwordElem.setTextContent(encrypedPassword);

            SOAPElement nonceElem = usernameTokenElem.addChildElement("Nonce", "wsse");
            nonceElem.setAttribute(
                    "EncodingType",
                    "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
            nonceElem.setTextContent(onvifDeviceState.getEncryptedNonce());

            SOAPElement createdElem = usernameTokenElem.addChildElement("Created", "wsu");
            createdElem.setTextContent(onvifDeviceState.getLastUTCTime());

            String deviceRequestType = soapMessage.getSOAPBody().getFirstChild().getLocalName();
            if (deviceRequestType.equals(CreatePullPointSubscription.class.getSimpleName())
                    || deviceRequestType.equals(PullMessages.class.getSimpleName())
                    || deviceRequestType.equals(Renew.class.getSimpleName())
                    || deviceRequestType.equals(Unsubscribe.class.getSimpleName())) {

                se.addNamespaceDeclaration("wsa5", "http://www.w3.org/2005/08/addressing");
                SOAPElement to = header.addChildElement("To", "wsa5");
                to.setTextContent("http://" + onvifDeviceState.getIp() + xAddr);
                to.setAttribute("env:mustUnderstand", "1");
            }
        }
    }

    private void sendSOAPRequestAsync(Object soapRequestElem, String xAddr) {
        HttpRequest httpRequest = soapRequestToHttpRequest(soapRequestElem, xAddr);
        if (bootstrap == null) {
            bootstrap = new Bootstrap();
            bootstrap.group(mainEventLoopGroup);
            bootstrap.channel(NioSocketChannel.class);
            bootstrap.option(ChannelOption.SO_KEEPALIVE, true);
            bootstrap.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 10000);
            bootstrap.option(ChannelOption.SO_SNDBUF, 1024 * 8);
            bootstrap.option(ChannelOption.SO_RCVBUF, 1024 * 1024);
            bootstrap.option(ChannelOption.TCP_NODELAY, true);
            bootstrap.handler(
                    new ChannelInitializer<SocketChannel>() {

                        @Override
                        public void initChannel(SocketChannel socketChannel) {
                            socketChannel.pipeline().addLast("idleStateHandler", new IdleStateHandler(0, 0, 70));
                            socketChannel.pipeline().addLast("HttpClientCodec", new HttpClientCodec());
                            socketChannel.pipeline().addLast("OnvifCodec", new OnvifCodec(SOAP.this, entityID));
                        }
                    });
        }
        bootstrap
                .connect(new InetSocketAddress(onvifDeviceState.getIp(), onvifDeviceState.getOnvifPort()))
                .addListener(
                        (ChannelFutureListener)
                                future -> {
                                    if (future == null) {
                                        return;
                                    }
                                    if (future.isDone() && future.isSuccess()) {
                                        Channel ch = future.channel();
                                        ch.writeAndFlush(httpRequest);
                                    } else {
                                        onvifDeviceState.cameraUnreachable(
                                                future.cause() == null ? "" : getErrorMessage(future.cause()));
                                    }
                                });
    }

    @SneakyThrows
    private HttpRequest soapRequestToHttpRequest(Object soapRequestElem, String xAddr) {
        FullHttpRequest request =
                new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, new HttpMethod("POST"), xAddr);
        SOAPMessage soapMessage = createSoapMessage(soapRequestElem, xAddr);
        String deviceRequestType =
                soapRequestElem.getClass().getDeclaredAnnotation(XmlRootElement.class).name();
        String actionString = soapMessage.getSOAPBody().getFirstChild().getNamespaceURI();
        request
                .headers()
                .add(
                        "Content-Type",
                        "application/soap+xml; charset=utf-8; action=\""
                                + actionString
                                + "/"
                                + deviceRequestType
                                + "\"");
        request.headers().add("Charset", "utf-8");
        if (onvifDeviceState.getOnvifPort() != 80) {
            request
                    .headers()
                    .set(
                            HttpHeaderNames.HOST,
                            onvifDeviceState.getIp() + ":" + onvifDeviceState.getOnvifPort());
        } else {
            request.headers().set(HttpHeaderNames.HOST, onvifDeviceState.getIp());
        }
        request.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.CLOSE);
        request.headers().set(HttpHeaderNames.ACCEPT_ENCODING, "gzip, deflate");

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        soapMessage.writeTo(outputStream);
        String fullXml = outputStream.toString();
        if (logging) {
            log.info(
                    "[{}]: Request async SOAP Message ({}): ",
                    entityID,
                    soapRequestElem.getClass().getSimpleName());
            log.info("[{}]: {}", entityID, fullXml);
        }

        request.headers().add("SOAPAction", "\"" + actionString + "/" + deviceRequestType + "\"");
        ByteBuf byteBuf = Unpooled.copiedBuffer(fullXml, StandardCharsets.UTF_8);
        request.headers().set(HttpHeaderNames.CONTENT_LENGTH, byteBuf.readableBytes());
        request.content().clear().writeBytes(byteBuf);
        return request;
    }

    private String getErrorMessage(Throwable ex) {
        if (ex == null) {
            return null;
        }
        Throwable cause = ex;
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }

        if (cause instanceof NullPointerException) {
            log.error("[{}]: Unexpected NPE: <{}>", entityID, ex.getMessage(), ex);
            return "Unexpected NullPointerException at line: " + ex.getStackTrace()[0].toString();
        }
        String msg = cause.getMessage();
        if(msg == null || cause.getMessage().isEmpty()) {
            msg = cause.toString();
        }
        return msg;
    }

    @RequiredArgsConstructor
    private static final class AsyncClassListener {

        private final Class<?> responseClass;
        private final Map<String, Consumer<Object>> handlers = new HashMap<>();
    }
}
