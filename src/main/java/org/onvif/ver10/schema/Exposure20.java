package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Exposure20",
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
public class Exposure20 {

    @XmlElement(name = "Mode", required = true)
    protected ExposureMode mode;

    @XmlElement(name = "Priority")
    protected ExposurePriority priority;

    @XmlElement(name = "Window")
    protected Rectangle window;

    @XmlElement(name = "MinExposureTime")
    protected Float minExposureTime;

    @XmlElement(name = "MaxExposureTime")
    protected Float maxExposureTime;

    @XmlElement(name = "MinGain")
    protected Float minGain;

    @XmlElement(name = "MaxGain")
    protected Float maxGain;

    @XmlElement(name = "MinIris")
    protected Float minIris;

    @XmlElement(name = "MaxIris")
    protected Float maxIris;

    @XmlElement(name = "ExposureTime")
    protected Float exposureTime;

    @XmlElement(name = "Gain")
    protected Float gain;

    @XmlElement(name = "Iris")
    protected Float iris;

    public void setMode(ExposureMode value) {
        this.mode = value;
    }

    public void setPriority(ExposurePriority value) {
        this.priority = value;
    }

    public void setWindow(Rectangle value) {
        this.window = value;
    }

    public void setMinExposureTime(Float value) {
        this.minExposureTime = value;
    }

    public void setMaxExposureTime(Float value) {
        this.maxExposureTime = value;
    }

    public void setMinGain(Float value) {
        this.minGain = value;
    }

    public void setMaxGain(Float value) {
        this.maxGain = value;
    }

    public void setMinIris(Float value) {
        this.minIris = value;
    }

    public void setMaxIris(Float value) {
        this.maxIris = value;
    }

    public void setExposureTime(Float value) {
        this.exposureTime = value;
    }

    public void setGain(Float value) {
        this.gain = value;
    }

    public void setIris(Float value) {
        this.iris = value;
    }
}
