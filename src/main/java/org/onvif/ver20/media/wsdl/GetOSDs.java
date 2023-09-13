package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"osdToken", "configurationToken"})
@XmlRootElement(name = "GetOSDs")
public class GetOSDs {

    @XmlElement(name = "OSDToken")
    protected String osdToken;

    @Getter @XmlElement(name = "ConfigurationToken")
    protected String configurationToken;

    public String getOSDToken() {
        return osdToken;
    }

    public void setOSDToken(String value) {
        this.osdToken = value;
    }

    public void setConfigurationToken(String value) {
        this.configurationToken = value;
    }
}
