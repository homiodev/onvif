package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SecurityCapabilitiesExtension2",
        propOrder = {"dot1X", "supportedEAPMethod", "remoteUserHandling", "any"})
public class SecurityCapabilitiesExtension2 {

    @XmlElement(name = "Dot1X")
    protected boolean dot1X;

    @XmlElement(name = "SupportedEAPMethod", type = Integer.class)
    protected List<Integer> supportedEAPMethod;

    @Getter @XmlElement(name = "RemoteUserHandling")
    protected boolean remoteUserHandling;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    public void setDot1X(boolean value) {
        this.dot1X = value;
    }

    public List<Integer> getSupportedEAPMethod() {
        if (supportedEAPMethod == null) {
            supportedEAPMethod = new ArrayList<Integer>();
        }
        return this.supportedEAPMethod;
    }

    public void setRemoteUserHandling(boolean value) {
        this.remoteUserHandling = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
