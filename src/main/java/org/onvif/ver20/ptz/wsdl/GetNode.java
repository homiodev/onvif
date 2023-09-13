package org.onvif.ver20.ptz.wsdl;

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
        propOrder = {"nodeToken"})
@XmlRootElement(name = "GetNode")
public class GetNode {

    @XmlElement(name = "NodeToken", required = true)
    protected String nodeToken;

    public void setNodeToken(String value) {
        this.nodeToken = value;
    }
}
