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

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NetworkInterface",
        propOrder = {"enabled", "info", "link", "iPv4", "iPv6", "extension"})
public class NetworkInterface extends DeviceEntity {

    @XmlElement(name = "Enabled")
    protected boolean enabled;

    @Getter @XmlElement(name = "Info")
    protected NetworkInterfaceInfo info;

    @Getter @XmlElement(name = "Link")
    protected NetworkInterfaceLink link;

    @XmlElement(name = "IPv4")
    protected IPv4NetworkInterface iPv4;

    @XmlElement(name = "IPv6")
    protected IPv6NetworkInterface iPv6;

    @Getter @XmlElement(name = "Extension")
    protected NetworkInterfaceExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    public void setInfo(NetworkInterfaceInfo value) {
        this.info = value;
    }

    public void setLink(NetworkInterfaceLink value) {
        this.link = value;
    }

    public IPv4NetworkInterface getIPv4() {
        return iPv4;
    }

    public void setIPv4(IPv4NetworkInterface value) {
        this.iPv4 = value;
    }

    public IPv6NetworkInterface getIPv6() {
        return iPv6;
    }

    public void setIPv6(IPv6NetworkInterface value) {
        this.iPv6 = value;
    }

    public void setExtension(NetworkInterfaceExtension value) {
        this.extension = value;
    }
}
