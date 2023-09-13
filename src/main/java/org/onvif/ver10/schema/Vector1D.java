package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vector1D")
public class Vector1D {

    @XmlAttribute(name = "x", required = true)
    protected float x;

    @XmlAttribute(name = "space")
    @XmlSchemaType(name = "anyURI")
    protected String space;
}
