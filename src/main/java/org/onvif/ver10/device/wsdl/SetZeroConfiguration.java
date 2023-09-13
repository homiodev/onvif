
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
        propOrder = {"interfaceToken", "enabled"})
@XmlRootElement(name = "SetZeroConfiguration")
public class SetZeroConfiguration {

    @XmlElement(name = "InterfaceToken", required = true)
    protected String interfaceToken;

    @XmlElement(name = "Enabled")
    protected boolean enabled;

    public void setInterfaceToken(String value) {
        this.interfaceToken = value;
    }

    public void setEnabled(boolean value) {
        this.enabled = value;
    }
}
