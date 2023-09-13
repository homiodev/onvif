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
        name = "NetworkCapabilities",
        propOrder = {"ipFilter", "zeroConfiguration", "ipVersion6", "dynDNS", "extension"})
public class NetworkCapabilities {

    @XmlElement(name = "IPFilter")
    protected Boolean ipFilter;

    @XmlElement(name = "ZeroConfiguration")
    protected Boolean zeroConfiguration;

    @XmlElement(name = "IPVersion6")
    protected Boolean ipVersion6;

    @XmlElement(name = "DynDNS")
    protected Boolean dynDNS;

    @Getter @XmlElement(name = "Extension")
    protected NetworkCapabilitiesExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public Boolean isIPFilter() {
        return ipFilter;
    }

    public void setIPFilter(Boolean value) {
        this.ipFilter = value;
    }

    public Boolean isZeroConfiguration() {
        return zeroConfiguration;
    }

    public void setZeroConfiguration(Boolean value) {
        this.zeroConfiguration = value;
    }

    public Boolean isIPVersion6() {
        return ipVersion6;
    }

    public void setIPVersion6(Boolean value) {
        this.ipVersion6 = value;
    }

    public Boolean isDynDNS() {
        return dynDNS;
    }

    public void setDynDNS(Boolean value) {
        this.dynDNS = value;
    }

    public void setExtension(NetworkCapabilitiesExtension value) {
        this.extension = value;
    }
}
