
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.AttachmentData;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"firmware"})
@XmlRootElement(name = "UpgradeSystemFirmware")
public class UpgradeSystemFirmware {

    @XmlElement(name = "Firmware", required = true)
    protected AttachmentData firmware;

    public void setFirmware(AttachmentData value) {
        this.firmware = value;
    }
}
