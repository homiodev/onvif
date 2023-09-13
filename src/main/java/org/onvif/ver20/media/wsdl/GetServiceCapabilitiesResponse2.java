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
        propOrder = {"capabilities"})
@XmlRootElement(name = "GetServiceCapabilitiesResponse2")
public class GetServiceCapabilitiesResponse2 {

    @XmlElement(name = "Capabilities", required = true)
    protected Capabilities2 capabilities;

    public void setCapabilities(Capabilities2 value) {
        this.capabilities = value;
    }
}
