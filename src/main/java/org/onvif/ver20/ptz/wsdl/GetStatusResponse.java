package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PTZStatus;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"ptzStatus"})
@XmlRootElement(name = "GetStatusResponse")
public class GetStatusResponse {

    @XmlElement(name = "PTZStatus", required = true)
    protected PTZStatus ptzStatus;

    public PTZStatus getPTZStatus() {
        return ptzStatus;
    }

    public void setPTZStatus(PTZStatus value) {
        this.ptzStatus = value;
    }
}
