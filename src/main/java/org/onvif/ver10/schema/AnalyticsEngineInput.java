package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "AnalyticsEngineInput",
        propOrder = {"sourceIdentification", "videoInput", "metadataInput", "any"})
public class AnalyticsEngineInput extends ConfigurationEntity {

    @XmlElement(name = "SourceIdentification", required = true)
    protected SourceIdentification sourceIdentification;

    @XmlElement(name = "VideoInput", required = true)
    protected VideoEncoderConfiguration videoInput;

    @XmlElement(name = "MetadataInput", required = true)
    protected MetadataInput metadataInput;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
