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
        name = "AudioAnalyticsStream",
        propOrder = {"audioDescriptor", "extension"})
public class AudioAnalyticsStream {

    @XmlElement(name = "AudioDescriptor")
    protected List<AudioDescriptor> audioDescriptor;

    @Getter @XmlElement(name = "Extension")
    protected AudioAnalyticsStreamExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<AudioDescriptor> getAudioDescriptor() {
        if (audioDescriptor == null) {
            audioDescriptor = new ArrayList<>();
        }
        return this.audioDescriptor;
    }

    public void setExtension(AudioAnalyticsStreamExtension value) {
        this.extension = value;
    }
}
