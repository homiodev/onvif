package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRectangle")
public class IntRectangle {

    @XmlAttribute(name = "x", required = true)
    protected int x;

    @XmlAttribute(name = "y", required = true)
    protected int y;

    @XmlAttribute(name = "width", required = true)
    protected int width;

    @XmlAttribute(name = "height", required = true)
    protected int height;

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    public void setWidth(int value) {
        this.width = value;
    }

    public void setHeight(int value) {
        this.height = value;
    }
}
