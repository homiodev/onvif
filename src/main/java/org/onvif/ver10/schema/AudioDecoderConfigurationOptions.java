package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "AudioDecoderConfigurationOptions",
        propOrder = {"aacDecOptions", "g711DecOptions", "g726DecOptions", "extension"})
public class AudioDecoderConfigurationOptions {

    @XmlElement(name = "AACDecOptions")
    protected AACDecOptions aacDecOptions;

    @Getter @XmlElement(name = "G711DecOptions")
    protected G711DecOptions g711DecOptions;

    @Getter @XmlElement(name = "G726DecOptions")
    protected G726DecOptions g726DecOptions;

    @Getter @XmlElement(name = "Extension")
    protected AudioDecoderConfigurationOptionsExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public AACDecOptions getAACDecOptions() {
        return aacDecOptions;
    }

    public void setAACDecOptions(AACDecOptions value) {
        this.aacDecOptions = value;
    }

    public void setG711DecOptions(G711DecOptions value) {
        this.g711DecOptions = value;
    }

    public void setG726DecOptions(G726DecOptions value) {
        this.g726DecOptions = value;
    }

    public void setExtension(AudioDecoderConfigurationOptionsExtension value) {
        this.extension = value;
    }
}
