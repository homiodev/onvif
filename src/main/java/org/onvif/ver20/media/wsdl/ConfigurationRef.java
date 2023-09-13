package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ConfigurationRef",
        propOrder = {"type", "token"})
public class ConfigurationRef {

    @XmlElement(name = "Type", required = true)
    protected String type;

    @XmlElement(name = "Token")
    protected String token;

    public void setType(String value) {
        this.type = value;
    }

    public void setToken(String value) {
        this.token = value;
    }
}
