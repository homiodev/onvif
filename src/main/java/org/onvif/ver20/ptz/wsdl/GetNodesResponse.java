package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.PTZNode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"ptzNode"})
@XmlRootElement(name = "GetNodesResponse")
public class GetNodesResponse {

    @XmlElement(name = "PTZNode")
    protected List<PTZNode> ptzNode;

    public List<PTZNode> getPTZNode() {
        if (ptzNode == null) {
            ptzNode = new ArrayList<PTZNode>();
        }
        return this.ptzNode;
    }
}
