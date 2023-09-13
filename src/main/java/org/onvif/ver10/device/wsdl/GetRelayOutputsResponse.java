
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.RelayOutput;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"relayOutputs"})
@XmlRootElement(name = "GetRelayOutputsResponse")
public class GetRelayOutputsResponse {

    @XmlElement(name = "RelayOutputs")
    protected List<RelayOutput> relayOutputs;

    public List<RelayOutput> getRelayOutputs() {
        if (relayOutputs == null) {
            relayOutputs = new ArrayList<RelayOutput>();
        }
        return this.relayOutputs;
    }
}
