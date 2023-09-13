
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.MetadataConfigurationOptions;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"options"})
@XmlRootElement(name = "GetMetadataConfigurationOptionsResponse")
public class GetMetadataConfigurationOptionsResponse {

    @XmlElement(name = "Options", required = true)
    protected MetadataConfigurationOptions options;

    public void setOptions(MetadataConfigurationOptions value) {
        this.options = value;
    }
}
