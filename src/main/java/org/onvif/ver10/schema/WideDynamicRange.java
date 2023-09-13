package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "WideDynamicRange",
        propOrder = {"mode", "level"})
public class WideDynamicRange {

    @XmlElement(name = "Mode", required = true)
    protected WideDynamicMode mode;

    @XmlElement(name = "Level")
    protected float level;
}
