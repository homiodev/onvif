package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NetworkInterfaceConnectionSetting",
        propOrder = {"autoNegotiation", "speed", "duplex"})
public class NetworkInterfaceConnectionSetting {

    @XmlElement(name = "AutoNegotiation")
    protected boolean autoNegotiation;

    @XmlElement(name = "Speed")
    protected int speed;

    @XmlElement(name = "Duplex", required = true)
    protected Duplex duplex;

    public void setAutoNegotiation(boolean value) {
        this.autoNegotiation = value;
    }

    public void setSpeed(int value) {
        this.speed = value;
    }

    public void setDuplex(Duplex value) {
        this.duplex = value;
    }
}
