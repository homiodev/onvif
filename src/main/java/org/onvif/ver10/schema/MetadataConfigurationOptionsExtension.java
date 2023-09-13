package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "MetadataConfigurationOptionsExtension",
        propOrder = {"compressionType", "extension"})
public class MetadataConfigurationOptionsExtension {

    @XmlElement(name = "CompressionType")
    protected List<String> compressionType;

    @Getter @XmlElement(name = "Extension")
    protected MetadataConfigurationOptionsExtension2 extension;

    public List<String> getCompressionType() {
        if (compressionType == null) {
            compressionType = new ArrayList<>();
        }
        return this.compressionType;
    }

    public void setExtension(MetadataConfigurationOptionsExtension2 value) {
        this.extension = value;
    }
}
