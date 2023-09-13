package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PTZNode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"ptzNode"})
@XmlRootElement(name = "GetNodeResponse")
public class GetNodeResponse {

    @XmlElement(name = "PTZNode", required = true)
    protected PTZNode ptzNode;

    public PTZNode getPTZNode() {
        return ptzNode;
    }

    public void setPTZNode(PTZNode value) {
        this.ptzNode = value;
    }
}
