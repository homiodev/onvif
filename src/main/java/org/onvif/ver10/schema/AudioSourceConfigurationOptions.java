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
        name = "AudioSourceConfigurationOptions",
        propOrder = {"inputTokensAvailable", "extension"})
public class AudioSourceConfigurationOptions {

    @XmlElement(name = "InputTokensAvailable", required = true)
    protected List<String> inputTokensAvailable;

    @Getter @XmlElement(name = "Extension")
    protected AudioSourceOptionsExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<String> getInputTokensAvailable() {
        if (inputTokensAvailable == null) {
            inputTokensAvailable = new ArrayList<>();
        }
        return this.inputTokensAvailable;
    }

    public void setExtension(AudioSourceOptionsExtension value) {
        this.extension = value;
    }
}
