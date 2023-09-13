package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "H264Configuration",
        propOrder = {"govLength", "h264Profile"})
public class H264Configuration {

    @XmlElement(name = "GovLength")
    protected int govLength;

    @XmlElement(name = "H264Profile", required = true)
    protected H264Profile h264Profile;

    public void setGovLength(int value) {
        this.govLength = value;
    }

    public void setH264Profile(H264Profile value) {
        this.h264Profile = value;
    }
}
