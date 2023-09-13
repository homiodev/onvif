package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "IPv4NetworkInterface",
        propOrder = {"enabled", "config"})
public class IPv4NetworkInterface {

    @XmlElement(name = "Enabled")
    protected boolean enabled;

    @XmlElement(name = "Config", required = true)
    protected IPv4Configuration config;

    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    public void setConfig(IPv4Configuration value) {
        this.config = value;
    }
}
