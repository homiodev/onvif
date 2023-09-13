package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
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
        name = "RuleEngineConfiguration",
        propOrder = {"rule", "extension"})
public class RuleEngineConfiguration {

    @XmlElement(name = "Rule")
    protected List<Config> rule;

    @Getter @XmlElement(name = "Extension")
    protected RuleEngineConfigurationExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<Config> getRule() {
        if (rule == null) {
            rule = new ArrayList<Config>();
        }
        return this.rule;
    }

    public void setExtension(RuleEngineConfigurationExtension value) {
        this.extension = value;
    }
}
