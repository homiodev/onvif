
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.NetworkZeroConfiguration;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"zeroConfiguration"})
@XmlRootElement(name = "GetZeroConfigurationResponse")
public class GetZeroConfigurationResponse {

    @XmlElement(name = "ZeroConfiguration", required = true)
    protected NetworkZeroConfiguration zeroConfiguration;

    public void setZeroConfiguration(NetworkZeroConfiguration value) {
        this.zeroConfiguration = value;
    }
}
