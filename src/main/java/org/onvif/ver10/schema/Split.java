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
        name = "Split",
        propOrder = {"from", "to"})
public class Split {

    @XmlElement(required = true)
    protected ObjectId from;

    @XmlElement(required = true)
    protected List<ObjectId> to;

    public void setFrom(ObjectId value) {
        this.from = value;
    }

    public List<ObjectId> getTo() {
        if (to == null) {
            to = new ArrayList<ObjectId>();
        }
        return this.to;
    }
}
