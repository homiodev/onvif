package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
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

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "VideoEncoder2ConfigurationOptions",
        propOrder = {"encoding", "qualityRange", "resolutionsAvailable", "bitrateRange", "any"})
public class VideoEncoder2ConfigurationOptions {

    @XmlElement(name = "Encoding", required = true)
    protected String encoding;

    @Getter @XmlElement(name = "QualityRange", required = true)
    protected IntRange qualityRange;

    @XmlElement(name = "ResolutionsAvailable", required = true)
    protected List<VideoResolution2> resolutionsAvailable;

    @Getter @XmlElement(name = "BitrateRange", required = true)
    protected IntRange bitrateRange;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @XmlAttribute(name = "GovLengthRange")
    protected List<Integer> govLengthRange;

    @XmlAttribute(name = "FrameRatesSupported")
    protected List<Float> frameRatesSupported;

    @XmlAttribute(name = "ProfilesSupported")
    protected List<String> profilesSupported;

    @XmlAttribute(name = "ConstantBitRateSupported")
    protected Boolean constantBitRateSupported;

    @Getter @XmlAttribute(name = "GuaranteedInstances")
    protected Integer guaranteedInstances;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<VideoResolution2> getResolutionsAvailable() {
        if (resolutionsAvailable == null) {
            resolutionsAvailable = new ArrayList<>();
        }
        return this.resolutionsAvailable;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public List<Integer> getGovLengthRange() {
        if (govLengthRange == null) {
            govLengthRange = new ArrayList<>();
        }
        return this.govLengthRange;
    }

    public List<Float> getFrameRatesSupported() {
        if (frameRatesSupported == null) {
            frameRatesSupported = new ArrayList<>();
        }
        return this.frameRatesSupported;
    }

    public List<String> getProfilesSupported() {
        if (profilesSupported == null) {
            profilesSupported = new ArrayList<>();
        }
        return this.profilesSupported;
    }
}
