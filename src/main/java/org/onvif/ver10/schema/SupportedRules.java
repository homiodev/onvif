package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
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
        name = "SupportedRules",
        propOrder = {"ruleContentSchemaLocation", "ruleDescription", "extension"})
public class SupportedRules {

    @XmlElement(name = "RuleContentSchemaLocation")
    @XmlSchemaType(name = "anyURI")
    protected List<String> ruleContentSchemaLocation;

    @XmlElement(name = "RuleDescription")
    protected List<ConfigDescription> ruleDescription;

    @Getter @XmlElement(name = "Extension")
    protected SupportedRulesExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<String> getRuleContentSchemaLocation() {
        if (ruleContentSchemaLocation == null) {
            ruleContentSchemaLocation = new ArrayList<>();
        }
        return this.ruleContentSchemaLocation;
    }

    public List<ConfigDescription> getRuleDescription() {
        if (ruleDescription == null) {
            ruleDescription = new ArrayList<ConfigDescription>();
        }
        return this.ruleDescription;
    }

    public void setExtension(SupportedRulesExtension value) {
        this.extension = value;
    }
}
