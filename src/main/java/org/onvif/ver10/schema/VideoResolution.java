package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "VideoResolution",
        propOrder = {"width", "height"})
public class VideoResolution {

    @XmlElement(name = "Width")
    protected int width;

    @XmlElement(name = "Height")
    protected int height;

    public void setWidth(int value) {
        this.width = value;
    }

    public void setHeight(int value) {
        this.height = value;
    }

    @Override
    public String toString() {
        return width + "x" + height;
    }
}
