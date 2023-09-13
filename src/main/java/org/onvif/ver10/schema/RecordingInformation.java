package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "RecordingInformation",
        propOrder = {
                "recordingToken",
                "source",
                "earliestRecording",
                "latestRecording",
                "content",
                "track",
                "recordingStatus",
                "any"
        })
public class RecordingInformation {

    @XmlElement(name = "RecordingToken", required = true)
    protected String recordingToken;

    @Getter @XmlElement(name = "Source", required = true)
    protected RecordingSourceInformation source;

    @Getter @XmlElement(name = "EarliestRecording")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestRecording;

    @Getter @XmlElement(name = "LatestRecording")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestRecording;

    @Getter @XmlElement(name = "Content", required = true)
    protected String content;

    @XmlElement(name = "Track")
    protected List<TrackInformation> track;

    @Getter @XmlElement(name = "RecordingStatus", required = true)
    protected RecordingStatus recordingStatus;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setRecordingToken(String value) {
        this.recordingToken = value;
    }

    public void setSource(RecordingSourceInformation value) {
        this.source = value;
    }

    public void setEarliestRecording(XMLGregorianCalendar value) {
        this.earliestRecording = value;
    }

    public void setLatestRecording(XMLGregorianCalendar value) {
        this.latestRecording = value;
    }

    public void setContent(String value) {
        this.content = value;
    }

    public List<TrackInformation> getTrack() {
        if (track == null) {
            track = new ArrayList<TrackInformation>();
        }
        return this.track;
    }

    public void setRecordingStatus(RecordingStatus value) {
        this.recordingStatus = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
