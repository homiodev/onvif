
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
        propOrder = {"rebootNeeded"})
@XmlRootElement(name = "SetHostnameFromDHCPResponse")
public class SetHostnameFromDHCPResponse {

    @XmlElement(name = "RebootNeeded")
    protected boolean rebootNeeded;

    public void setRebootNeeded(boolean value) {
        this.rebootNeeded = value;
    }
}
