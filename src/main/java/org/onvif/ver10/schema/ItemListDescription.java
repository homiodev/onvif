package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ItemListDescription",
        propOrder = {"simpleItemDescription", "elementItemDescription", "extension"})
public class ItemListDescription {

    @XmlElement(name = "SimpleItemDescription")
    protected List<ItemListDescription.SimpleItemDescription> simpleItemDescription;

    @XmlElement(name = "ElementItemDescription")
    protected List<ItemListDescription.ElementItemDescription> elementItemDescription;

    @Getter @XmlElement(name = "Extension")
    protected ItemListDescriptionExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<ItemListDescription.SimpleItemDescription> getSimpleItemDescription() {
        if (simpleItemDescription == null) {
            simpleItemDescription = new ArrayList<ItemListDescription.SimpleItemDescription>();
        }
        return this.simpleItemDescription;
    }

    public List<ItemListDescription.ElementItemDescription> getElementItemDescription() {
        if (elementItemDescription == null) {
            elementItemDescription = new ArrayList<ItemListDescription.ElementItemDescription>();
        }
        return this.elementItemDescription;
    }

    public void setExtension(ItemListDescriptionExtension value) {
        this.extension = value;
    }

    @Getter
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ElementItemDescription {

        @XmlAttribute(name = "Name", required = true)
        protected String name;

        @XmlAttribute(name = "Type", required = true)
        protected QName type;

        public void setName(String value) {
            this.name = value;
        }

        public void setType(QName value) {
            this.type = value;
        }
    }

    @Getter
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SimpleItemDescription {

        @XmlAttribute(name = "Name", required = true)
        protected String name;

        @XmlAttribute(name = "Type", required = true)
        protected QName type;

        public void setName(String value) {
            this.name = value;
        }

        public void setType(QName value) {
            this.type = value;
        }
    }
}
