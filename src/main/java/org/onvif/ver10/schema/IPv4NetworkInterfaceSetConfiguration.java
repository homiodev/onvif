package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "IPv4NetworkInterfaceSetConfiguration",
        propOrder = {"enabled", "manual", "dhcp"})
public class IPv4NetworkInterfaceSetConfiguration {

    @XmlElement(name = "Enabled")
    protected Boolean enabled;

    @XmlElement(name = "Manual")
    protected List<PrefixedIPv4Address> manual;

    @XmlElement(name = "DHCP")
    protected Boolean dhcp;

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    public List<PrefixedIPv4Address> getManual() {
        if (manual == null) {
            manual = new ArrayList<PrefixedIPv4Address>();
        }
        return this.manual;
    }

    public Boolean isDHCP() {
        return dhcp;
    }

    public void setDHCP(Boolean value) {
        this.dhcp = value;
    }
}
