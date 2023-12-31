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
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PTZNode",
        propOrder = {
                "name",
                "supportedPTZSpaces",
                "maximumNumberOfPresets",
                "homeSupported",
                "auxiliaryCommands",
                "extension"
        })
public class PTZNode extends DeviceEntity {

    @XmlElement(name = "Name")
    protected String name;

    @Getter @XmlElement(name = "SupportedPTZSpaces", required = true)
    protected PTZSpaces supportedPTZSpaces;

    @Getter @XmlElement(name = "MaximumNumberOfPresets")
    protected int maximumNumberOfPresets;

    @Getter @XmlElement(name = "HomeSupported")
    protected boolean homeSupported;

    @XmlElement(name = "AuxiliaryCommands")
    protected List<String> auxiliaryCommands;

    @Getter @XmlElement(name = "Extension")
    protected PTZNodeExtension extension;

    @XmlAttribute(name = "FixedHomePosition")
    protected Boolean fixedHomePosition;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<String> getAuxiliaryCommands() {
        if (auxiliaryCommands == null) {
            auxiliaryCommands = new ArrayList<>();
        }
        return this.auxiliaryCommands;
    }
}
