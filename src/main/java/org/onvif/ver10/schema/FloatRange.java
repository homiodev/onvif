package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FloatRange",
        propOrder = {"min", "max"})
public class FloatRange {

    @XmlElement(name = "Min")
    protected float min;

    @XmlElement(name = "Max")
    protected float max;
}
