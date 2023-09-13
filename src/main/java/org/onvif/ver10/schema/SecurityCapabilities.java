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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SecurityCapabilities",
        propOrder = {
                "tls11",
                "tls12",
                "onboardKeyGeneration",
                "accessPolicyConfig",
                "x509Token",
                "samlToken",
                "kerberosToken",
                "relToken",
                "any",
                "extension"
        })
public class SecurityCapabilities {

    @XmlElement(name = "TLS1.1")
    protected boolean tls11;

    @XmlElement(name = "TLS1.2")
    protected boolean tls12;

    @Getter @XmlElement(name = "OnboardKeyGeneration")
    protected boolean onboardKeyGeneration;

    @Getter @XmlElement(name = "AccessPolicyConfig")
    protected boolean accessPolicyConfig;

    @Getter @XmlElement(name = "X.509Token")
    protected boolean x509Token;

    @XmlElement(name = "SAMLToken")
    protected boolean samlToken;

    @Getter @XmlElement(name = "KerberosToken")
    protected boolean kerberosToken;

    @XmlElement(name = "RELToken")
    protected boolean relToken;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlElement(name = "Extension")
    protected SecurityCapabilitiesExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public boolean isTLS11() {
        return tls11;
    }

    public void setTLS11(boolean value) {
        this.tls11 = value;
    }

    public boolean isTLS12() {
        return tls12;
    }

    public void setTLS12(boolean value) {
        this.tls12 = value;
    }

    public void setOnboardKeyGeneration(boolean value) {
        this.onboardKeyGeneration = value;
    }

    public void setAccessPolicyConfig(boolean value) {
        this.accessPolicyConfig = value;
    }

    public void setX509Token(boolean value) {
        this.x509Token = value;
    }

    public boolean isSAMLToken() {
        return samlToken;
    }

    public void setSAMLToken(boolean value) {
        this.samlToken = value;
    }

    public void setKerberosToken(boolean value) {
        this.kerberosToken = value;
    }

    public boolean isRELToken() {
        return relToken;
    }

    public void setRELToken(boolean value) {
        this.relToken = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public void setExtension(SecurityCapabilitiesExtension value) {
        this.extension = value;
    }
}
