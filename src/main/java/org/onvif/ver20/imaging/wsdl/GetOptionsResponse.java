package org.onvif.ver20.imaging.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.ImagingOptions20;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"imagingOptions"})
@XmlRootElement(name = "GetOptionsResponse")
public class GetOptionsResponse {

    @XmlElement(name = "ImagingOptions", required = true)
    protected ImagingOptions20 imagingOptions;

    public void setImagingOptions(ImagingOptions20 value) {
        this.imagingOptions = value;
    }
}
