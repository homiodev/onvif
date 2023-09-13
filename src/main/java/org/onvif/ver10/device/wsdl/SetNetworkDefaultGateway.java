
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"iPv4Address", "iPv6Address"})
@XmlRootElement(name = "SetNetworkDefaultGateway")
public class SetNetworkDefaultGateway {

    @XmlElement(name = "IPv4Address")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> iPv4Address;

    @XmlElement(name = "IPv6Address")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> iPv6Address;

    public List<String> getIPv4Address() {
        if (iPv4Address == null) {
            iPv4Address = new ArrayList<>();
        }
        return this.iPv4Address;
    }

    public List<String> getIPv6Address() {
        if (iPv6Address == null) {
            iPv6Address = new ArrayList<>();
        }
        return this.iPv6Address;
    }
}
