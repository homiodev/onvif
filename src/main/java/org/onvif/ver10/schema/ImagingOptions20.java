package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
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
        name = "ImagingOptions20",
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
                "extension"
        })
public class ImagingOptions20 {

    @XmlElement(name = "BacklightCompensation")
    protected BacklightCompensationOptions20 backlightCompensation;

    @Getter @XmlElement(name = "Brightness")
    protected FloatRange brightness;

    @Getter @XmlElement(name = "ColorSaturation")
    protected FloatRange colorSaturation;

    @Getter @XmlElement(name = "Contrast")
    protected FloatRange contrast;

    @Getter @XmlElement(name = "Exposure")
    protected ExposureOptions20 exposure;

    @Getter @XmlElement(name = "Focus")
    protected FocusOptions20 focus;

    @XmlElement(name = "IrCutFilterModes")
    protected List<IrCutFilterMode> irCutFilterModes;

    @Getter @XmlElement(name = "Sharpness")
    protected FloatRange sharpness;

    @Getter @XmlElement(name = "WideDynamicRange")
    protected WideDynamicRangeOptions20 wideDynamicRange;

    @Getter @XmlElement(name = "WhiteBalance")
    protected WhiteBalanceOptions20 whiteBalance;

    @Getter @XmlElement(name = "Extension")
    protected ImagingOptions20Extension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setBacklightCompensation(BacklightCompensationOptions20 value) {
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

    public void setExposure(ExposureOptions20 value) {
        this.exposure = value;
    }

    public void setFocus(FocusOptions20 value) {
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

    public void setWideDynamicRange(WideDynamicRangeOptions20 value) {
        this.wideDynamicRange = value;
    }

    public void setWhiteBalance(WhiteBalanceOptions20 value) {
        this.whiteBalance = value;
    }

    public void setExtension(ImagingOptions20Extension value) {
        this.extension = value;
    }
}
