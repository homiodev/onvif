

package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.AudioOutput;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"audioOutputs"})
@XmlRootElement(name = "GetAudioOutputsResponse")
public class GetAudioOutputsResponse {

    @XmlElement(name = "AudioOutputs")
    protected List<AudioOutput> audioOutputs;

    public List<AudioOutput> getAudioOutputs() {
        if (audioOutputs == null) {
            audioOutputs = new ArrayList<AudioOutput>();
        }
        return this.audioOutputs;
    }
}
