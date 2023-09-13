
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.NetworkGateway;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"networkGateway"})
@XmlRootElement(name = "GetNetworkDefaultGatewayResponse")
public class GetNetworkDefaultGatewayResponse {

    @XmlElement(name = "NetworkGateway", required = true)
    protected NetworkGateway networkGateway;

    public void setNetworkGateway(NetworkGateway value) {
        this.networkGateway = value;
    }
}
