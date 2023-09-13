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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "IPv6Configuration",
        propOrder = {
                "acceptRouterAdvert",
                "dhcp",
                "manual",
                "linkLocal",
                "fromDHCP",
                "fromRA",
                "extension"
        })
public class IPv6Configuration {

    @XmlElement(name = "AcceptRouterAdvert")
    protected Boolean acceptRouterAdvert;

    @XmlElement(name = "DHCP", required = true)
    protected IPv6DHCPConfiguration dhcp;

    @XmlElement(name = "Manual")
    protected List<PrefixedIPv6Address> manual;

    @XmlElement(name = "LinkLocal")
    protected List<PrefixedIPv6Address> linkLocal;

    @XmlElement(name = "FromDHCP")
    protected List<PrefixedIPv6Address> fromDHCP;

    @XmlElement(name = "FromRA")
    protected List<PrefixedIPv6Address> fromRA;

    @Getter @XmlElement(name = "Extension")
    protected IPv6ConfigurationExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public Boolean isAcceptRouterAdvert() {
        return acceptRouterAdvert;
    }

    public void setAcceptRouterAdvert(Boolean value) {
        this.acceptRouterAdvert = value;
    }

    public IPv6DHCPConfiguration getDHCP() {
        return dhcp;
    }

    public void setDHCP(IPv6DHCPConfiguration value) {
        this.dhcp = value;
    }

    public List<PrefixedIPv6Address> getManual() {
        if (manual == null) {
            manual = new ArrayList<PrefixedIPv6Address>();
        }
        return this.manual;
    }

    public List<PrefixedIPv6Address> getLinkLocal() {
        if (linkLocal == null) {
            linkLocal = new ArrayList<PrefixedIPv6Address>();
        }
        return this.linkLocal;
    }

    public List<PrefixedIPv6Address> getFromDHCP() {
        if (fromDHCP == null) {
            fromDHCP = new ArrayList<PrefixedIPv6Address>();
        }
        return this.fromDHCP;
    }

    public List<PrefixedIPv6Address> getFromRA() {
        if (fromRA == null) {
            fromRA = new ArrayList<PrefixedIPv6Address>();
        }
        return this.fromRA;
    }

    public void setExtension(IPv6ConfigurationExtension value) {
        this.extension = value;
    }
}
