
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.RelayLogicalState;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"relayOutputToken", "logicalState"})
@XmlRootElement(name = "SetRelayOutputState")
public class SetRelayOutputState {

    @XmlElement(name = "RelayOutputToken", required = true)
    protected String relayOutputToken;

    @XmlElement(name = "LogicalState", required = true)
    protected RelayLogicalState logicalState;

    public void setRelayOutputToken(String value) {
        this.relayOutputToken = value;
    }

    public void setLogicalState(RelayLogicalState value) {
        this.logicalState = value;
    }
}
