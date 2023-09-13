package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "IPv6NetworkInterface",
        propOrder = {"enabled", "config"})
public class IPv6NetworkInterface {

    @XmlElement(name = "Enabled")
    protected boolean enabled;

    @XmlElement(name = "Config")
    protected IPv6Configuration config;

    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    public void setConfig(IPv6Configuration value) {
        this.config = value;
    }
}
