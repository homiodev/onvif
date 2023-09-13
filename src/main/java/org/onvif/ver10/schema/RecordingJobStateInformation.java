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
        name = "RecordingJobStateInformation",
        propOrder = {"recordingToken", "state", "sources", "extension"})
public class RecordingJobStateInformation {

    @XmlElement(name = "RecordingToken", required = true)
    protected String recordingToken;

    @Getter @XmlElement(name = "State", required = true)
    protected String state;

    @XmlElement(name = "Sources")
    protected List<RecordingJobStateSource> sources;

    @Getter @XmlElement(name = "Extension")
    protected RecordingJobStateInformationExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setRecordingToken(String value) {
        this.recordingToken = value;
    }

    public void setState(String value) {
        this.state = value;
    }

    public List<RecordingJobStateSource> getSources() {
        if (sources == null) {
            sources = new ArrayList<RecordingJobStateSource>();
        }
        return this.sources;
    }

    public void setExtension(RecordingJobStateInformationExtension value) {
        this.extension = value;
    }
}
