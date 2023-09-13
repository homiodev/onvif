package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Config",
        propOrder = {"parameters"})
public class Config {

    @XmlElement(name = "Parameters", required = true)
    protected ItemList parameters;

    @XmlAttribute(name = "Name", required = true)
    protected String name;

    @XmlAttribute(name = "Type", required = true)
    protected QName type;

    public void setParameters(ItemList value) {
        this.parameters = value;
    }

    public void setName(String value) {
        this.name = value;
    }

    public void setType(QName value) {
        this.type = value;
    }
}
