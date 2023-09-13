package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "IOCapabilities",
        propOrder = {"inputConnectors", "relayOutputs", "extension"})
public class IOCapabilities {

    @XmlElement(name = "InputConnectors")
    protected Integer inputConnectors;

    @XmlElement(name = "RelayOutputs")
    protected Integer relayOutputs;

    @XmlElement(name = "Extension")
    protected IOCapabilitiesExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setInputConnectors(Integer value) {
        this.inputConnectors = value;
    }

    public void setRelayOutputs(Integer value) {
        this.relayOutputs = value;
    }

    public void setExtension(IOCapabilitiesExtension value) {
        this.extension = value;
    }
}
