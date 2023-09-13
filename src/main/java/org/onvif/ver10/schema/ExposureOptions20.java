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
        name = "ExposureOptions20",
        propOrder = {
                "mode",
                "priority",
                "minExposureTime",
                "maxExposureTime",
                "minGain",
                "maxGain",
                "minIris",
                "maxIris",
                "exposureTime",
                "gain",
                "iris"
        })
public class ExposureOptions20 {

    @XmlElement(name = "Mode", required = true)
    protected List<ExposureMode> mode;

    @XmlElement(name = "Priority")
    protected List<ExposurePriority> priority;

    @Getter @XmlElement(name = "MinExposureTime")
    protected FloatRange minExposureTime;

    @Getter @XmlElement(name = "MaxExposureTime")
    protected FloatRange maxExposureTime;

    @Getter @XmlElement(name = "MinGain")
    protected FloatRange minGain;

    @Getter @XmlElement(name = "MaxGain")
    protected FloatRange maxGain;

    @Getter @XmlElement(name = "MinIris")
    protected FloatRange minIris;

    @Getter @XmlElement(name = "MaxIris")
    protected FloatRange maxIris;

    @Getter @XmlElement(name = "ExposureTime")
    protected FloatRange exposureTime;

    @Getter @XmlElement(name = "Gain")
    protected FloatRange gain;

    @Getter @XmlElement(name = "Iris")
    protected FloatRange iris;

    public List<ExposureMode> getMode() {
        if (mode == null) {
            mode = new ArrayList<ExposureMode>();
        }
        return this.mode;
    }

    public List<ExposurePriority> getPriority() {
        if (priority == null) {
            priority = new ArrayList<ExposurePriority>();
        }
        return this.priority;
    }

    public void setMinExposureTime(FloatRange value) {
        this.minExposureTime = value;
    }

    public void setMaxExposureTime(FloatRange value) {
        this.maxExposureTime = value;
    }

    public void setMinGain(FloatRange value) {
        this.minGain = value;
    }

    public void setMaxGain(FloatRange value) {
        this.maxGain = value;
    }

    public void setMinIris(FloatRange value) {
        this.minIris = value;
    }

    public void setMaxIris(FloatRange value) {
        this.maxIris = value;
    }

    public void setExposureTime(FloatRange value) {
        this.exposureTime = value;
    }

    public void setGain(FloatRange value) {
        this.gain = value;
    }

    public void setIris(FloatRange value) {
        this.iris = value;
    }
}
