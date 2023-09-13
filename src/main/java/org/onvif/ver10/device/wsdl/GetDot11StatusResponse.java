
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.Dot11Status;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"status"})
@XmlRootElement(name = "GetDot11StatusResponse")
public class GetDot11StatusResponse {

    @XmlElement(name = "Status", required = true)
    protected Dot11Status status;

    public void setStatus(Dot11Status value) {
        this.status = value;
    }
}
