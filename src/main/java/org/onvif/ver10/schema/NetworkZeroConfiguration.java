package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NetworkZeroConfiguration",
        propOrder = {"interfaceToken", "enabled", "addresses", "extension"})
public class NetworkZeroConfiguration {

    @XmlElement(name = "InterfaceToken", required = true)
    protected String interfaceToken;

    @Getter @XmlElement(name = "Enabled")
    protected boolean enabled;

    @XmlElement(name = "Addresses")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> addresses;

    @Getter @XmlElement(name = "Extension")
    protected NetworkZeroConfigurationExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setInterfaceToken(String value) {
        this.interfaceToken = value;
    }

    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    public List<String> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<>();
        }
        return this.addresses;
    }

    public void setExtension(NetworkZeroConfigurationExtension value) {
        this.extension = value;
    }
}
