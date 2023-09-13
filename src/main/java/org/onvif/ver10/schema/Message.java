package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"source", "key", "data", "extension"})
@XmlRootElement(name = "Message")
public class Message {

    @XmlElement(name = "Source")
    protected ItemList source;

    @XmlElement(name = "Key")
    protected ItemList key;

    @XmlElement(name = "Data")
    protected ItemList data;

    @XmlElement(name = "Extension")
    protected MessageExtension extension;

    @XmlAttribute(name = "UtcTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utcTime;

    @XmlAttribute(name = "PropertyOperation")
    protected PropertyOperation propertyOperation;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setSource(ItemList value) {
        this.source = value;
    }

    public void setKey(ItemList value) {
        this.key = value;
    }

    public void setData(ItemList value) {
        this.data = value;
    }

    public void setExtension(MessageExtension value) {
        this.extension = value;
    }

    public void setUtcTime(XMLGregorianCalendar value) {
        this.utcTime = value;
    }

    public void setPropertyOperation(PropertyOperation value) {
        this.propertyOperation = value;
    }
}
