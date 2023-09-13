package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FloatList",
        propOrder = {"items"})
public class FloatList {

    @XmlElement(name = "Items", type = Float.class)
    protected List<Float> items;

    public List<Float> getItems() {
        if (items == null) {
            items = new ArrayList<Float>();
        }
        return this.items;
    }
}
