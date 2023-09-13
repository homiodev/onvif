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
        name = "CertificateInformation",
        propOrder = {
                "certificateID",
                "issuerDN",
                "subjectDN",
                "keyUsage",
                "extendedKeyUsage",
                "keyLength",
                "version",
                "serialNum",
                "signatureAlgorithm",
                "validity",
                "extension"
        })
public class CertificateInformation {

    @XmlElement(name = "CertificateID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String certificateID;

    @XmlElement(name = "IssuerDN")
    protected String issuerDN;

    @XmlElement(name = "SubjectDN")
    protected String subjectDN;

    @XmlElement(name = "KeyUsage")
    protected CertificateUsage keyUsage;

    @XmlElement(name = "ExtendedKeyUsage")
    protected CertificateUsage extendedKeyUsage;

    @XmlElement(name = "KeyLength")
    protected Integer keyLength;

    @XmlElement(name = "Version")
    protected String version;

    @XmlElement(name = "SerialNum")
    protected String serialNum;

    @XmlElement(name = "SignatureAlgorithm")
    protected String signatureAlgorithm;

    @XmlElement(name = "Validity")
    protected DateTimeRange validity;

    @XmlElement(name = "Extension")
    protected CertificateInformationExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setCertificateID(String value) {
        this.certificateID = value;
    }

    public void setIssuerDN(String value) {
        this.issuerDN = value;
    }

    public void setSubjectDN(String value) {
        this.subjectDN = value;
    }

    public void setKeyUsage(CertificateUsage value) {
        this.keyUsage = value;
    }

    public void setExtendedKeyUsage(CertificateUsage value) {
        this.extendedKeyUsage = value;
    }

    public void setKeyLength(Integer value) {
        this.keyLength = value;
    }

    public void setVersion(String value) {
        this.version = value;
    }

    public void setSerialNum(String value) {
        this.serialNum = value;
    }

    public void setSignatureAlgorithm(String value) {
        this.signatureAlgorithm = value;
    }

    public void setValidity(DateTimeRange value) {
        this.validity = value;
    }

    public void setExtension(CertificateInformationExtension value) {
        this.extension = value;
    }
}
