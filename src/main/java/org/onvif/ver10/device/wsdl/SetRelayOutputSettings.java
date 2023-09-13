
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.RelayOutputSettings;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"relayOutputToken", "properties"})
@XmlRootElement(name = "SetRelayOutputSettings")
public class SetRelayOutputSettings {

    @XmlElement(name = "RelayOutputToken", required = true)
    protected String relayOutputToken;

    @XmlElement(name = "Properties", required = true)
    protected RelayOutputSettings properties;

    public void setRelayOutputToken(String value) {
        this.relayOutputToken = value;
    }

    public void setProperties(RelayOutputSettings value) {
        this.properties = value;
    }
}
