package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NetworkInterfaceLink",
        propOrder = {"adminSettings", "operSettings", "interfaceType"})
public class NetworkInterfaceLink {

    @XmlElement(name = "AdminSettings", required = true)
    protected NetworkInterfaceConnectionSetting adminSettings;

    @XmlElement(name = "OperSettings", required = true)
    protected NetworkInterfaceConnectionSetting operSettings;

    @XmlElement(name = "InterfaceType")
    protected int interfaceType;

    public void setAdminSettings(NetworkInterfaceConnectionSetting value) {
        this.adminSettings = value;
    }

    public void setOperSettings(NetworkInterfaceConnectionSetting value) {
        this.operSettings = value;
    }

    public void setInterfaceType(int value) {
        this.interfaceType = value;
    }
}
