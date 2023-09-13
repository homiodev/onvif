package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "AnalyticsEngineControl",
    propOrder = {
        "engineToken",
        "engineConfigToken",
        "inputToken",
        "receiverToken",
        "multicast",
        "subscription",
        "mode",
        "any"
    })
public class AnalyticsEngineControl extends ConfigurationEntity {

    @XmlElement(name = "EngineToken", required = true)
    protected String engineToken;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    @XmlElement(name = "InputToken", required = true)
    protected List<String> inputToken;

    @XmlElement(name = "ReceiverToken", required = true)
    protected List<String> receiverToken;
    @XmlElement(name = "EngineConfigToken", required = true)
    protected String engineConfigToken;
    @XmlElement(name = "Multicast")
    protected MulticastConfiguration multicast;
    @XmlElement(name = "Subscription", required = true)
    protected Config subscription;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "Mode", required = true)
    protected ModeOfOperation mode;

    public List<String> getInputToken() {
        if (inputToken == null) {
            inputToken = new ArrayList<>();
        }
        return this.inputToken;
    }

    public List<String> getReceiverToken() {
        if (receiverToken == null) {
            receiverToken = new ArrayList<>();
        }
        return this.receiverToken;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
