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
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "AnalyticsDeviceEngineConfiguration",
        propOrder = {"engineConfiguration", "extension"})
public class AnalyticsDeviceEngineConfiguration {

    @XmlElement(name = "EngineConfiguration", required = true)
    protected List<EngineConfiguration> engineConfiguration;

    @Getter @XmlElement(name = "Extension")
    protected AnalyticsDeviceEngineConfigurationExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<EngineConfiguration> getEngineConfiguration() {
        if (engineConfiguration == null) {
            engineConfiguration = new ArrayList<>();
        }
        return this.engineConfiguration;
    }
}
