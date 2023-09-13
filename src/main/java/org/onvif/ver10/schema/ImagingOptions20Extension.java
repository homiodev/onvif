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
        name = "ImagingOptions20Extension",
        propOrder = {"any", "imageStabilization", "extension"})
public class ImagingOptions20Extension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlElement(name = "ImageStabilization")
    protected ImageStabilizationOptions imageStabilization;

    @Getter @XmlElement(name = "Extension")
    protected ImagingOptions20Extension2 extension;

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public void setImageStabilization(ImageStabilizationOptions value) {
        this.imageStabilization = value;
    }

    public void setExtension(ImagingOptions20Extension2 value) {
        this.extension = value;
    }
}
