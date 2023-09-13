package org.onvif.ver20.imaging.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.ImagingSettings20;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"imagingSettings"})
@XmlRootElement(name = "GetImagingSettingsResponse")
public class GetImagingSettingsResponse {

    @XmlElement(name = "ImagingSettings", required = true)
    protected ImagingSettings20 imagingSettings;

    public void setImagingSettings(ImagingSettings20 value) {
        this.imagingSettings = value;
    }
}
