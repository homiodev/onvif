
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.Dot11AvailableNetworks;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"networks"})
@XmlRootElement(name = "ScanAvailableDot11NetworksResponse")
public class ScanAvailableDot11NetworksResponse {

    @XmlElement(name = "Networks")
    protected List<Dot11AvailableNetworks> networks;

    public List<Dot11AvailableNetworks> getNetworks() {
        if (networks == null) {
            networks = new ArrayList<Dot11AvailableNetworks>();
        }
        return this.networks;
    }
}
