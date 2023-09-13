package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.AudioSource;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"audioSources"})
@XmlRootElement(name = "GetAudioSourcesResponse")
public class GetAudioSourcesResponse {

    @XmlElement(name = "AudioSources")
    protected List<AudioSource> audioSources;

    public List<AudioSource> getAudioSources() {
        if (audioSources == null) {
            audioSources = new ArrayList<>();
        }
        return this.audioSources;
    }
}
