
package org.onvif.ver10.media.wsdl;

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

    @XmlAttribute(name = "RTPMulticast")
    protected Boolean rtpMulticast;

    @XmlAttribute(name = "RTP_TCP")
    protected Boolean rtptcp;

    @XmlAttribute(name = "RTP_RTSP_TCP")
    protected Boolean rtprtsptcp;

    @XmlAttribute(name = "NonAggregateControl")
    protected Boolean nonAggregateControl;

    @XmlAttribute(name = "NoRTSPStreaming")
    protected Boolean noRTSPStreaming;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

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

    public Boolean isNonAggregateControl() {
        return nonAggregateControl;
    }

    public void setNonAggregateControl(Boolean value) {
        this.nonAggregateControl = value;
    }

    public Boolean isNoRTSPStreaming() {
        return noRTSPStreaming;
    }

    public void setNoRTSPStreaming(Boolean value) {
        this.noRTSPStreaming = value;
    }
}
