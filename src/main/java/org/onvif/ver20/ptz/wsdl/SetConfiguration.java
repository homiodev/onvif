package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.PTZConfiguration;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"ptzConfiguration", "forcePersistence"})
@XmlRootElement(name = "SetConfiguration")
public class SetConfiguration {

    @XmlElement(name = "PTZConfiguration", required = true)
    protected PTZConfiguration ptzConfiguration;

    @Getter @XmlElement(name = "ForcePersistence")
    protected boolean forcePersistence;

    public PTZConfiguration getPTZConfiguration() {
        return ptzConfiguration;
    }

    public void setPTZConfiguration(PTZConfiguration value) {
        this.ptzConfiguration = value;
    }

    public void setForcePersistence(boolean value) {
        this.forcePersistence = value;
    }
}
