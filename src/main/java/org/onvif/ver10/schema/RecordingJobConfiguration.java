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
        name = "RecordingJobConfiguration",
        propOrder = {"recordingToken", "mode", "priority", "source", "extension"})
public class RecordingJobConfiguration {

    @XmlElement(name = "RecordingToken", required = true)
    protected String recordingToken;

    @Getter @XmlElement(name = "Mode", required = true)
    protected String mode;

    @Getter @XmlElement(name = "Priority")
    protected int priority;

    @XmlElement(name = "Source")
    protected List<RecordingJobSource> source;

    @Getter @XmlElement(name = "Extension")
    protected RecordingJobConfigurationExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setRecordingToken(String value) {
        this.recordingToken = value;
    }

    public void setMode(String value) {
        this.mode = value;
    }

    public void setPriority(int value) {
        this.priority = value;
    }

    public List<RecordingJobSource> getSource() {
        if (source == null) {
            source = new ArrayList<RecordingJobSource>();
        }
        return this.source;
    }

    public void setExtension(RecordingJobConfigurationExtension value) {
        this.extension = value;
    }
}
