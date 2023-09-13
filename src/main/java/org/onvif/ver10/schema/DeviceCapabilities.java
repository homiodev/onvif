package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DeviceCapabilities",
        propOrder = {"xAddr", "network", "system", "io", "security", "extension"})
public class DeviceCapabilities {

    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;

    @Getter @XmlElement(name = "Network")
    protected NetworkCapabilities network;

    @Getter @XmlElement(name = "System")
    protected SystemCapabilities system;

    @XmlElement(name = "IO")
    protected IOCapabilities io;

    @Getter @XmlElement(name = "Security")
    protected SecurityCapabilities security;

    @Getter @XmlElement(name = "Extension")
    protected DeviceCapabilitiesExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public String getXAddr() {
        return xAddr;
    }

    public void setXAddr(String value) {
        this.xAddr = value;
    }

    public void setNetwork(NetworkCapabilities value) {
        this.network = value;
    }

    public void setSystem(SystemCapabilities value) {
        this.system = value;
    }

    public IOCapabilities getIO() {
        return io;
    }

    public void setIO(IOCapabilities value) {
        this.io = value;
    }

    public void setSecurity(SecurityCapabilities value) {
        this.security = value;
    }

    public void setExtension(DeviceCapabilitiesExtension value) {
        this.extension = value;
    }
}
