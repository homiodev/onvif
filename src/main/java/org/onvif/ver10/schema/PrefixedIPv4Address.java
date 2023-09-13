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
        name = "PrefixedIPv4Address",
        propOrder = {"address", "prefixLength"})
public class PrefixedIPv4Address {

    @XmlElement(name = "Address", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String address;

    @XmlElement(name = "PrefixLength")
    protected int prefixLength;

    public void setAddress(String value) {
        this.address = value;
    }

    public void setPrefixLength(int value) {
        this.prefixLength = value;
    }
}
