package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "VideoDecoderConfigurationOptions",
        propOrder = {"jpegDecOptions", "h264DecOptions", "mpeg4DecOptions", "extension"})
public class VideoDecoderConfigurationOptions {

    @XmlElement(name = "JpegDecOptions")
    protected JpegDecOptions jpegDecOptions;

    @XmlElement(name = "H264DecOptions")
    protected H264DecOptions h264DecOptions;

    @XmlElement(name = "Mpeg4DecOptions")
    protected Mpeg4DecOptions mpeg4DecOptions;

    @XmlElement(name = "Extension")
    protected VideoDecoderConfigurationOptionsExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setJpegDecOptions(JpegDecOptions value) {
        this.jpegDecOptions = value;
    }

    public void setH264DecOptions(H264DecOptions value) {
        this.h264DecOptions = value;
    }

    public void setMpeg4DecOptions(Mpeg4DecOptions value) {
        this.mpeg4DecOptions = value;
    }

    public void setExtension(VideoDecoderConfigurationOptionsExtension value) {
        this.extension = value;
    }
}
