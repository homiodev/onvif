package org.w3._2005._08.addressing;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "AttributedURIType",
        propOrder = {"value"})
@ToString
public class AttributedURIType {

    @XmlValue
    @XmlSchemaType(name = "anyURI")
    protected String value;

    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();
}
