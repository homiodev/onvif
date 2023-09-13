

package org.w3._2005._05.xmlmime;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "base64Binary",
        propOrder = {"value"})
public class Base64Binary {

    @XmlValue
    protected byte[] value;

    @XmlAttribute(name = "contentType", namespace = "http://www.w3.org/2005/05/xmlmime")
    protected String contentType;

    public void setValue(byte[] value) {
        this.value = value;
    }

    public void setContentType(String value) {
        this.contentType = value;
    }
}
