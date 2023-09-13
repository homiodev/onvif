
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.MetadataConfiguration;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"configuration", "forcePersistence"})
@XmlRootElement(name = "SetMetadataConfiguration")
public class SetMetadataConfiguration {

    @XmlElement(name = "Configuration", required = true)
    protected MetadataConfiguration configuration;

    @XmlElement(name = "ForcePersistence")
    protected boolean forcePersistence;

    public void setConfiguration(MetadataConfiguration value) {
        this.configuration = value;
    }

    public void setForcePersistence(boolean value) {
        this.forcePersistence = value;
    }
}
