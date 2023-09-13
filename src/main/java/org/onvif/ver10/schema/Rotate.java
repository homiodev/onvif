package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Rotate",
        propOrder = {"mode", "degree", "extension"})
public class Rotate {

    @XmlElement(name = "Mode", required = true)
    protected RotateMode mode;

    @XmlElement(name = "Degree")
    protected Integer degree;

    @XmlElement(name = "Extension")
    protected RotateExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setMode(RotateMode value) {
        this.mode = value;
    }

    public void setDegree(Integer value) {
        this.degree = value;
    }

    public void setExtension(RotateExtension value) {
        this.extension = value;
    }
}
