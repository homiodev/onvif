package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "OSDColor",
        propOrder = {"color"})
public class OSDColor {

    @XmlElement(name = "Color", required = true)
    protected Color color;

    @XmlAttribute(name = "Transparent")
    protected Integer transparent;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setColor(Color value) {
        this.color = value;
    }

    public void setTransparent(Integer value) {
        this.transparent = value;
    }
}
