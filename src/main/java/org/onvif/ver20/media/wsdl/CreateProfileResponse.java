package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"token"})
@XmlRootElement(name = "CreateProfileResponse")
public class CreateProfileResponse {

    @XmlElement(name = "Token", required = true)
    protected String token;

    public void setToken(String value) {
        this.token = value;
    }
}
