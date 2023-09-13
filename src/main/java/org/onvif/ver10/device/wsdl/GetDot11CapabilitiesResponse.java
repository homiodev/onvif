
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.Dot11Capabilities;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"capabilities"})
@XmlRootElement(name = "GetDot11CapabilitiesResponse")
public class GetDot11CapabilitiesResponse {

    @XmlElement(name = "Capabilities", required = true)
    protected Dot11Capabilities capabilities;

    public void setCapabilities(Dot11Capabilities value) {
        this.capabilities = value;
    }
}
