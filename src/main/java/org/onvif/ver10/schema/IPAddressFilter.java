package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "IPAddressFilter",
        propOrder = {"type", "iPv4Address", "iPv6Address", "extension"})
public class IPAddressFilter {

    @XmlElement(name = "Type", required = true)
    protected IPAddressFilterType type;

    @XmlElement(name = "IPv4Address")
    protected List<PrefixedIPv4Address> iPv4Address;

    @XmlElement(name = "IPv6Address")
    protected List<PrefixedIPv6Address> iPv6Address;

    @Getter @XmlElement(name = "Extension")
    protected IPAddressFilterExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setType(IPAddressFilterType value) {
        this.type = value;
    }

    public List<PrefixedIPv4Address> getIPv4Address() {
        if (iPv4Address == null) {
            iPv4Address = new ArrayList<PrefixedIPv4Address>();
        }
        return this.iPv4Address;
    }

    public List<PrefixedIPv6Address> getIPv6Address() {
        if (iPv6Address == null) {
            iPv6Address = new ArrayList<PrefixedIPv6Address>();
        }
        return this.iPv6Address;
    }

    public void setExtension(IPAddressFilterExtension value) {
        this.extension = value;
    }
}
