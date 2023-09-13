package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Space1DDescription",
        propOrder = {"uri", "xRange"})
public class Space1DDescription {

    @XmlElement(name = "URI", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    @XmlElement(name = "XRange", required = true)
    protected FloatRange xRange;

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
}
