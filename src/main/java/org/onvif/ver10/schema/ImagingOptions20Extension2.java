package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ImagingOptions20Extension2",
        propOrder = {"irCutFilterAutoAdjustment", "extension"})
public class ImagingOptions20Extension2 {

    @XmlElement(name = "IrCutFilterAutoAdjustment")
    protected IrCutFilterAutoAdjustmentOptions irCutFilterAutoAdjustment;

    @XmlElement(name = "Extension")
    protected ImagingOptions20Extension3 extension;

    public void setIrCutFilterAutoAdjustment(IrCutFilterAutoAdjustmentOptions value) {
        this.irCutFilterAutoAdjustment = value;
    }

    public void setExtension(ImagingOptions20Extension3 value) {
        this.extension = value;
    }
}
