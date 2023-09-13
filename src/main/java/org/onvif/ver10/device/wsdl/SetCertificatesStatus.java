
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.CertificateStatus;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"certificateStatus"})
@XmlRootElement(name = "SetCertificatesStatus")
public class SetCertificatesStatus {

    @XmlElement(name = "CertificateStatus")
    protected List<CertificateStatus> certificateStatus;

    public List<CertificateStatus> getCertificateStatus() {
        if (certificateStatus == null) {
            certificateStatus = new ArrayList<CertificateStatus>();
        }
        return this.certificateStatus;
    }
}
