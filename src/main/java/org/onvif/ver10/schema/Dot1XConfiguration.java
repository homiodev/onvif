package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
        name = "Dot1XConfiguration",
        propOrder = {
                "dot1XConfigurationToken",
                "identity",
                "anonymousID",
                "eapMethod",
                "caCertificateID",
                "eapMethodConfiguration",
                "extension"
        })
public class Dot1XConfiguration {

    @XmlElement(name = "Dot1XConfigurationToken", required = true)
    protected String dot1XConfigurationToken;

    @Getter @XmlElement(name = "Identity", required = true)
    protected String identity;

    @Getter @XmlElement(name = "AnonymousID")
    protected String anonymousID;

    @XmlElement(name = "EAPMethod")
    protected int eapMethod;

    @XmlElement(name = "CACertificateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> caCertificateID;

    @XmlElement(name = "EAPMethodConfiguration")
    protected EAPMethodConfiguration eapMethodConfiguration;

    @Getter @XmlElement(name = "Extension")
    protected Dot1XConfigurationExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setDot1XConfigurationToken(String value) {
        this.dot1XConfigurationToken = value;
    }

    public void setIdentity(String value) {
        this.identity = value;
    }

    public void setAnonymousID(String value) {
        this.anonymousID = value;
    }

    public int getEAPMethod() {
        return eapMethod;
    }

    public void setEAPMethod(int value) {
        this.eapMethod = value;
    }

    public List<String> getCACertificateID() {
        if (caCertificateID == null) {
            caCertificateID = new ArrayList<>();
        }
        return this.caCertificateID;
    }

    public EAPMethodConfiguration getEAPMethodConfiguration() {
        return eapMethodConfiguration;
    }

    public void setEAPMethodConfiguration(EAPMethodConfiguration value) {
        this.eapMethodConfiguration = value;
    }

    public void setExtension(Dot1XConfigurationExtension value) {
        this.extension = value;
    }
}
