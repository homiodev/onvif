
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"uploadUri", "uploadDelay", "expectedDownTime"})
@XmlRootElement(name = "StartFirmwareUpgradeResponse")
public class StartFirmwareUpgradeResponse {

    @XmlElement(name = "UploadUri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uploadUri;

    @XmlElement(name = "UploadDelay", required = true)
    protected Duration uploadDelay;

    @XmlElement(name = "ExpectedDownTime", required = true)
    protected Duration expectedDownTime;

    public void setUploadUri(String value) {
        this.uploadUri = value;
    }

    public void setUploadDelay(Duration value) {
        this.uploadDelay = value;
    }

    public void setExpectedDownTime(Duration value) {
        this.expectedDownTime = value;
    }
}
