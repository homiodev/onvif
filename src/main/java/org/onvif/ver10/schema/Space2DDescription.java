package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Space2DDescription",
        propOrder = {"uri", "xRange", "yRange"})
public class Space2DDescription {

    @XmlElement(name = "URI", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    @XmlElement(name = "XRange", required = true)
    protected FloatRange xRange;

    @XmlElement(name = "YRange", required = true)
    protected FloatRange yRange;

    public String getURI() {
        return uri;
    }

    public void setURI(String value) {
        this.uri = value;
    }

    public FloatRange getXRange() {
        return xRange;
    }

    public void setXRange(FloatRange value) {
        this.xRange = value;
    }

    public FloatRange getYRange() {
        return yRange;
    }

    public void setYRange(FloatRange value) {
        this.yRange = value;
    }
}
