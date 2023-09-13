
package org.w3._2005._08.addressing;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "RelatesToType",
        propOrder = {"value"})
public class RelatesToType {

    @XmlValue
    @XmlSchemaType(name = "anyURI")
    protected String value;

    @XmlAttribute(name = "RelationshipType")
    protected String relationshipType;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setValue(String value) {
        this.value = value;
    }

    public String getRelationshipType() {
        if (relationshipType == null) {
            return "http://www.w3.org/2005/08/addressing/reply";
        } else {
            return relationshipType;
        }
    }

    public void setRelationshipType(String value) {
        this.relationshipType = value;
    }
}
