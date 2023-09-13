package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "BinaryData",
        propOrder = {"data"})
public class BinaryData {

    @XmlElement(name = "Data", required = true)
    protected byte[] data;

    @XmlAttribute(name = "contentType", namespace = "http://www.w3.org/2005/05/xmlmime")
    protected String contentType;

    public void setData(byte[] value) {
        this.data = value;
    }

    public void setContentType(String value) {
        this.contentType = value;
    }
}
