package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PanTiltLimits",
        propOrder = {"range"})
public class PanTiltLimits {

    @XmlElement(name = "Range", required = true)
    protected Space2DDescription range;

    public void setRange(Space2DDescription value) {
        this.range = value;
    }
}
