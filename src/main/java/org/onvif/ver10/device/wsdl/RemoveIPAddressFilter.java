
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.IPAddressFilter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"ipAddressFilter"})
@XmlRootElement(name = "RemoveIPAddressFilter")
public class RemoveIPAddressFilter {

    @XmlElement(name = "IPAddressFilter", required = true)
    protected IPAddressFilter ipAddressFilter;

    public IPAddressFilter getIPAddressFilter() {
        return ipAddressFilter;
    }

    public void setIPAddressFilter(IPAddressFilter value) {
        this.ipAddressFilter = value;
    }
}
