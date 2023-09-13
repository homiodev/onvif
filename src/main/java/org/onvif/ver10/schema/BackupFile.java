package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "BackupFile",
        propOrder = {"name", "data"})
public class BackupFile {

    @XmlElement(name = "Name", required = true)
    protected String name;

    @XmlElement(name = "Data", required = true)
    protected AttachmentData data;

    public void setName(String value) {
        this.name = value;
    }

    public void setData(AttachmentData value) {
        this.data = value;
    }
}
