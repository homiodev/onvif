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
        name = "ImagingSettings",
        propOrder = {
                "backlightCompensation",
                "brightness",
                "colorSaturation",
                "contrast",
                "exposure",
                "focus",
                "irCutFilter",
                "sharpness",
                "wideDynamicRange",
                "whiteBalance",
                "extension"
        })
public class ImagingSettings {

    @XmlElement(name = "BacklightCompensation")
    protected BacklightCompensation backlightCompensation;

    @XmlElement(name = "Brightness")
    protected Float brightness;

    @XmlElement(name = "ColorSaturation")
    protected Float colorSaturation;

    @XmlElement(name = "Contrast")
    protected Float contrast;

    @XmlElement(name = "Exposure")
    protected Exposure exposure;

    @XmlElement(name = "Focus")
    protected FocusConfiguration focus;

    @XmlElement(name = "IrCutFilter")
    protected IrCutFilterMode irCutFilter;

    @XmlElement(name = "Sharpness")
    protected Float sharpness;

    @XmlElement(name = "WideDynamicRange")
    protected WideDynamicRange wideDynamicRange;

    @XmlElement(name = "WhiteBalance")
    protected WhiteBalance whiteBalance;

    @XmlElement(name = "Extension")
    protected ImagingSettingsExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setBacklightCompensation(BacklightCompensation value) {
        this.backlightCompensation = value;
    }

    public void setBrightness(Float value) {
        this.brightness = value;
    }

    public void setColorSaturation(Float value) {
        this.colorSaturation = value;
    }

    public void setContrast(Float value) {
        this.contrast = value;
    }

    public void setExposure(Exposure value) {
        this.exposure = value;
    }

    public void setFocus(FocusConfiguration value) {
        this.focus = value;
    }

    public void setIrCutFilter(IrCutFilterMode value) {
        this.irCutFilter = value;
    }

    public void setSharpness(Float value) {
        this.sharpness = value;
    }

    public void setWideDynamicRange(WideDynamicRange value) {
        this.wideDynamicRange = value;
    }

    public void setWhiteBalance(WhiteBalance value) {
        this.whiteBalance = value;
    }

    public void setExtension(ImagingSettingsExtension value) {
        this.extension = value;
    }
}
