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
        name = "FindMetadataResultList",
        propOrder = {"searchState", "result"})
public class FindMetadataResultList {

    @XmlElement(name = "SearchState", required = true)
    protected SearchState searchState;

    @XmlElement(name = "Result")
    protected List<FindMetadataResult> result;

    public void setSearchState(SearchState value) {
        this.searchState = value;
    }

    public List<FindMetadataResult> getResult() {
        if (result == null) {
            result = new ArrayList<FindMetadataResult>();
        }
        return this.result;
    }
}
