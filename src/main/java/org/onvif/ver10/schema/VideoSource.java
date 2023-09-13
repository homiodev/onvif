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
        name = "VideoSource",
        propOrder = {"framerate", "resolution", "imaging", "extension"})
public class VideoSource extends DeviceEntity {

    @XmlElement(name = "Framerate")
    protected float framerate;

    @XmlElement(name = "Resolution", required = true)
    protected VideoResolution resolution;

    @XmlElement(name = "Imaging")
    protected ImagingSettings imaging;

    @XmlElement(name = "Extension")
    protected VideoSourceExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setFramerate(float value) {
        this.framerate = value;
    }

    public void setResolution(VideoResolution value) {
        this.resolution = value;
    }

    public void setImaging(ImagingSettings value) {
        this.imaging = value;
    }

    public void setExtension(VideoSourceExtension value) {
        this.extension = value;
    }
}
