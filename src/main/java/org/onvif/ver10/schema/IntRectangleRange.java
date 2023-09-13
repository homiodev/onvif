package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "IntRectangleRange",
        propOrder = {"xRange", "yRange", "widthRange", "heightRange"})
public class IntRectangleRange {

    @XmlElement(name = "XRange", required = true)
    protected IntRange xRange;

    @XmlElement(name = "YRange", required = true)
    protected IntRange yRange;

    @Getter @XmlElement(name = "WidthRange", required = true)
    protected IntRange widthRange;

    @Getter @XmlElement(name = "HeightRange", required = true)
    protected IntRange heightRange;

    public IntRange getXRange() {
        return xRange;
    }

    public void setXRange(IntRange value) {
        this.xRange = value;
    }

    public IntRange getYRange() {
        return yRange;
    }

    public void setYRange(IntRange value) {
        this.yRange = value;
    }

    public void setWidthRange(IntRange value) {
        this.widthRange = value;
    }

    public void setHeightRange(IntRange value) {
        this.heightRange = value;
    }
}
