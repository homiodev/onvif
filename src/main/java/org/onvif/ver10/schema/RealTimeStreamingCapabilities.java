package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "RealTimeStreamingCapabilities",
        propOrder = {"rtpMulticast", "rtptcp", "rtprtsptcp", "extension"})
public class RealTimeStreamingCapabilities {

    @XmlElement(name = "RTPMulticast")
    protected Boolean rtpMulticast;

    @XmlElement(name = "RTP_TCP")
    protected Boolean rtptcp;

    @XmlElement(name = "RTP_RTSP_TCP")
    protected Boolean rtprtsptcp;

    @Getter @XmlElement(name = "Extension")
    protected RealTimeStreamingCapabilitiesExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public Boolean isRTPMulticast() {
        return rtpMulticast;
    }

    public void setRTPMulticast(Boolean value) {
        this.rtpMulticast = value;
    }

    public Boolean isRTPTCP() {
        return rtptcp;
    }

    public void setRTPTCP(Boolean value) {
        this.rtptcp = value;
    }

    public Boolean isRTPRTSPTCP() {
        return rtprtsptcp;
    }

    public void setRTPRTSPTCP(Boolean value) {
        this.rtprtsptcp = value;
    }

    public void setExtension(RealTimeStreamingCapabilitiesExtension value) {
        this.extension = value;
    }
}
