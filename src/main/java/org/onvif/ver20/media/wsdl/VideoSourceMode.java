package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;
import org.onvif.ver10.schema.VideoResolution;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "VideoSourceMode",
        propOrder = {
                "maxFramerate",
                "maxResolution",
                "encodings",
                "reboot",
                "description",
                "extension"
        })
public class VideoSourceMode {

    @XmlElement(name = "MaxFramerate")
    protected float maxFramerate;

    @Getter @XmlElement(name = "MaxResolution", required = true)
    protected VideoResolution maxResolution;

    @XmlList
    @XmlElement(name = "Encodings", required = true)
    protected List<String> encodings;

    @Getter @XmlElement(name = "Reboot")
    protected boolean reboot;

    @Getter @XmlElement(name = "Description")
    protected String description;

    @Getter @XmlElement(name = "Extension")
    protected VideoSourceModeExtension extension;

    @Getter @XmlAttribute(name = "token", required = true)
    protected String token;

    @XmlAttribute(name = "Enabled")
    protected Boolean enabled;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setMaxFramerate(float value) {
        this.maxFramerate = value;
    }

    public void setMaxResolution(VideoResolution value) {
        this.maxResolution = value;
    }

    public List<String> getEncodings() {
        if (encodings == null) {
            encodings = new ArrayList<>();
        }
        return this.encodings;
    }

    public void setReboot(boolean value) {
        this.reboot = value;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public void setExtension(VideoSourceModeExtension value) {
        this.extension = value;
    }

    public void setToken(String value) {
        this.token = value;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean value) {
        this.enabled = value;
    }
}
