package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.PTZConfiguration;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"ptzConfiguration"})
@XmlRootElement(name = "GetConfigurationsResponse")
public class GetConfigurationsResponse {

    @XmlElement(name = "PTZConfiguration")
    protected List<PTZConfiguration> ptzConfiguration;

    public List<PTZConfiguration> getPTZConfiguration() {
        if (ptzConfiguration == null) {
            ptzConfiguration = new ArrayList<PTZConfiguration>();
        }
        return this.ptzConfiguration;
    }
}
