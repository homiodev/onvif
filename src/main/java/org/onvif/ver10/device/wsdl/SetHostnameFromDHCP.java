
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
        propOrder = {"fromDHCP"})
@XmlRootElement(name = "SetHostnameFromDHCP")
public class SetHostnameFromDHCP {

    @XmlElement(name = "FromDHCP")
    protected boolean fromDHCP;

    public void setFromDHCP(boolean value) {
        this.fromDHCP = value;
    }
}
