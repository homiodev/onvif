package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ContinuousFocusOptions",
        propOrder = {"speed"})
public class ContinuousFocusOptions {

    @XmlElement(name = "Speed", required = true)
    protected FloatRange speed;

    public void setSpeed(FloatRange value) {
        this.speed = value;
    }
}
