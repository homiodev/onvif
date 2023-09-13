package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "MessageDescription",
        propOrder = {"source", "key", "data", "extension"})
@XmlSeeAlso({org.onvif.ver10.schema.ConfigDescription.Messages.class})
public class MessageDescription {

    @XmlElement(name = "Source")
    protected ItemListDescription source;

    @Getter @XmlElement(name = "Key")
    protected ItemListDescription key;

    @Getter @XmlElement(name = "Data")
    protected ItemListDescription data;

    @Getter @XmlElement(name = "Extension")
    protected MessageDescriptionExtension extension;

    @XmlAttribute(name = "IsProperty")
    protected Boolean isProperty;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setSource(ItemListDescription value) {
        this.source = value;
    }

    public void setKey(ItemListDescription value) {
        this.key = value;
    }

    public void setData(ItemListDescription value) {
        this.data = value;
    }

    public void setExtension(MessageDescriptionExtension value) {
        this.extension = value;
    }

    public Boolean isIsProperty() {
        return isProperty;
    }

    public void setIsProperty(Boolean value) {
        this.isProperty = value;
    }
}
