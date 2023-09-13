package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NetworkInterfaceSetConfiguration",
        propOrder = {"enabled", "link", "mtu", "iPv4", "iPv6", "extension"})
public class NetworkInterfaceSetConfiguration {

    @XmlElement(name = "Enabled")
    protected Boolean enabled;

    @Getter @XmlElement(name = "Link")
    protected NetworkInterfaceConnectionSetting link;

    @XmlElement(name = "MTU")
    protected Integer mtu;

    @XmlElement(name = "IPv4")
    protected IPv4NetworkInterfaceSetConfiguration iPv4;

    @XmlElement(name = "IPv6")
    protected IPv6NetworkInterfaceSetConfiguration iPv6;

    @Getter @XmlElement(name = "Extension")
    protected NetworkInterfaceSetConfigurationExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    public void setLink(NetworkInterfaceConnectionSetting value) {
        this.link = value;
    }

    public Integer getMTU() {
        return mtu;
    }

    public void setMTU(Integer value) {
        this.mtu = value;
    }

    public IPv4NetworkInterfaceSetConfiguration getIPv4() {
        return iPv4;
    }

    public void setIPv4(IPv4NetworkInterfaceSetConfiguration value) {
        this.iPv4 = value;
    }

    public IPv6NetworkInterfaceSetConfiguration getIPv6() {
        return iPv6;
    }

    public void setIPv6(IPv6NetworkInterfaceSetConfiguration value) {
        this.iPv6 = value;
    }

    public void setExtension(NetworkInterfaceSetConfigurationExtension value) {
        this.extension = value;
    }
}
