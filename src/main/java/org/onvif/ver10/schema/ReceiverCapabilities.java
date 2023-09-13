package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ReceiverCapabilities",
        propOrder = {
                "xAddr",
                "rtpMulticast",
                "rtptcp",
                "rtprtsptcp",
                "supportedReceivers",
                "maximumRTSPURILength",
                "any"
        })
public class ReceiverCapabilities {

    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;

    @XmlElement(name = "RTP_Multicast")
    protected boolean rtpMulticast;

    @XmlElement(name = "RTP_TCP")
    protected boolean rtptcp;

    @XmlElement(name = "RTP_RTSP_TCP")
    protected boolean rtprtsptcp;

    @Getter @XmlElement(name = "SupportedReceivers")
    protected int supportedReceivers;

    @Getter @XmlElement(name = "MaximumRTSPURILength")
    protected int maximumRTSPURILength;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public String getXAddr() {
        return xAddr;
    }

    public void setXAddr(String value) {
        this.xAddr = value;
    }

    public boolean isRTPMulticast() {
        return rtpMulticast;
    }

    public void setRTPMulticast(boolean value) {
        this.rtpMulticast = value;
    }

    public boolean isRTPTCP() {
        return rtptcp;
    }

    public void setRTPTCP(boolean value) {
        this.rtptcp = value;
    }

    public boolean isRTPRTSPTCP() {
        return rtprtsptcp;
    }

    public void setRTPRTSPTCP(boolean value) {
        this.rtprtsptcp = value;
    }

    public void setSupportedReceivers(int value) {
        this.supportedReceivers = value;
    }

    public void setMaximumRTSPURILength(int value) {
        this.maximumRTSPURILength = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
