
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.VideoAnalyticsConfiguration;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"configuration", "forcePersistence"})
@XmlRootElement(name = "SetVideoAnalyticsConfiguration")
public class SetVideoAnalyticsConfiguration {

    @XmlElement(name = "Configuration", required = true)
    protected VideoAnalyticsConfiguration configuration;

    @XmlElement(name = "ForcePersistence")
    protected boolean forcePersistence;

    public void setConfiguration(VideoAnalyticsConfiguration value) {
        this.configuration = value;
    }

    public void setForcePersistence(boolean value) {
        this.forcePersistence = value;
    }
}
