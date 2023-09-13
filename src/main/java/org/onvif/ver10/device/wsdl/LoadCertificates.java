
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.Certificate;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"nvtCertificate"})
@XmlRootElement(name = "LoadCertificates")
public class LoadCertificates {

    @XmlElement(name = "NVTCertificate", required = true)
    protected List<Certificate> nvtCertificate;

    public List<Certificate> getNVTCertificate() {
        if (nvtCertificate == null) {
            nvtCertificate = new ArrayList<Certificate>();
        }
        return this.nvtCertificate;
    }
}
