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
        propOrder = {"protocol", "profileToken"})
@XmlRootElement(name = "GetStreamUri")
public class GetStreamUri {

    @XmlElement(name = "Protocol", required = true)
    protected String protocol;

    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;

    public void setProtocol(String value) {
        this.protocol = value;
    }

    public void setProfileToken(String value) {
        this.profileToken = value;
    }
}
