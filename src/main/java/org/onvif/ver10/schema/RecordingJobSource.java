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

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "RecordingJobSource",
        propOrder = {"sourceToken", "autoCreateReceiver", "tracks", "extension"})
public class RecordingJobSource {

    @XmlElement(name = "SourceToken")
    protected SourceReference sourceToken;

    @XmlElement(name = "AutoCreateReceiver")
    protected Boolean autoCreateReceiver;

    @XmlElement(name = "Tracks")
    protected List<RecordingJobTrack> tracks;

    @Getter @XmlElement(name = "Extension")
    protected RecordingJobSourceExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setSourceToken(SourceReference value) {
        this.sourceToken = value;
    }

    public Boolean isAutoCreateReceiver() {
        return autoCreateReceiver;
    }

    public void setAutoCreateReceiver(Boolean value) {
        this.autoCreateReceiver = value;
    }

    public List<RecordingJobTrack> getTracks() {
        if (tracks == null) {
            tracks = new ArrayList<RecordingJobTrack>();
        }
        return this.tracks;
    }

    public void setExtension(RecordingJobSourceExtension value) {
        this.extension = value;
    }
}
