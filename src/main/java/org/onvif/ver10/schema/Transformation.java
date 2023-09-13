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
import lombok.Setter;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Transformation",
        propOrder = {"translate", "scale", "extension"})
public class Transformation {

    @XmlElement(name = "Translate")
    protected Vector translate;

    @XmlElement(name = "Scale")
    protected Vector scale;

    @XmlElement(name = "Extension")
    protected TransformationExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();
}
