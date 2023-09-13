
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.NetworkProtocol;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"networkProtocols"})
@XmlRootElement(name = "GetNetworkProtocolsResponse")
public class GetNetworkProtocolsResponse {

    @XmlElement(name = "NetworkProtocols")
    protected List<NetworkProtocol> networkProtocols;

    public List<NetworkProtocol> getNetworkProtocols() {
        if (networkProtocols == null) {
            networkProtocols = new ArrayList<NetworkProtocol>();
        }
        return this.networkProtocols;
    }
}
