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

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "VideoOutput",
        propOrder = {"layout", "resolution", "refreshRate", "aspectRatio", "extension"})
public class VideoOutput extends DeviceEntity {

    @XmlElement(name = "Layout", required = true)
    protected Layout layout;

    @XmlElement(name = "Resolution")
    protected VideoResolution resolution;

    @XmlElement(name = "RefreshRate")
    protected Float refreshRate;

    @XmlElement(name = "AspectRatio")
    protected Float aspectRatio;

    @XmlElement(name = "Extension")
    protected VideoOutputExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setLayout(Layout value) {
        this.layout = value;
    }

    public void setResolution(VideoResolution value) {
        this.resolution = value;
    }

    public void setRefreshRate(Float value) {
        this.refreshRate = value;
    }

    public void setAspectRatio(Float value) {
        this.aspectRatio = value;
    }

    public void setExtension(VideoOutputExtension value) {
        this.extension = value;
    }
}
