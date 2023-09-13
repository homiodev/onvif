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

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PaneConfiguration",
        propOrder = {
                "paneName",
                "audioOutputToken",
                "audioSourceToken",
                "audioEncoderConfiguration",
                "receiverToken",
                "token",
                "any"
        })
public class PaneConfiguration {

    @XmlElement(name = "PaneName")
    protected String paneName;

    @Getter @XmlElement(name = "AudioOutputToken")
    protected String audioOutputToken;

    @Getter @XmlElement(name = "AudioSourceToken")
    protected String audioSourceToken;

    @Getter @XmlElement(name = "AudioEncoderConfiguration")
    protected AudioEncoderConfiguration audioEncoderConfiguration;

    @Getter @XmlElement(name = "ReceiverToken")
    protected String receiverToken;

    @Getter @XmlElement(name = "Token", required = true)
    protected String token;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setPaneName(String value) {
        this.paneName = value;
    }

    public void setAudioOutputToken(String value) {
        this.audioOutputToken = value;
    }

    public void setAudioSourceToken(String value) {
        this.audioSourceToken = value;
    }

    public void setAudioEncoderConfiguration(AudioEncoderConfiguration value) {
        this.audioEncoderConfiguration = value;
    }

    public void setReceiverToken(String value) {
        this.receiverToken = value;
    }

    public void setToken(String value) {
        this.token = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
