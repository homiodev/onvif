package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetConfiguration",
        propOrder = {"configurationToken", "profileToken"})
public class GetConfiguration {

    @XmlElement(name = "ConfigurationToken")
    protected String configurationToken;

    @XmlElement(name = "ProfileToken")
    protected String profileToken;

    public void setConfigurationToken(String value) {
        this.configurationToken = value;
    }

    public void setProfileToken(String value) {
        this.profileToken = value;
    }
}
