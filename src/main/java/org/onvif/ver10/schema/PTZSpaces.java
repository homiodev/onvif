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
        name = "PTZSpaces",
        propOrder = {
                "absolutePanTiltPositionSpace",
                "absoluteZoomPositionSpace",
                "relativePanTiltTranslationSpace",
                "relativeZoomTranslationSpace",
                "continuousPanTiltVelocitySpace",
                "continuousZoomVelocitySpace",
                "panTiltSpeedSpace",
                "zoomSpeedSpace",
                "extension"
        })
public class PTZSpaces {

    @XmlElement(name = "AbsolutePanTiltPositionSpace")
    protected List<Space2DDescription> absolutePanTiltPositionSpace;

    @XmlElement(name = "AbsoluteZoomPositionSpace")
    protected List<Space1DDescription> absoluteZoomPositionSpace;

    @XmlElement(name = "RelativePanTiltTranslationSpace")
    protected List<Space2DDescription> relativePanTiltTranslationSpace;

    @XmlElement(name = "RelativeZoomTranslationSpace")
    protected List<Space1DDescription> relativeZoomTranslationSpace;

    @XmlElement(name = "ContinuousPanTiltVelocitySpace")
    protected List<Space2DDescription> continuousPanTiltVelocitySpace;

    @XmlElement(name = "ContinuousZoomVelocitySpace")
    protected List<Space1DDescription> continuousZoomVelocitySpace;

    @XmlElement(name = "PanTiltSpeedSpace")
    protected List<Space1DDescription> panTiltSpeedSpace;

    @XmlElement(name = "ZoomSpeedSpace")
    protected List<Space1DDescription> zoomSpeedSpace;

    @Getter @XmlElement(name = "Extension")
    protected PTZSpacesExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<Space2DDescription> getAbsolutePanTiltPositionSpace() {
        if (absolutePanTiltPositionSpace == null) {
            absolutePanTiltPositionSpace = new ArrayList<Space2DDescription>();
        }
        return this.absolutePanTiltPositionSpace;
    }

    public List<Space1DDescription> getAbsoluteZoomPositionSpace() {
        if (absoluteZoomPositionSpace == null) {
            absoluteZoomPositionSpace = new ArrayList<Space1DDescription>();
        }
        return this.absoluteZoomPositionSpace;
    }

    public List<Space2DDescription> getRelativePanTiltTranslationSpace() {
        if (relativePanTiltTranslationSpace == null) {
            relativePanTiltTranslationSpace = new ArrayList<Space2DDescription>();
        }
        return this.relativePanTiltTranslationSpace;
    }

    public List<Space1DDescription> getRelativeZoomTranslationSpace() {
        if (relativeZoomTranslationSpace == null) {
            relativeZoomTranslationSpace = new ArrayList<Space1DDescription>();
        }
        return this.relativeZoomTranslationSpace;
    }

    public List<Space2DDescription> getContinuousPanTiltVelocitySpace() {
        if (continuousPanTiltVelocitySpace == null) {
            continuousPanTiltVelocitySpace = new ArrayList<Space2DDescription>();
        }
        return this.continuousPanTiltVelocitySpace;
    }

    public List<Space1DDescription> getContinuousZoomVelocitySpace() {
        if (continuousZoomVelocitySpace == null) {
            continuousZoomVelocitySpace = new ArrayList<Space1DDescription>();
        }
        return this.continuousZoomVelocitySpace;
    }

    public List<Space1DDescription> getPanTiltSpeedSpace() {
        if (panTiltSpeedSpace == null) {
            panTiltSpeedSpace = new ArrayList<Space1DDescription>();
        }
        return this.panTiltSpeedSpace;
    }

    public List<Space1DDescription> getZoomSpeedSpace() {
        if (zoomSpeedSpace == null) {
            zoomSpeedSpace = new ArrayList<Space1DDescription>();
        }
        return this.zoomSpeedSpace;
    }

    public void setExtension(PTZSpacesExtension value) {
        this.extension = value;
    }
}
