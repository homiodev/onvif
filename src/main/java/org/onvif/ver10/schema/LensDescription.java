package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "LensDescription",
        propOrder = {"offset", "projection", "xFactor", "any"})
public class LensDescription {

    @XmlElement(name = "Offset", required = true)
    protected LensOffset offset;

    @XmlElement(name = "Projection", required = true)
    protected List<LensProjection> projection;

    @XmlElement(name = "XFactor")
    protected float xFactor;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAttribute(name = "FocalLength")
    protected Float focalLength;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setOffset(LensOffset value) {
        this.offset = value;
    }

    public List<LensProjection> getProjection() {
        if (projection == null) {
            projection = new ArrayList<LensProjection>();
        }
        return this.projection;
    }

    public float getXFactor() {
        return xFactor;
    }

    public void setXFactor(float value) {
        this.xFactor = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public void setFocalLength(Float value) {
        this.focalLength = value;
    }
}
