package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "IntRange",
        propOrder = {"min", "max"})
public class IntRange {

    @XmlElement(name = "Min")
    protected int min;

    @XmlElement(name = "Max")
    protected int max;

    public void setMin(int value) {
        this.min = value;
    }

    public void setMax(int value) {
        this.max = value;
    }
}
