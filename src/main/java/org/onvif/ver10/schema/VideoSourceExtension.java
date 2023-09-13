package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "VideoSourceExtension",
        propOrder = {"any", "imaging", "extension"})
public class VideoSourceExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlElement(name = "Imaging")
    protected ImagingSettings20 imaging;

    @Getter @XmlElement(name = "Extension")
    protected VideoSourceExtension2 extension;

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public void setImaging(ImagingSettings20 value) {
        this.imaging = value;
    }

    public void setExtension(VideoSourceExtension2 value) {
        this.extension = value;
    }
}
