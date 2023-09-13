package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NetworkProtocol",
        propOrder = {"name", "enabled", "port", "extension"})
public class NetworkProtocol {

    @XmlElement(name = "Name", required = true)
    protected NetworkProtocolType name;

    @Getter @XmlElement(name = "Enabled")
    protected boolean enabled;

    @XmlElement(name = "Port", type = Integer.class)
    protected List<Integer> port;

    @Getter @XmlElement(name = "Extension")
    protected NetworkProtocolExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setName(NetworkProtocolType value) {
        this.name = value;
    }

    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    public List<Integer> getPort() {
        if (port == null) {
            port = new ArrayList<Integer>();
        }
        return this.port;
    }

    public void setExtension(NetworkProtocolExtension value) {
        this.extension = value;
    }
}
