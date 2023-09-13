
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"enabled"})
@XmlRootElement(name = "SetClientCertificateMode")
public class SetClientCertificateMode {

    @XmlElement(name = "Enabled")
    protected boolean enabled;

    public void setEnabled(boolean value) {
        this.enabled = value;
    }
}
