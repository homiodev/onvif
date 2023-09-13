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
        name = "NetworkZeroConfigurationExtension",
        propOrder = {"any", "additional", "extension"})
public class NetworkZeroConfigurationExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @XmlElement(name = "Additional")
    protected List<NetworkZeroConfiguration> additional;

    @Getter @XmlElement(name = "Extension")
    protected NetworkZeroConfigurationExtension2 extension;

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public List<NetworkZeroConfiguration> getAdditional() {
        if (additional == null) {
            additional = new ArrayList<NetworkZeroConfiguration>();
        }
        return this.additional;
    }

    public void setExtension(NetworkZeroConfigurationExtension2 value) {
        this.extension = value;
    }
}
