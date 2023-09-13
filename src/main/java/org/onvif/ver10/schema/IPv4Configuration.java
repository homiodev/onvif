package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
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
        name = "IPv4Configuration",
        propOrder = {"manual", "linkLocal", "fromDHCP", "dhcp", "any"})
public class IPv4Configuration {

    @XmlElement(name = "Manual")
    protected List<PrefixedIPv4Address> manual;

    @Getter @XmlElement(name = "LinkLocal")
    protected PrefixedIPv4Address linkLocal;

    @Getter @XmlElement(name = "FromDHCP")
    protected PrefixedIPv4Address fromDHCP;

    @XmlElement(name = "DHCP")
    protected boolean dhcp;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<PrefixedIPv4Address> getManual() {
        if (manual == null) {
            manual = new ArrayList<PrefixedIPv4Address>();
        }
        return this.manual;
    }

    public void setLinkLocal(PrefixedIPv4Address value) {
        this.linkLocal = value;
    }

    public void setFromDHCP(PrefixedIPv4Address value) {
        this.fromDHCP = value;
    }

    public boolean isDHCP() {
        return dhcp;
    }

    public void setDHCP(boolean value) {
        this.dhcp = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
