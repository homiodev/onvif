
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkCapabilities")
public class NetworkCapabilities {

    @XmlAttribute(name = "IPFilter")
    protected Boolean ipFilter;

    @XmlAttribute(name = "ZeroConfiguration")
    protected Boolean zeroConfiguration;

    @XmlAttribute(name = "IPVersion6")
    protected Boolean ipVersion6;

    @XmlAttribute(name = "DynDNS")
    protected Boolean dynDNS;

    @XmlAttribute(name = "Dot11Configuration")
    protected Boolean dot11Configuration;

    @Getter @XmlAttribute(name = "Dot1XConfigurations")
    protected Integer dot1XConfigurations;

    @XmlAttribute(name = "HostnameFromDHCP")
    protected Boolean hostnameFromDHCP;

    @XmlAttribute(name = "NTP")
    protected Integer ntp;

    @XmlAttribute(name = "DHCPv6")
    protected Boolean dhcPv6;

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

    public Boolean isDot11Configuration() {
        return dot11Configuration;
    }

    public void setDot11Configuration(Boolean value) {
        this.dot11Configuration = value;
    }

    public void setDot1XConfigurations(Integer value) {
        this.dot1XConfigurations = value;
    }

    public Boolean isHostnameFromDHCP() {
        return hostnameFromDHCP;
    }

    public void setHostnameFromDHCP(Boolean value) {
        this.hostnameFromDHCP = value;
    }

    public Integer getNTP() {
        return ntp;
    }

    public void setNTP(Integer value) {
        this.ntp = value;
    }

    public Boolean isDHCPv6() {
        return dhcPv6;
    }

    public void setDHCPv6(Boolean value) {
        this.dhcPv6 = value;
    }
}
