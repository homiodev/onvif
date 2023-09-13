package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ItemList",
        propOrder = {"simpleItem", "elementItem", "extension"})
public class ItemList {

    @XmlElement(name = "SimpleItem")
    protected List<ItemList.SimpleItem> simpleItem;

    @XmlElement(name = "ElementItem")
    protected List<ItemList.ElementItem> elementItem;

    @Getter @XmlElement(name = "Extension")
    protected ItemListExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<ItemList.SimpleItem> getSimpleItem() {
        if (simpleItem == null) {
            simpleItem = new ArrayList<ItemList.SimpleItem>();
        }
        return this.simpleItem;
    }

    public List<ItemList.ElementItem> getElementItem() {
        if (elementItem == null) {
            elementItem = new ArrayList<ItemList.ElementItem>();
        }
        return this.elementItem;
    }

    public void setExtension(ItemListExtension value) {
        this.extension = value;
    }

    @Getter
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"any"})
    public static class ElementItem {

        @XmlAnyElement(lax = true)
        protected java.lang.Object any;

        @XmlAttribute(name = "Name", required = true)
        protected String name;

        public void setAny(java.lang.Object value) {
            this.any = value;
        }

        public void setName(String value) {
            this.name = value;
        }
    }

    @Getter
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SimpleItem {

        @XmlAttribute(name = "Name", required = true)
        protected String name;

        @XmlAttribute(name = "Value", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String value;

        public void setName(String value) {
            this.name = value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
