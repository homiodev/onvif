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

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ConfigDescription",
        propOrder = {"parameters", "messages", "extension"})
public class ConfigDescription {

    @XmlElement(name = "Parameters", required = true)
    protected ItemListDescription parameters;

    @XmlElement(name = "Messages")
    protected List<ConfigDescription.Messages> messages;

    @Getter @XmlElement(name = "Extension")
    protected ConfigDescriptionExtension extension;

    @Getter @XmlAttribute(name = "Name", required = true)
    protected QName name;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setParameters(ItemListDescription value) {
        this.parameters = value;
    }

    public List<ConfigDescription.Messages> getMessages() {
        if (messages == null) {
            messages = new ArrayList<ConfigDescription.Messages>();
        }
        return this.messages;
    }

    public void setExtension(ConfigDescriptionExtension value) {
        this.extension = value;
    }

    public void setName(QName value) {
        this.name = value;
    }

    @Getter
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"parentTopic"})
    public static class Messages extends MessageDescription {

        @XmlElement(name = "ParentTopic", required = true)
        protected String parentTopic;

        public void setParentTopic(String value) {
            this.parentTopic = value;
        }
    }
}
