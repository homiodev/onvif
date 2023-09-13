package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DNSInformation",
        propOrder = {"fromDHCP", "searchDomain", "dnsFromDHCP", "dnsManual", "extension"})
public class DNSInformation {

    @XmlElement(name = "FromDHCP")
    protected boolean fromDHCP;

    @XmlElement(name = "SearchDomain")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> searchDomain;

    @XmlElement(name = "DNSFromDHCP")
    protected List<IPAddress> dnsFromDHCP;

    @XmlElement(name = "DNSManual")
    protected List<IPAddress> dnsManual;

    @Getter @XmlElement(name = "Extension")
    protected DNSInformationExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setFromDHCP(boolean value) {
        this.fromDHCP = value;
    }

    public List<String> getSearchDomain() {
        if (searchDomain == null) {
            searchDomain = new ArrayList<>();
        }
        return this.searchDomain;
    }

    public List<IPAddress> getDNSFromDHCP() {
        if (dnsFromDHCP == null) {
            dnsFromDHCP = new ArrayList<IPAddress>();
        }
        return this.dnsFromDHCP;
    }

    public List<IPAddress> getDNSManual() {
        if (dnsManual == null) {
            dnsManual = new ArrayList<IPAddress>();
        }
        return this.dnsManual;
    }

    public void setExtension(DNSInformationExtension value) {
        this.extension = value;
    }
}
