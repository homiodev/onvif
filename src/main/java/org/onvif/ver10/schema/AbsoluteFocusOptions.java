package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "AbsoluteFocusOptions",
        propOrder = {"position", "speed"})
public class AbsoluteFocusOptions {

    @XmlElement(name = "Position", required = true)
    protected FloatRange position;

    @XmlElement(name = "Speed")
    protected FloatRange speed;
}
