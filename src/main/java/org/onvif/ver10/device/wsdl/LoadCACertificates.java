
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
        propOrder = {"caCertificate"})
@XmlRootElement(name = "LoadCACertificates")
public class LoadCACertificates {

    @XmlElement(name = "CACertificate", required = true)
    protected List<Certificate> caCertificate;

    public List<Certificate> getCACertificate() {
        if (caCertificate == null) {
            caCertificate = new ArrayList<Certificate>();
        }
        return this.caCertificate;
    }
}
