package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ColorspaceRange",
        propOrder = {"x", "y", "z", "colorspace"})
public class ColorspaceRange {

    @XmlElement(name = "X", required = true)
    protected FloatRange x;

    @XmlElement(name = "Y", required = true)
    protected FloatRange y;

    @XmlElement(name = "Z", required = true)
    protected FloatRange z;

    @XmlElement(name = "Colorspace", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String colorspace;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setX(FloatRange value) {
        this.x = value;
    }

    public void setY(FloatRange value) {
        this.y = value;
    }

    public void setZ(FloatRange value) {
        this.z = value;
    }

    public void setColorspace(String value) {
        this.colorspace = value;
    }
}
