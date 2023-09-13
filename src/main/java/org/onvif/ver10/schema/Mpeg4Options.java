package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Mpeg4Options",
        propOrder = {
                "resolutionsAvailable",
                "govLengthRange",
                "frameRateRange",
                "encodingIntervalRange",
                "mpeg4ProfilesSupported"
        })
@XmlSeeAlso({Mpeg4Options2.class})
public class Mpeg4Options {

    @XmlElement(name = "ResolutionsAvailable", required = true)
    protected List<VideoResolution> resolutionsAvailable;

    @Getter @XmlElement(name = "GovLengthRange", required = true)
    protected IntRange govLengthRange;

    @Getter @XmlElement(name = "FrameRateRange", required = true)
    protected IntRange frameRateRange;

    @Getter @XmlElement(name = "EncodingIntervalRange", required = true)
    protected IntRange encodingIntervalRange;

    @XmlElement(name = "Mpeg4ProfilesSupported", required = true)
    protected List<Mpeg4Profile> mpeg4ProfilesSupported;

    public List<VideoResolution> getResolutionsAvailable() {
        if (resolutionsAvailable == null) {
            resolutionsAvailable = new ArrayList<VideoResolution>();
        }
        return this.resolutionsAvailable;
    }

    public void setGovLengthRange(IntRange value) {
        this.govLengthRange = value;
    }

    public void setFrameRateRange(IntRange value) {
        this.frameRateRange = value;
    }

    public void setEncodingIntervalRange(IntRange value) {
        this.encodingIntervalRange = value;
    }

    public List<Mpeg4Profile> getMpeg4ProfilesSupported() {
        if (mpeg4ProfilesSupported == null) {
            mpeg4ProfilesSupported = new ArrayList<Mpeg4Profile>();
        }
        return this.mpeg4ProfilesSupported;
    }
}
