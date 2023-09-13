package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "IPv6NetworkInterfaceSetConfiguration",
        propOrder = {"enabled", "acceptRouterAdvert", "manual", "dhcp"})
public class IPv6NetworkInterfaceSetConfiguration {

    @XmlElement(name = "Enabled")
    protected Boolean enabled;

    @XmlElement(name = "AcceptRouterAdvert")
    protected Boolean acceptRouterAdvert;

    @XmlElement(name = "Manual")
    protected List<PrefixedIPv6Address> manual;

    @XmlElement(name = "DHCP")
    protected IPv6DHCPConfiguration dhcp;

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    public Boolean isAcceptRouterAdvert() {
        return acceptRouterAdvert;
    }

    public void setAcceptRouterAdvert(Boolean value) {
        this.acceptRouterAdvert = value;
    }

    public List<PrefixedIPv6Address> getManual() {
        if (manual == null) {
            manual = new ArrayList<PrefixedIPv6Address>();
        }
        return this.manual;
    }

    public IPv6DHCPConfiguration getDHCP() {
        return dhcp;
    }

    public void setDHCP(IPv6DHCPConfiguration value) {
        this.dhcp = value;
    }
}
