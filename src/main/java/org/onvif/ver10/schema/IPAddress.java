package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "IPAddress",
        propOrder = {"type", "iPv4Address", "iPv6Address"})
public class IPAddress {

    @XmlElement(name = "Type", required = true)
    protected IPType type;

    @XmlElement(name = "IPv4Address")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String iPv4Address;

    @XmlElement(name = "IPv6Address")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String iPv6Address;

    public void setType(IPType value) {
        this.type = value;
    }

    public String getIPv4Address() {
        return iPv4Address;
    }

    public void setIPv4Address(String value) {
        this.iPv4Address = value;
    }

    public String getIPv6Address() {
        return iPv6Address;
    }

    public void setIPv6Address(String value) {
        this.iPv6Address = value;
    }
}
