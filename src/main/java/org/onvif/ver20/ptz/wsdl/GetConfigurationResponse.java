package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PTZConfiguration;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"ptzConfiguration"})
@XmlRootElement(name = "GetConfigurationResponse")
public class GetConfigurationResponse {

    @XmlElement(name = "PTZConfiguration", required = true)
    protected PTZConfiguration ptzConfiguration;

    public PTZConfiguration getPTZConfiguration() {
        return ptzConfiguration;
    }

    public void setPTZConfiguration(PTZConfiguration value) {
        this.ptzConfiguration = value;
    }
}
