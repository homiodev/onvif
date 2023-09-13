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
        name = "Object",
        propOrder = {"appearance", "behaviour", "extension"})
public class Object extends ObjectId {

    @XmlElement(name = "Appearance")
    protected Appearance appearance;

    @XmlElement(name = "Behaviour")
    protected Behaviour behaviour;

    @XmlElement(name = "Extension")
    protected ObjectExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setAppearance(Appearance value) {
        this.appearance = value;
    }

    public void setBehaviour(Behaviour value) {
        this.behaviour = value;
    }

    public void setExtension(ObjectExtension value) {
        this.extension = value;
    }
}
