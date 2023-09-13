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
        name = "Defogging",
        propOrder = {"mode", "level", "extension"})
public class Defogging {

    @XmlElement(name = "Mode", required = true)
    protected String mode;

    @XmlElement(name = "Level")
    protected Float level;

    @XmlElement(name = "Extension")
    protected DefoggingExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setMode(String value) {
        this.mode = value;
    }

    public void setLevel(Float value) {
        this.level = value;
    }

    public void setExtension(DefoggingExtension value) {
        this.extension = value;
    }
}
