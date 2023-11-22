
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
