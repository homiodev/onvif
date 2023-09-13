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
        name = "Mpeg4DecOptions",
        propOrder = {
                "resolutionsAvailable",
                "supportedMpeg4Profiles",
                "supportedInputBitrate",
                "supportedFrameRate",
                "any"
        })
public class Mpeg4DecOptions {

    @XmlElement(name = "ResolutionsAvailable", required = true)
    protected List<VideoResolution> resolutionsAvailable;

    @XmlElement(name = "SupportedMpeg4Profiles", required = true)
    protected List<Mpeg4Profile> supportedMpeg4Profiles;

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

    public List<Mpeg4Profile> getSupportedMpeg4Profiles() {
        if (supportedMpeg4Profiles == null) {
            supportedMpeg4Profiles = new ArrayList<Mpeg4Profile>();
        }
        return this.supportedMpeg4Profiles;
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
