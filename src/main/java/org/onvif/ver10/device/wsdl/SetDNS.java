
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import org.onvif.ver10.schema.IPAddress;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"fromDHCP", "searchDomain", "dnsManual"})
@XmlRootElement(name = "SetDNS")
public class SetDNS {

    @XmlElement(name = "FromDHCP")
    protected boolean fromDHCP;

    @XmlElement(name = "SearchDomain")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> searchDomain;

    @XmlElement(name = "DNSManual")
    protected List<IPAddress> dnsManual;

    public void setFromDHCP(boolean value) {
        this.fromDHCP = value;
    }

    public List<String> getSearchDomain() {
        if (searchDomain == null) {
            searchDomain = new ArrayList<>();
        }
        return this.searchDomain;
    }

    public List<IPAddress> getDNSManual() {
        if (dnsManual == null) {
            dnsManual = new ArrayList<IPAddress>();
        }
        return this.dnsManual;
    }
}
