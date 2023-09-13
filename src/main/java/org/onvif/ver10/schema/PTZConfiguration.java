package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PTZConfiguration",
        propOrder = {
                "nodeToken",
                "defaultAbsolutePantTiltPositionSpace",
                "defaultAbsoluteZoomPositionSpace",
                "defaultRelativePanTiltTranslationSpace",
                "defaultRelativeZoomTranslationSpace",
                "defaultContinuousPanTiltVelocitySpace",
                "defaultContinuousZoomVelocitySpace",
                "defaultPTZSpeed",
                "defaultPTZTimeout",
                "panTiltLimits",
                "zoomLimits",
                "extension"
        })
public class PTZConfiguration extends ConfigurationEntity {

    @XmlElement(name = "NodeToken", required = true)
    protected String nodeToken;

    @XmlElement(name = "DefaultAbsolutePantTiltPositionSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultAbsolutePantTiltPositionSpace;

    @XmlElement(name = "DefaultAbsoluteZoomPositionSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultAbsoluteZoomPositionSpace;

    @XmlElement(name = "DefaultRelativePanTiltTranslationSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultRelativePanTiltTranslationSpace;

    @XmlElement(name = "DefaultRelativeZoomTranslationSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultRelativeZoomTranslationSpace;

    @XmlElement(name = "DefaultContinuousPanTiltVelocitySpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultContinuousPanTiltVelocitySpace;

    @XmlElement(name = "DefaultContinuousZoomVelocitySpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultContinuousZoomVelocitySpace;

    @XmlElement(name = "DefaultPTZSpeed")
    protected PTZSpeed defaultPTZSpeed;

    @XmlElement(name = "DefaultPTZTimeout")
    protected Duration defaultPTZTimeout;

    @XmlElement(name = "PanTiltLimits")
    protected PanTiltLimits panTiltLimits;

    @XmlElement(name = "ZoomLimits")
    protected ZoomLimits zoomLimits;

    @XmlElement(name = "Extension")
    protected PTZConfigurationExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setNodeToken(String value) {
        this.nodeToken = value;
    }

    public void setDefaultAbsolutePantTiltPositionSpace(String value) {
        this.defaultAbsolutePantTiltPositionSpace = value;
    }

    public void setDefaultAbsoluteZoomPositionSpace(String value) {
        this.defaultAbsoluteZoomPositionSpace = value;
    }

    public void setDefaultRelativePanTiltTranslationSpace(String value) {
        this.defaultRelativePanTiltTranslationSpace = value;
    }

    public void setDefaultRelativeZoomTranslationSpace(String value) {
        this.defaultRelativeZoomTranslationSpace = value;
    }

    public void setDefaultContinuousPanTiltVelocitySpace(String value) {
        this.defaultContinuousPanTiltVelocitySpace = value;
    }

    public void setDefaultContinuousZoomVelocitySpace(String value) {
        this.defaultContinuousZoomVelocitySpace = value;
    }

    public void setDefaultPTZSpeed(PTZSpeed value) {
        this.defaultPTZSpeed = value;
    }

    public void setDefaultPTZTimeout(Duration value) {
        this.defaultPTZTimeout = value;
    }

    public void setPanTiltLimits(PanTiltLimits value) {
        this.panTiltLimits = value;
    }

    public void setZoomLimits(ZoomLimits value) {
        this.zoomLimits = value;
    }

    public void setExtension(PTZConfigurationExtension value) {
        this.extension = value;
    }
}
