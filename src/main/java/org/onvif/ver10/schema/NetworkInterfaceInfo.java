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
        name = "NetworkInterfaceInfo",
        propOrder = {"name", "hwAddress", "mtu"})
public class NetworkInterfaceInfo {

    @XmlElement(name = "Name")
    protected String name;

    @Getter @XmlElement(name = "HwAddress", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hwAddress;

    @XmlElement(name = "MTU")
    protected Integer mtu;

    public void setName(String value) {
        this.name = value;
    }

    public void setHwAddress(String value) {
        this.hwAddress = value;
    }

    public Integer getMTU() {
        return mtu;
    }

    public void setMTU(Integer value) {
        this.mtu = value;
    }
}
