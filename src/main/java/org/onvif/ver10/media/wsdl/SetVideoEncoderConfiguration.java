
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.VideoEncoderConfiguration;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"configuration", "forcePersistence"})
@XmlRootElement(name = "SetVideoEncoderConfiguration")
public class SetVideoEncoderConfiguration {

    @XmlElement(name = "Configuration", required = true)
    protected VideoEncoderConfiguration configuration;

    @XmlElement(name = "ForcePersistence")
    protected boolean forcePersistence;

    public void setConfiguration(VideoEncoderConfiguration value) {
        this.configuration = value;
    }

    public void setForcePersistence(boolean value) {
        this.forcePersistence = value;
    }
}
