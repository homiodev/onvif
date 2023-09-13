package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.OSDConfigurationOptions;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"osdOptions"})
@XmlRootElement(name = "GetOSDOptionsResponse")
public class GetOSDOptionsResponse {

    @XmlElement(name = "OSDOptions", required = true)
    protected OSDConfigurationOptions osdOptions;

    public OSDConfigurationOptions getOSDOptions() {
        return osdOptions;
    }

    public void setOSDOptions(OSDConfigurationOptions value) {
        this.osdOptions = value;
    }
}
