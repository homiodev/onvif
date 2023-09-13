package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "BacklightCompensation20",
        propOrder = {"mode", "level"})
public class BacklightCompensation20 {

    @XmlElement(name = "Mode", required = true)
    protected BacklightCompensationMode mode;

    @XmlElement(name = "Level")
    protected Float level;

    public void setMode(BacklightCompensationMode value) {
        this.mode = value;
    }

    public void setLevel(Float value) {
        this.level = value;
    }
}
