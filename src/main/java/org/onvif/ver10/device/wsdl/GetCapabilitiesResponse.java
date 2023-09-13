
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.Capabilities;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"capabilities"})
@XmlRootElement(name = "GetCapabilitiesResponse")
public class GetCapabilitiesResponse {

    @XmlElement(name = "Capabilities", required = true)
    protected Capabilities capabilities;

    public void setCapabilities(Capabilities value) {
        this.capabilities = value;
    }
}
