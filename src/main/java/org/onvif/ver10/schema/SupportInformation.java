package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SupportInformation",
        propOrder = {"binary", "string"})
public class SupportInformation {

    @XmlElement(name = "Binary")
    protected AttachmentData binary;

    @XmlElement(name = "String")
    protected String string;

    public void setBinary(AttachmentData value) {
        this.binary = value;
    }

    public void setString(String value) {
        this.string = value;
    }
}
