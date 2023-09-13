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
        name = "OSDPosConfiguration",
        propOrder = {"type", "pos", "extension"})
public class OSDPosConfiguration {

    @XmlElement(name = "Type", required = true)
    protected String type;

    @XmlElement(name = "Pos")
    protected Vector pos;

    @XmlElement(name = "Extension")
    protected OSDPosConfigurationExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setType(String value) {
        this.type = value;
    }

    public void setPos(Vector value) {
        this.pos = value;
    }

    public void setExtension(OSDPosConfigurationExtension value) {
        this.extension = value;
    }
}
