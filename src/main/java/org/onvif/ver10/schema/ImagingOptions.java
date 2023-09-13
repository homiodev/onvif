package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
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
        name = "ImagingOptions",
        propOrder = {
                "backlightCompensation",
                "brightness",
                "colorSaturation",
                "contrast",
                "exposure",
                "focus",
                "irCutFilterModes",
                "sharpness",
                "wideDynamicRange",
                "whiteBalance",
                "any"
        })
public class ImagingOptions {

    @XmlElement(name = "BacklightCompensation", required = true)
    protected BacklightCompensationOptions backlightCompensation;

    @Getter @XmlElement(name = "Brightness", required = true)
    protected FloatRange brightness;

    @Getter @XmlElement(name = "ColorSaturation", required = true)
    protected FloatRange colorSaturation;

    @Getter @XmlElement(name = "Contrast", required = true)
    protected FloatRange contrast;

    @Getter @XmlElement(name = "Exposure", required = true)
    protected ExposureOptions exposure;

    @Getter @XmlElement(name = "Focus", required = true)
    protected FocusOptions focus;

    @XmlElement(name = "IrCutFilterModes", required = true)
    protected List<IrCutFilterMode> irCutFilterModes;

    @Getter @XmlElement(name = "Sharpness", required = true)
    protected FloatRange sharpness;

    @Getter @XmlElement(name = "WideDynamicRange", required = true)
    protected WideDynamicRangeOptions wideDynamicRange;

    @Getter @XmlElement(name = "WhiteBalance", required = true)
    protected WhiteBalanceOptions whiteBalance;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setBacklightCompensation(BacklightCompensationOptions value) {
        this.backlightCompensation = value;
    }

    public void setBrightness(FloatRange value) {
        this.brightness = value;
    }

    public void setColorSaturation(FloatRange value) {
        this.colorSaturation = value;
    }

    public void setContrast(FloatRange value) {
        this.contrast = value;
    }

    public void setExposure(ExposureOptions value) {
        this.exposure = value;
    }

    public void setFocus(FocusOptions value) {
        this.focus = value;
    }

    public List<IrCutFilterMode> getIrCutFilterModes() {
        if (irCutFilterModes == null) {
            irCutFilterModes = new ArrayList<IrCutFilterMode>();
        }
        return this.irCutFilterModes;
    }

    public void setSharpness(FloatRange value) {
        this.sharpness = value;
    }

    public void setWideDynamicRange(WideDynamicRangeOptions value) {
        this.wideDynamicRange = value;
    }

    public void setWhiteBalance(WhiteBalanceOptions value) {
        this.whiteBalance = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
