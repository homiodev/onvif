package de.onvif.soap;

import de.onvif.soap.devices.EventDevices;
import de.onvif.soap.devices.ImagingDevices;
import de.onvif.soap.devices.InitialDevices;
import de.onvif.soap.devices.MediaDevices;
import de.onvif.soap.devices.PtzDevices;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.function.Consumer;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import lombok.val;
import org.apache.commons.codec.binary.Base64;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.onvif.ver10.schema.Capabilities;
import org.onvif.ver10.schema.Profile;
import org.onvif.ver10.schema.VideoResolution;

@Getter
@Log4j2
public class OnvifDeviceState {

    private final @NotNull SOAP soap;
    private final @NotNull InitialDevices initialDevices;
    private final @NotNull PtzDevices ptzDevices;
    private final @NotNull MediaDevices mediaDevices;
    private final @NotNull ImagingDevices imagingDevices;
    private final @NotNull EventDevices eventDevices;
    private final @NotNull String entityID;
    private String HOST_IP;
    private String originalIp;
    private boolean isProxy;
    @Getter private String username, password, nonce, utcTime;
    private OnvifUrl serverDeviceUri;
    private OnvifUrl serverPtzUri;
    private OnvifUrl serverMediaUri;
    private OnvifUrl serverImagingUri;
    private OnvifUrl serverEventsUri;
    private OnvifUrl analyticsUri;
    private String subscriptionIpLessUri;
    private List<Profile> profiles;
    private String ip;
    private int onvifPort;
    @Setter
    private Consumer<String> unreachableHandler;
    private Capabilities capabilities;
    private String subscriptionError;
    private boolean initialized;

    @Setter
    private @Nullable Runnable updateListener;

    @SneakyThrows
    public OnvifDeviceState(@NotNull String entityID) {
        this.entityID = entityID;
        this.soap = new SOAP(this);
        this.initialDevices = new InitialDevices(this, soap);
        this.ptzDevices = new PtzDevices(this, soap);
        this.mediaDevices = new MediaDevices(this, soap);
        this.imagingDevices = new ImagingDevices(this, soap);
        this.eventDevices = new EventDevices(entityID, this, soap);
    }

    private static byte[] sha1(String s) throws NoSuchAlgorithmException {
        MessageDigest SHA1;
        SHA1 = MessageDigest.getInstance("SHA1");

        SHA1.reset();
        SHA1.update(s.getBytes());

        return SHA1.digest();
    }

    public void setSubscriptionError(String subscriptionError) {
        this.subscriptionError = subscriptionError;
        if (updateListener != null) {
            updateListener.run();
        }
    }

    public void updateParameters(String ip, int onvifPort, String user, String password) {
        this.ip = ip;
        this.onvifPort = onvifPort;
        this.HOST_IP = ip + ":" + onvifPort;
        this.serverDeviceUri = new OnvifUrl("http://%s/onvif/device_service".formatted(HOST_IP));
        this.username = user;
        this.password = password;
    }

    @SneakyThrows
    public void initFully() {
        if (initialized) {
            return;
        }
        this.init();
        this.profiles = initialDevices.getProfiles();

        if (ptzDevices.supportPTZ() && !profiles.isEmpty()) {
            Profile profile = profiles.stream()
                                      .filter(p -> p.getName().toLowerCase().contains("main"))
                                      .findAny()
                                      .orElse(profiles.get(0));
            ptzDevices.initFully(profile);
        }

        initialized = true;
    }

    public void dispose() {
        imagingDevices.dispose();
        eventDevices.dispose();
        initialDevices.dispose();
        mediaDevices.dispose();
        ptzDevices.dispose();
        soap.dispose();
    }

    public String replaceLocalIpWithProxyIp(String original) {
        if (original.startsWith("http:///")) {
            original = original.replace("http:///", "http://" + HOST_IP);
        }

        if (isProxy) {
            return original.replace(originalIp, HOST_IP);
        }
        return original;
    }

    public String getEncryptedPassword() {
        return encryptPassword();
    }

