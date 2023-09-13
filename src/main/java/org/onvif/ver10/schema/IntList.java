package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "IntList",
        propOrder = {"items"})
public class IntList {

    @XmlElement(name = "Items", type = Integer.class)
    protected List<Integer> items;

    public List<Integer> getItems() {
        if (items == null) {
            items = new ArrayList<Integer>();
        }
        return this.items;
    }
}
