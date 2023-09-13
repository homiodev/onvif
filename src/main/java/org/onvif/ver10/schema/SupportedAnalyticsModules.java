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
        name = "SupportedAnalyticsModules",
        propOrder = {"analyticsModuleContentSchemaLocation", "analyticsModuleDescription", "extension"})
public class SupportedAnalyticsModules {

    @XmlElement(name = "AnalyticsModuleContentSchemaLocation")
    @XmlSchemaType(name = "anyURI")
    protected List<String> analyticsModuleContentSchemaLocation;

    @XmlElement(name = "AnalyticsModuleDescription")
    protected List<ConfigDescription> analyticsModuleDescription;

    @Getter @XmlElement(name = "Extension")
    protected SupportedAnalyticsModulesExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<String> getAnalyticsModuleContentSchemaLocation() {
        if (analyticsModuleContentSchemaLocation == null) {
            analyticsModuleContentSchemaLocation = new ArrayList<>();
        }
        return this.analyticsModuleContentSchemaLocation;
    }

    public List<ConfigDescription> getAnalyticsModuleDescription() {
        if (analyticsModuleDescription == null) {
            analyticsModuleDescription = new ArrayList<ConfigDescription>();
        }
        return this.analyticsModuleDescription;
    }

    public void setExtension(SupportedAnalyticsModulesExtension value) {
        this.extension = value;
    }
}
