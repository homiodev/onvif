package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "RelativeFocusOptions20",
        propOrder = {"distance", "speed"})
public class RelativeFocusOptions20 {

    @XmlElement(name = "Distance", required = true)
    protected FloatRange distance;

    @XmlElement(name = "Speed")
    protected FloatRange speed;

    public void setDistance(FloatRange value) {
        this.distance = value;
    }

    public void setSpeed(FloatRange value) {
        this.speed = value;
    }
}
