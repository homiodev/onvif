
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilities")
public class SecurityCapabilities {

    @XmlAttribute(name = "TLS1.0")
    protected Boolean tls10;

    @XmlAttribute(name = "TLS1.1")
    protected Boolean tls11;

    @XmlAttribute(name = "TLS1.2")
    protected Boolean tls12;

    @XmlAttribute(name = "OnboardKeyGeneration")
    protected Boolean onboardKeyGeneration;

    @XmlAttribute(name = "AccessPolicyConfig")
    protected Boolean accessPolicyConfig;

    @XmlAttribute(name = "DefaultAccessPolicy")
    protected Boolean defaultAccessPolicy;

    @XmlAttribute(name = "Dot1X")
    protected Boolean dot1X;

    @XmlAttribute(name = "RemoteUserHandling")
    protected Boolean remoteUserHandling;

    @XmlAttribute(name = "X.509Token")
    protected Boolean x509Token;

    @XmlAttribute(name = "SAMLToken")
    protected Boolean samlToken;

    @XmlAttribute(name = "KerberosToken")
    protected Boolean kerberosToken;

    @XmlAttribute(name = "UsernameToken")
    protected Boolean usernameToken;

    @XmlAttribute(name = "HttpDigest")
    protected Boolean httpDigest;

    @XmlAttribute(name = "RELToken")
    protected Boolean relToken;

    @XmlAttribute(name = "SupportedEAPMethods")
    protected List<Integer> supportedEAPMethods;

    @Getter @XmlAttribute(name = "MaxUsers")
    protected Integer maxUsers;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public Boolean isTLS10() {
        return tls10;
    }

    public void setTLS10(Boolean value) {
        this.tls10 = value;
    }

    public Boolean isTLS11() {
        return tls11;
    }

    public void setTLS11(Boolean value) {
        this.tls11 = value;
    }

    public Boolean isTLS12() {
        return tls12;
    }

    public void setTLS12(Boolean value) {
        this.tls12 = value;
    }

    public Boolean isOnboardKeyGeneration() {
        return onboardKeyGeneration;
    }

    public void setOnboardKeyGeneration(Boolean value) {
        this.onboardKeyGeneration = value;
    }

    public Boolean isAccessPolicyConfig() {
        return accessPolicyConfig;
    }

    public void setAccessPolicyConfig(Boolean value) {
        this.accessPolicyConfig = value;
    }

    public Boolean isDefaultAccessPolicy() {
        return defaultAccessPolicy;
    }

    public void setDefaultAccessPolicy(Boolean value) {
        this.defaultAccessPolicy = value;
    }

    public Boolean isDot1X() {
        return dot1X;
    }

    public void setDot1X(Boolean value) {
        this.dot1X = value;
    }

    public Boolean isRemoteUserHandling() {
        return remoteUserHandling;
    }

    public void setRemoteUserHandling(Boolean value) {
        this.remoteUserHandling = value;
    }

    public Boolean isX509Token() {
        return x509Token;
    }

    public void setX509Token(Boolean value) {
        this.x509Token = value;
    }

    public Boolean isSAMLToken() {
        return samlToken;
    }

    public void setSAMLToken(Boolean value) {
        this.samlToken = value;
    }

    public Boolean isKerberosToken() {
        return kerberosToken;
    }

    public void setKerberosToken(Boolean value) {
        this.kerberosToken = value;
    }

    public Boolean isUsernameToken() {
        return usernameToken;
    }

    public void setUsernameToken(Boolean value) {
        this.usernameToken = value;
    }

    public Boolean isHttpDigest() {
        return httpDigest;
    }

    public void setHttpDigest(Boolean value) {
        this.httpDigest = value;
    }

    public Boolean isRELToken() {
        return relToken;
    }

    public void setRELToken(Boolean value) {
        this.relToken = value;
    }

    public List<Integer> getSupportedEAPMethods() {
        if (supportedEAPMethods == null) {
            supportedEAPMethods = new ArrayList<Integer>();
        }
        return this.supportedEAPMethods;
    }

    public void setMaxUsers(Integer value) {
        this.maxUsers = value;
    }
}
