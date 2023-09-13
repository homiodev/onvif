
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.NTPInformation;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"ntpInformation"})
@XmlRootElement(name = "GetNTPResponse")
public class GetNTPResponse {

    @XmlElement(name = "NTPInformation", required = true)
    protected NTPInformation ntpInformation;

    public NTPInformation getNTPInformation() {
        return ntpInformation;
    }

    public void setNTPInformation(NTPInformation value) {
        this.ntpInformation = value;
    }
}
