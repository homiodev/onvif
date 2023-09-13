package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Transport",
        propOrder = {"protocol", "tunnel"})
public class Transport {

    @XmlElement(name = "Protocol", required = true)
    protected TransportProtocol protocol;

    @XmlElement(name = "Tunnel")
    protected Transport tunnel;
}