    /**
     * Returns encrypted version of given password like algorithm like in WS-UsernameToken
     */
    public String encryptPassword() {
        String nonce = getNonce();
        String timestamp = getUTCTime();

        String beforeEncryption = nonce + timestamp + password;

        byte[] encryptedRaw;
        try {
            encryptedRaw = sha1(beforeEncryption);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
        return Base64.encodeBase64String(encryptedRaw);
    }

    public String getEncryptedNonce() {
        if (nonce == null) {
            createNonce();
        }
        return Base64.encodeBase64String(nonce.getBytes());
    }

    public void createNonce() {
        Random generator = new Random();
        nonce = String.valueOf(generator.nextInt());
    }

    public String getLastUTCTime() {
        return utcTime;
    }

    public String getUTCTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-d'T'HH:mm:ss'Z'");
        sdf.setTimeZone(new SimpleTimeZone(SimpleTimeZone.UTC_TIME, "UTC"));

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        String utcTime = sdf.format(cal.getTime());
        this.utcTime = utcTime;
        return utcTime;
    }

    public String getIEEEAddress(boolean muteError) {
        try {
            init();
            val di = initialDevices.getDeviceInformation();
            return defaultIfEmpty(di.getSerialNumber(), defaultIfEmpty(di.getHardwareId(), HOST_IP));
        } catch (Exception ex) {
            if (muteError) {
                // in case of auth this method may throw exception
                return null;
            }
            throw ex;
        }
    }

  /*public Date getDate() {
      init();
      return initialDevices.getDate();
  }*/

    public void cameraUnreachable(String errorMessage) {
        log.error("[{}]: Camera unreachable: <{}>", entityID, errorMessage);
        if (unreachableHandler != null) {
            unreachableHandler.accept(errorMessage);
        }
    }

  /*public String getHostname() {
      return initialDevices.getHostname();
  }*/

    public void setSubscriptionUri(String subscriptionUri) {
        this.subscriptionIpLessUri = SOAP.removeIpFromUrl(subscriptionUri);
    }

    /**
     * Initalizes the addresses used for SOAP messages and to get the internal IP, if given IP is a proxy.
     */
    @SneakyThrows
    private void init() {
        if (this.capabilities == null) {
            try {
                fullInit();
            } catch (Exception ex) {
                this.capabilities = null;
                throw ex;
            }
        }
    }

    private void fullInit() throws ConnectException, MalformedURLException {
        this.capabilities = initialDevices.getCapabilities();

        if (capabilities == null) {
            throw new ConnectException("Capabilities not reachable.");
        }

        String localDeviceUri = capabilities.getDevice().getXAddr();

        if (localDeviceUri.startsWith("http://")) {
            URL localUrl = new URL(localDeviceUri);
            originalIp = localUrl.getHost() + ":" + (localUrl.getPort() == -1 ? 80 : localUrl.getPort());
        } else {
            throw new RuntimeException("Unknown/Not implemented local protocol");
        }

        if (!originalIp.equals(HOST_IP)) {
            isProxy = true;
        }

        if (capabilities.getMedia() != null && capabilities.getMedia().getXAddr() != null) {
            serverMediaUri = new OnvifUrl(replaceLocalIpWithProxyIp(capabilities.getMedia().getXAddr()));
        }

        if (capabilities.getPtz() != null && capabilities.getPtz().getXAddr() != null) {
            serverPtzUri = new OnvifUrl(replaceLocalIpWithProxyIp(capabilities.getPtz().getXAddr()));
        }

        if (capabilities.getImaging() != null && capabilities.getImaging().getXAddr() != null) {
            serverImagingUri = new OnvifUrl(replaceLocalIpWithProxyIp(capabilities.getImaging().getXAddr()));
        }

        if (capabilities.getMedia() != null && capabilities.getEvents().getXAddr() != null) {
            serverEventsUri = new OnvifUrl(replaceLocalIpWithProxyIp(capabilities.getEvents().getXAddr()));
        }

        if (capabilities.getAnalytics() != null && capabilities.getAnalytics().getXAddr() != null) {
            analyticsUri = new OnvifUrl(replaceLocalIpWithProxyIp(capabilities.getAnalytics().getXAddr()));
        }
    }

    private String getNonce() {
        if (nonce == null) {
            createNonce();
        }
        return nonce;
    }

    @EqualsAndHashCode
    private static class VideoEncodeResolution implements Comparable<VideoEncodeResolution> {

        private final int width;
        private final int height;

        public VideoEncodeResolution(VideoResolution resolution) {
            this.width = resolution.getWidth();
            this.height = resolution.getHeight();
        }

        @Override
        public int compareTo(@NotNull OnvifDeviceState.VideoEncodeResolution o) {
            return Integer.compare(width + height, o.width + o.height);
        }
    }

    public static String defaultIfEmpty(String value, String defaultValue) {
        return value == null || value.isEmpty() ? defaultValue : value;
    }
}
