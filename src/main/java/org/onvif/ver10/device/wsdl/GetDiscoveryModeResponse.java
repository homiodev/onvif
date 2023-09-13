
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.DiscoveryMode;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"discoveryMode"})
@XmlRootElement(name = "GetDiscoveryModeResponse")
public class GetDiscoveryModeResponse {

    @XmlElement(name = "DiscoveryMode", required = true)
    protected DiscoveryMode discoveryMode;

    public void setDiscoveryMode(DiscoveryMode value) {
        this.discoveryMode = value;
    }
}
