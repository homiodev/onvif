package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Capabilities2",
        propOrder = {"profileCapabilities", "streamingCapabilities", "any"})
public class Capabilities2 {

    @XmlElement(name = "ProfileCapabilities", required = true)
    protected ProfileCapabilities profileCapabilities;

    @Getter @XmlElement(name = "StreamingCapabilities", required = true)
    protected StreamingCapabilities streamingCapabilities;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    @XmlAttribute(name = "SnapshotUri")
    protected Boolean snapshotUri;

    @XmlAttribute(name = "Rotation")
    protected Boolean rotation;

    @XmlAttribute(name = "VideoSourceMode")
    protected Boolean videoSourceMode;

    @XmlAttribute(name = "OSD")
    protected Boolean osd;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setProfileCapabilities(ProfileCapabilities value) {
        this.profileCapabilities = value;
    }

    public void setStreamingCapabilities(StreamingCapabilities value) {
        this.streamingCapabilities = value;
    }

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    public Boolean isSnapshotUri() {
        return snapshotUri;
    }

    public void setSnapshotUri(Boolean value) {
        this.snapshotUri = value;
    }

    public Boolean isRotation() {
        return rotation;
    }

    public void setRotation(Boolean value) {
        this.rotation = value;
    }

    public Boolean isVideoSourceMode() {
        return videoSourceMode;
    }

    public void setVideoSourceMode(Boolean value) {
        this.videoSourceMode = value;
    }

    public Boolean isOSD() {
        return osd;
    }

    public void setOSD(Boolean value) {
        this.osd = value;
    }
}
