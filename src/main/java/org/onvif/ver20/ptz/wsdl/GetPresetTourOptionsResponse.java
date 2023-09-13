package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.PTZPresetTourOptions;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"options"})
@XmlRootElement(name = "GetPresetTourOptionsResponse")
public class GetPresetTourOptionsResponse {

    @XmlElement(name = "Options", required = true)
    protected PTZPresetTourOptions options;

    public void setOptions(PTZPresetTourOptions value) {
        this.options = value;
    }
}
