package org.onvif.ver20.media.wsdl;

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
        propOrder = {"reboot"})
@XmlRootElement(name = "SetVideoSourceModeResponse")
public class SetVideoSourceModeResponse {

    @XmlElement(name = "Reboot")
    protected boolean reboot;

    public void setReboot(boolean value) {
        this.reboot = value;
    }
}
