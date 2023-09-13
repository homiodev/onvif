package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SecurityCapabilitiesExtension",
        propOrder = {"tls10", "extension"})
public class SecurityCapabilitiesExtension {

    @XmlElement(name = "TLS1.0")
    protected boolean tls10;

    @Getter @XmlElement(name = "Extension")
    protected SecurityCapabilitiesExtension2 extension;

    public boolean isTLS10() {
        return tls10;
    }

    public void setTLS10(boolean value) {
        this.tls10 = value;
    }

    public void setExtension(SecurityCapabilitiesExtension2 value) {
        this.extension = value;
    }
}
