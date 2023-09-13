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

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "VideoSourceConfiguration",
        propOrder = {"sourceToken", "bounds", "any", "extension"})
public class VideoSourceConfiguration extends ConfigurationEntity {

    @XmlElement(name = "SourceToken", required = true)
    protected String sourceToken;

    @Getter @XmlElement(name = "Bounds", required = true)
    protected IntRectangle bounds;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlElement(name = "Extension")
    protected VideoSourceConfigurationExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setSourceToken(String value) {
        this.sourceToken = value;
    }

    public void setBounds(IntRectangle value) {
        this.bounds = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public void setExtension(VideoSourceConfigurationExtension value) {
        this.extension = value;
    }
}
