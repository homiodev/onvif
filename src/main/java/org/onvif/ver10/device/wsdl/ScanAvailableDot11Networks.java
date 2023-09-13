
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
        propOrder = {"interfaceToken"})
@XmlRootElement(name = "ScanAvailableDot11Networks")
public class ScanAvailableDot11Networks {

    @XmlElement(name = "InterfaceToken", required = true)
    protected String interfaceToken;

    public void setInterfaceToken(String value) {
        this.interfaceToken = value;
    }
}
