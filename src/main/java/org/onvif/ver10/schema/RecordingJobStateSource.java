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
        name = "RecordingJobStateSource",
        propOrder = {"sourceToken", "state", "tracks", "any"})
public class RecordingJobStateSource {

    @XmlElement(name = "SourceToken", required = true)
    protected SourceReference sourceToken;

    @Getter @XmlElement(name = "State", required = true)
    protected String state;

    @Getter @XmlElement(name = "Tracks", required = true)
    protected RecordingJobStateTracks tracks;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setSourceToken(SourceReference value) {
        this.sourceToken = value;
    }

    public void setState(String value) {
        this.state = value;
    }

    public void setTracks(RecordingJobStateTracks value) {
        this.tracks = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
