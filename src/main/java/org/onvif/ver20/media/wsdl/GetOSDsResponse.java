package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.OSDConfiguration;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"osd"})
@XmlRootElement(name = "GetOSDsResponse")
public class GetOSDsResponse {

    @XmlElement(name = "OSD", required = true)
    protected OSDConfiguration osd;

    public OSDConfiguration getOSD() {
        return osd;
    }

    public void setOSD(OSDConfiguration value) {
        this.osd = value;
    }
}
