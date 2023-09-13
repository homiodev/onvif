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
        name = "H264Options",
        propOrder = {
                "resolutionsAvailable",
                "govLengthRange",
                "frameRateRange",
                "encodingIntervalRange",
                "h264ProfilesSupported"
        })
@XmlSeeAlso({H264Options2.class})
public class H264Options {

    @XmlElement(name = "ResolutionsAvailable", required = true)
    protected List<VideoResolution> resolutionsAvailable;

    @Getter @XmlElement(name = "GovLengthRange", required = true)
    protected IntRange govLengthRange;

    @Getter @XmlElement(name = "FrameRateRange", required = true)
    protected IntRange frameRateRange;

    @Getter @XmlElement(name = "EncodingIntervalRange", required = true)
    protected IntRange encodingIntervalRange;

    @XmlElement(name = "H264ProfilesSupported", required = true)
    protected List<H264Profile> h264ProfilesSupported;

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

    public List<H264Profile> getH264ProfilesSupported() {
        if (h264ProfilesSupported == null) {
            h264ProfilesSupported = new ArrayList<H264Profile>();
        }
        return this.h264ProfilesSupported;
    }
}
