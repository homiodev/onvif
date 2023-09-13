package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Merge",
        propOrder = {"from", "to"})
public class Merge {

    @XmlElement(required = true)
    protected List<ObjectId> from;

    @Getter @XmlElement(required = true)
    protected ObjectId to;

    public List<ObjectId> getFrom() {
        if (from == null) {
            from = new ArrayList<ObjectId>();
        }
        return this.from;
    }

    public void setTo(ObjectId value) {
        this.to = value;
    }
}
