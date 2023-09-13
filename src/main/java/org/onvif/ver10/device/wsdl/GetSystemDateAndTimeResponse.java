
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.SystemDateTime;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"systemDateAndTime"})
@XmlRootElement(name = "GetSystemDateAndTimeResponse")
public class GetSystemDateAndTimeResponse {

    @XmlElement(name = "SystemDateAndTime", required = true)
    protected SystemDateTime systemDateAndTime;

    public void setSystemDateAndTime(SystemDateTime value) {
        this.systemDateAndTime = value;
    }
}
