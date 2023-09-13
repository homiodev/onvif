
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.HostnameInformation;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"hostnameInformation"})
@XmlRootElement(name = "GetHostnameResponse")
public class GetHostnameResponse {

    @XmlElement(name = "HostnameInformation", required = true)
    protected HostnameInformation hostnameInformation;

    public void setHostnameInformation(HostnameInformation value) {
        this.hostnameInformation = value;
    }
}
