
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.CertificateWithPrivateKey;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"certificateWithPrivateKey"})
@XmlRootElement(name = "LoadCertificateWithPrivateKey")
public class LoadCertificateWithPrivateKey {

    @XmlElement(name = "CertificateWithPrivateKey", required = true)
    protected List<CertificateWithPrivateKey> certificateWithPrivateKey;

    public List<CertificateWithPrivateKey> getCertificateWithPrivateKey() {
        if (certificateWithPrivateKey == null) {
            certificateWithPrivateKey = new ArrayList<CertificateWithPrivateKey>();
        }
        return this.certificateWithPrivateKey;
    }
}
