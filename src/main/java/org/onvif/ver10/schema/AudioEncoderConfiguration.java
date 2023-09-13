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
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "AudioEncoderConfiguration",
        propOrder = {"encoding", "bitrate", "sampleRate", "multicast", "sessionTimeout", "any"})
public class AudioEncoderConfiguration extends ConfigurationEntity {

    @XmlElement(name = "Encoding", required = true)
    protected AudioEncoding encoding;

    @XmlElement(name = "Bitrate")
    protected int bitrate;

    @XmlElement(name = "SampleRate")
    protected int sampleRate;

    @XmlElement(name = "Multicast", required = true)
    protected MulticastConfiguration multicast;

    @XmlElement(name = "SessionTimeout", required = true)
    protected Duration sessionTimeout;

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
