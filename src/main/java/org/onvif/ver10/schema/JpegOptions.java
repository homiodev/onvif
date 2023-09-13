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
        name = "JpegOptions",
        propOrder = {"resolutionsAvailable", "frameRateRange", "encodingIntervalRange"})
@XmlSeeAlso({JpegOptions2.class})
public class JpegOptions {

    @XmlElement(name = "ResolutionsAvailable", required = true)
    protected List<VideoResolution> resolutionsAvailable;

    @Getter @XmlElement(name = "FrameRateRange", required = true)
    protected IntRange frameRateRange;

    @Getter @XmlElement(name = "EncodingIntervalRange", required = true)
    protected IntRange encodingIntervalRange;

    public List<VideoResolution> getResolutionsAvailable() {
        if (resolutionsAvailable == null) {
            resolutionsAvailable = new ArrayList<VideoResolution>();
        }
        return this.resolutionsAvailable;
    }

    public void setFrameRateRange(IntRange value) {
        this.frameRateRange = value;
    }

    public void setEncodingIntervalRange(IntRange value) {
        this.encodingIntervalRange = value;
    }
}
