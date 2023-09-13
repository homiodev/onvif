package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "CertificateUsage",
        propOrder = {"value"})
public class CertificateUsage {

    @XmlValue
    protected String value;

    @XmlAttribute(name = "Critical", required = true)
    protected boolean critical;

    public void setValue(String value) {
        this.value = value;
    }

    public void setCritical(boolean value) {
        this.critical = value;
    }
}
