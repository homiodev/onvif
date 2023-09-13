package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "CertificateGenerationParameters",
        propOrder = {"certificateID", "subject", "validNotBefore", "validNotAfter", "extension"})
public class CertificateGenerationParameters {

    @XmlElement(name = "CertificateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String certificateID;

    @XmlElement(name = "Subject")
    protected String subject;

    @XmlElement(name = "ValidNotBefore")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String validNotBefore;

    @XmlElement(name = "ValidNotAfter")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String validNotAfter;

    @XmlElement(name = "Extension")
    protected CertificateGenerationParametersExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setCertificateID(String value) {
        this.certificateID = value;
    }

    public void setSubject(String value) {
        this.subject = value;
    }

    public void setValidNotBefore(String value) {
        this.validNotBefore = value;
    }

    public void setValidNotAfter(String value) {
        this.validNotAfter = value;
    }

    public void setExtension(CertificateGenerationParametersExtension value) {
        this.extension = value;
    }
}
