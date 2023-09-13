package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "RelativeFocus",
        propOrder = {"distance", "speed"})
public class RelativeFocus {

    @XmlElement(name = "Distance")
    protected float distance;

    @XmlElement(name = "Speed")
    protected Float speed;

    public void setDistance(float value) {
        this.distance = value;
    }

    public void setSpeed(Float value) {
        this.speed = value;
    }
}
