
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
        propOrder = {"message"})
@XmlRootElement(name = "UpgradeSystemFirmwareResponse")
public class UpgradeSystemFirmwareResponse {

    @XmlElement(name = "Message")
    protected String message;

    public void setMessage(String value) {
        this.message = value;
    }
}
