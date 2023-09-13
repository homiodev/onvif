package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
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
        name = "H264DecOptions",
        propOrder = {
                "resolutionsAvailable",
                "supportedH264Profiles",
                "supportedInputBitrate",
                "supportedFrameRate",
                "any"
        })
public class H264DecOptions {

    @XmlElement(name = "ResolutionsAvailable", required = true)
    protected List<VideoResolution> resolutionsAvailable;

    @XmlElement(name = "SupportedH264Profiles", required = true)
    protected List<H264Profile> supportedH264Profiles;

    @Getter @XmlElement(name = "SupportedInputBitrate", required = true)
    protected IntRange supportedInputBitrate;

    @Getter @XmlElement(name = "SupportedFrameRate", required = true)
    protected IntRange supportedFrameRate;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<VideoResolution> getResolutionsAvailable() {
        if (resolutionsAvailable == null) {
            resolutionsAvailable = new ArrayList<VideoResolution>();
        }
        return this.resolutionsAvailable;
    }

    public List<H264Profile> getSupportedH264Profiles() {
        if (supportedH264Profiles == null) {
            supportedH264Profiles = new ArrayList<H264Profile>();
        }
        return this.supportedH264Profiles;
    }

    public void setSupportedInputBitrate(IntRange value) {
        this.supportedInputBitrate = value;
    }

    public void setSupportedFrameRate(IntRange value) {
        this.supportedFrameRate = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
