
package org.onvif.ver10.media.wsdl;

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
        propOrder = {"totalNumber", "jpeg", "h264", "mpeg4"})
@XmlRootElement(name = "GetGuaranteedNumberOfVideoEncoderInstancesResponse")
public class GetGuaranteedNumberOfVideoEncoderInstancesResponse {

    @XmlElement(name = "TotalNumber")
    protected int totalNumber;

    @XmlElement(name = "JPEG")
    protected Integer jpeg;

    @Getter @XmlElement(name = "H264")
    protected Integer h264;

    @XmlElement(name = "MPEG4")
    protected Integer mpeg4;

    public void setTotalNumber(int value) {
        this.totalNumber = value;
    }

    public Integer getJPEG() {
        return jpeg;
    }

    public void setJPEG(Integer value) {
        this.jpeg = value;
    }

    public void setH264(Integer value) {
        this.h264 = value;
    }

    public Integer getMPEG4() {
        return mpeg4;
    }

    public void setMPEG4(Integer value) {
        this.mpeg4 = value;
    }
}
