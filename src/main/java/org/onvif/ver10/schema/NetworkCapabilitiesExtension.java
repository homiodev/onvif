package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NetworkCapabilitiesExtension",
        propOrder = {"any", "dot11Configuration", "extension"})
public class NetworkCapabilitiesExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @XmlElement(name = "Dot11Configuration")
    protected Boolean dot11Configuration;

    @Getter @XmlElement(name = "Extension")
    protected NetworkCapabilitiesExtension2 extension;

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public Boolean isDot11Configuration() {
        return dot11Configuration;
    }

    public void setDot11Configuration(Boolean value) {
        this.dot11Configuration = value;
    }

    public void setExtension(NetworkCapabilitiesExtension2 value) {
        this.extension = value;
    }
}
