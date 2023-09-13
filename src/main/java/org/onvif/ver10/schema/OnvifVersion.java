package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "OnvifVersion",
        propOrder = {"major", "minor"})
public class OnvifVersion {

    @XmlElement(name = "Major")
    protected int major;

    @XmlElement(name = "Minor")
    protected int minor;

    public void setMajor(int value) {
        this.major = value;
    }

    public void setMinor(int value) {
        this.minor = value;
    }
}
