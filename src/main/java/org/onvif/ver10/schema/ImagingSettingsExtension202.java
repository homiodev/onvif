package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ImagingSettingsExtension202",
        propOrder = {"irCutFilterAutoAdjustment", "extension"})
public class ImagingSettingsExtension202 {

    @XmlElement(name = "IrCutFilterAutoAdjustment")
    protected List<IrCutFilterAutoAdjustment> irCutFilterAutoAdjustment;

    @Getter @XmlElement(name = "Extension")
    protected ImagingSettingsExtension203 extension;

    public List<IrCutFilterAutoAdjustment> getIrCutFilterAutoAdjustment() {
        if (irCutFilterAutoAdjustment == null) {
            irCutFilterAutoAdjustment = new ArrayList<IrCutFilterAutoAdjustment>();
        }
        return this.irCutFilterAutoAdjustment;
    }

    public void setExtension(ImagingSettingsExtension203 value) {
        this.extension = value;
    }
}
