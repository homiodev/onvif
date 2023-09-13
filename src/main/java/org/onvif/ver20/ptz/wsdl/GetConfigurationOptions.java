package org.onvif.ver20.ptz.wsdl;

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
        propOrder = {"configurationToken"})
@XmlRootElement(name = "GetConfigurationOptions")
public class GetConfigurationOptions {

    @XmlElement(name = "ConfigurationToken", required = true)
    protected String configurationToken;

    public void setConfigurationToken(String value) {
        this.configurationToken = value;
    }
}
