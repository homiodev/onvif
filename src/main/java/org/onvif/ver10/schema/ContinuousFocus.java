package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ContinuousFocus",
        propOrder = {"speed"})
public class ContinuousFocus {

    @XmlElement(name = "Speed")
    protected float speed;

    public void setSpeed(float value) {
        this.speed = value;
    }
}
