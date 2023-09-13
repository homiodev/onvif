
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DeviceServiceCapabilities",
        propOrder = {"network", "security", "system", "misc"})
public class DeviceServiceCapabilities {

    @XmlElement(name = "Network", required = true)
    protected NetworkCapabilities network;

    @XmlElement(name = "Security", required = true)
    protected SecurityCapabilities security;

    @XmlElement(name = "System", required = true)
    protected SystemCapabilities system;

    @XmlElement(name = "Misc")
    protected MiscCapabilities misc;

    public void setNetwork(NetworkCapabilities value) {
        this.network = value;
    }

    public void setSecurity(SecurityCapabilities value) {
        this.security = value;
    }

    public void setSystem(SystemCapabilities value) {
        this.system = value;
    }

    public void setMisc(MiscCapabilities value) {
        this.misc = value;
    }
}
