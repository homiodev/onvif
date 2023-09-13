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
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "RecordingSourceInformation",
        propOrder = {"sourceId", "name", "location", "description", "address", "any"})
public class RecordingSourceInformation {

    @XmlElement(name = "SourceId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String sourceId;

    @Getter @XmlElement(name = "Name", required = true)
    protected String name;

    @Getter @XmlElement(name = "Location", required = true)
    protected String location;

    @Getter @XmlElement(name = "Description", required = true)
    protected String description;

    @Getter @XmlElement(name = "Address", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String address;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setSourceId(String value) {
        this.sourceId = value;
    }

    public void setName(String value) {
        this.name = value;
    }

    public void setLocation(String value) {
        this.location = value;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public void setAddress(String value) {
        this.address = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
