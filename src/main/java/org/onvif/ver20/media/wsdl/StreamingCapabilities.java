package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "StreamingCapabilities",
        propOrder = {"any"})
public class StreamingCapabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    @XmlAttribute(name = "RTSPStreaming")
    protected Boolean rtspStreaming;

    @XmlAttribute(name = "RTPMulticast")
    protected Boolean rtpMulticast;

    @XmlAttribute(name = "RTP_RTSP_TCP")
    protected Boolean rtprtsptcp;

    @XmlAttribute(name = "NonAggregateControl")
    protected Boolean nonAggregateControl;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    public Boolean isRTSPStreaming() {
        return rtspStreaming;
    }

    public void setRTSPStreaming(Boolean value) {
        this.rtspStreaming = value;
    }

    public Boolean isRTPMulticast() {
        return rtpMulticast;
    }

    public void setRTPMulticast(Boolean value) {
        this.rtpMulticast = value;
    }

    public Boolean isRTPRTSPTCP() {
        return rtprtsptcp;
    }

    public void setRTPRTSPTCP(Boolean value) {
        this.rtprtsptcp = value;
    }

    public Boolean isNonAggregateControl() {
        return nonAggregateControl;
    }

    public void setNonAggregateControl(Boolean value) {
        this.nonAggregateControl = value;
    }
}
