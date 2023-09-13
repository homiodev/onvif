package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "MetadataInput",
        propOrder = {"metadataConfig", "extension"})
public class MetadataInput {

    @XmlElement(name = "MetadataConfig")
    protected List<Config> metadataConfig;

    @Getter @XmlElement(name = "Extension")
    protected MetadataInputExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<Config> getMetadataConfig() {
        if (metadataConfig == null) {
            metadataConfig = new ArrayList<Config>();
        }
        return this.metadataConfig;
    }

    public void setExtension(MetadataInputExtension value) {
        this.extension = value;
    }
}
