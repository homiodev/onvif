
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.CertificateInformation;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"certificateInformation"})
@XmlRootElement(name = "GetCertificateInformationResponse")
public class GetCertificateInformationResponse {

    @XmlElement(name = "CertificateInformation", required = true)
    protected CertificateInformation certificateInformation;

    public void setCertificateInformation(CertificateInformation value) {
        this.certificateInformation = value;
    }
}
