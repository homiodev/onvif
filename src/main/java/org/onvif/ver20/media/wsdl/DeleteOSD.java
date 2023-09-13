package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"osdToken"})
@XmlRootElement(name = "DeleteOSD")
public class DeleteOSD {

    @XmlElement(name = "OSDToken", required = true)
    protected String osdToken;

    public String getOSDToken() {
        return osdToken;
    }

    public void setOSDToken(String value) {
        this.osdToken = value;
    }
}
