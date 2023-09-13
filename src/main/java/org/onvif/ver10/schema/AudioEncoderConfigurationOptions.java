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
        name = "AudioEncoderConfigurationOptions",
        propOrder = {"options"})
public class AudioEncoderConfigurationOptions {

    @XmlElement(name = "Options")
    protected List<AudioEncoderConfigurationOption> options;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<AudioEncoderConfigurationOption> getOptions() {
        if (options == null) {
            options = new ArrayList<AudioEncoderConfigurationOption>();
        }
        return this.options;
    }
}
