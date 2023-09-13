package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Rename",
        propOrder = {"from", "to"})
public class Rename {

    @XmlElement(required = true)
    protected ObjectId from;

    @XmlElement(required = true)
    protected ObjectId to;

    public void setFrom(ObjectId value) {
        this.from = value;
    }

    public void setTo(ObjectId value) {
        this.to = value;
    }
}
