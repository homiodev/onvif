
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
@XmlRootElement(name = "SystemRebootResponse")
public class SystemRebootResponse {

    @XmlElement(name = "Message", required = true)
    protected String message;

    public void setMessage(String value) {
        this.message = value;
    }
}
