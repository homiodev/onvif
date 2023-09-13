package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rectangle")
public class Rectangle {

    @XmlAttribute(name = "bottom")
    protected Float bottom;

    @XmlAttribute(name = "top")
    protected Float top;

    @XmlAttribute(name = "right")
    protected Float right;

    @XmlAttribute(name = "left")
    protected Float left;

    public void setBottom(Float value) {
        this.bottom = value;
    }

    public void setTop(Float value) {
        this.top = value;
    }

    public void setRight(Float value) {
        this.right = value;
    }

    public void setLeft(Float value) {
        this.left = value;
    }
}
