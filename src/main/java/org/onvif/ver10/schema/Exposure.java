package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Exposure",
        propOrder = {
                "mode",
                "priority",
                "window",
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
public class Exposure {

    @XmlElement(name = "Mode", required = true)
    protected ExposureMode mode;

    @XmlElement(name = "Priority", required = true)
    protected ExposurePriority priority;

    @XmlElement(name = "Window", required = true)
    protected Rectangle window;

    @XmlElement(name = "MinExposureTime")
    protected float minExposureTime;

    @XmlElement(name = "MaxExposureTime")
    protected float maxExposureTime;

    @XmlElement(name = "MinGain")
    protected float minGain;

    @XmlElement(name = "MaxGain")
    protected float maxGain;

    @XmlElement(name = "MinIris")
    protected float minIris;

    @XmlElement(name = "MaxIris")
    protected float maxIris;

    @XmlElement(name = "ExposureTime")
    protected float exposureTime;

    @XmlElement(name = "Gain")
    protected float gain;

    @XmlElement(name = "Iris")
    protected float iris;

    public void setMode(ExposureMode value) {
        this.mode = value;
    }

    public void setPriority(ExposurePriority value) {
        this.priority = value;
    }

    public void setWindow(Rectangle value) {
        this.window = value;
    }

    public void setMinExposureTime(float value) {
        this.minExposureTime = value;
    }

    public void setMaxExposureTime(float value) {
        this.maxExposureTime = value;
    }

    public void setMinGain(float value) {
        this.minGain = value;
    }

    public void setMaxGain(float value) {
        this.maxGain = value;
    }

    public void setMinIris(float value) {
        this.minIris = value;
    }

    public void setMaxIris(float value) {
        this.maxIris = value;
    }

    public void setExposureTime(float value) {
        this.exposureTime = value;
    }

    public void setGain(float value) {
        this.gain = value;
    }

    public void setIris(float value) {
        this.iris = value;
    }
}
