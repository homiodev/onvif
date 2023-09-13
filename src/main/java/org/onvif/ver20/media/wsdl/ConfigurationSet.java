package org.onvif.ver20.media.wsdl;

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
import org.onvif.ver10.schema.AudioDecoderConfiguration;
import org.onvif.ver10.schema.AudioEncoder2Configuration;
import org.onvif.ver10.schema.AudioOutputConfiguration;
import org.onvif.ver10.schema.AudioSourceConfiguration;
import org.onvif.ver10.schema.ConfigurationEntity;
import org.onvif.ver10.schema.MetadataConfiguration;
import org.onvif.ver10.schema.PTZConfiguration;
import org.onvif.ver10.schema.VideoEncoder2Configuration;
import org.onvif.ver10.schema.VideoSourceConfiguration;
import org.w3c.dom.Element;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ConfigurationSet",
        propOrder = {
                "videoSource",
                "audioSource",
                "videoEncoder",
                "audioEncoder",
                "analytics",
                "ptz",
                "metadata",
                "audioOutput",
                "audioDecoder",
                "any"
        })
public class ConfigurationSet {

    @XmlElement(name = "VideoSource")
    protected VideoSourceConfiguration videoSource;

    @Getter @XmlElement(name = "AudioSource")
    protected AudioSourceConfiguration audioSource;

    @Getter @XmlElement(name = "VideoEncoder")
    protected VideoEncoder2Configuration videoEncoder;

    @Getter @XmlElement(name = "AudioEncoder")
    protected AudioEncoder2Configuration audioEncoder;

    @Getter @XmlElement(name = "Analytics")
    protected ConfigurationEntity analytics;

    @XmlElement(name = "PTZ")
    protected PTZConfiguration ptz;

    @Getter @XmlElement(name = "Metadata")
    protected MetadataConfiguration metadata;

    @Getter @XmlElement(name = "AudioOutput")
    protected AudioOutputConfiguration audioOutput;

    @Getter @XmlElement(name = "AudioDecoder")
    protected AudioDecoderConfiguration audioDecoder;

    @XmlAnyElement
    protected List<Element> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setVideoSource(VideoSourceConfiguration value) {
        this.videoSource = value;
    }

    public void setAudioSource(AudioSourceConfiguration value) {
        this.audioSource = value;
    }

    public void setVideoEncoder(VideoEncoder2Configuration value) {
        this.videoEncoder = value;
    }

    public void setAudioEncoder(AudioEncoder2Configuration value) {
        this.audioEncoder = value;
    }

    public void setAnalytics(ConfigurationEntity value) {
        this.analytics = value;
    }

    public PTZConfiguration getPTZ() {
        return ptz;
    }

    public void setPTZ(PTZConfiguration value) {
        this.ptz = value;
    }

    public void setMetadata(MetadataConfiguration value) {
        this.metadata = value;
    }

    public void setAudioOutput(AudioOutputConfiguration value) {
        this.audioOutput = value;
    }

    public void setAudioDecoder(AudioDecoderConfiguration value) {
        this.audioDecoder = value;
    }

    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }
}
