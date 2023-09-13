package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FindRecordingResultList",
        propOrder = {"searchState", "recordingInformation"})
public class FindRecordingResultList {

    @XmlElement(name = "SearchState", required = true)
    protected SearchState searchState;

    @XmlElement(name = "RecordingInformation")
    protected List<RecordingInformation> recordingInformation;

    public void setSearchState(SearchState value) {
        this.searchState = value;
    }

    public List<RecordingInformation> getRecordingInformation() {
        if (recordingInformation == null) {
            recordingInformation = new ArrayList<RecordingInformation>();
        }
        return this.recordingInformation;
    }
}
