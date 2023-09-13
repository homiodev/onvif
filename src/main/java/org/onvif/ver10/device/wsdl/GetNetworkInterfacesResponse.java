
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.NetworkInterface;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"networkInterfaces"})
@XmlRootElement(name = "GetNetworkInterfacesResponse")
public class GetNetworkInterfacesResponse {

    @XmlElement(name = "NetworkInterfaces", required = true)
    protected List<NetworkInterface> networkInterfaces;

    public List<NetworkInterface> getNetworkInterfaces() {
        if (networkInterfaces == null) {
            networkInterfaces = new ArrayList<NetworkInterface>();
        }
        return this.networkInterfaces;
    }
}
