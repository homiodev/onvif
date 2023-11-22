package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vector2D")
@NoArgsConstructor
public class Vector2D {

    @XmlAttribute(name = "x", required = true)
    protected float x;

    @XmlAttribute(name = "y", required = true)
    protected float y;

    @XmlAttribute(name = "space")
    @XmlSchemaType(name = "anyURI")
    protected String space;

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{x=%s, y=%s}".formatted(x, y);
    }
}
