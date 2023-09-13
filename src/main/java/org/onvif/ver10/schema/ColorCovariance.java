package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorCovariance")
public class ColorCovariance {

    @XmlAttribute(name = "XX", required = true)
    protected float xx;

    @XmlAttribute(name = "YY", required = true)
    protected float yy;

    @XmlAttribute(name = "ZZ", required = true)
    protected float zz;

    @XmlAttribute(name = "XY")
    protected Float xy;

    @XmlAttribute(name = "XZ")
    protected Float xz;

    @XmlAttribute(name = "YZ")
    protected Float yz;

    @Getter @XmlAttribute(name = "Colorspace")
    @XmlSchemaType(name = "anyURI")
    protected String colorspace;

    public float getXX() {
        return xx;
    }

    public void setXX(float value) {
        this.xx = value;
    }

    public float getYY() {
        return yy;
    }

    public void setYY(float value) {
        this.yy = value;
    }

    public float getZZ() {
        return zz;
    }

    public void setZZ(float value) {
        this.zz = value;
    }

    public Float getXY() {
        return xy;
    }

    public void setXY(Float value) {
        this.xy = value;
    }

    public Float getXZ() {
        return xz;
    }

    public void setXZ(Float value) {
        this.xz = value;
    }

    public Float getYZ() {
        return yz;
    }

    public void setYZ(Float value) {
        this.yz = value;
    }

    public void setColorspace(String value) {
        this.colorspace = value;
    }
}
