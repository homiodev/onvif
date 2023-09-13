
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.SystemLogType;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"logType"})
@XmlRootElement(name = "GetSystemLog")
public class GetSystemLog {

    @XmlElement(name = "LogType", required = true)
    protected SystemLogType logType;

    public void setLogType(SystemLogType value) {
        this.logType = value;
    }
}
