package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "VideoRateControl",
        propOrder = {"frameRateLimit", "encodingInterval", "bitrateLimit"})
public class VideoRateControl {

    @XmlElement(name = "FrameRateLimit")
    protected int frameRateLimit;

    @XmlElement(name = "EncodingInterval")
    protected int encodingInterval;

    @XmlElement(name = "BitrateLimit")
    protected int bitrateLimit;

    public void setFrameRateLimit(int value) {
        this.frameRateLimit = value;
    }

    public void setEncodingInterval(int value) {
        this.encodingInterval = value;
    }

    public void setBitrateLimit(int value) {
        this.bitrateLimit = value;
    }
}
