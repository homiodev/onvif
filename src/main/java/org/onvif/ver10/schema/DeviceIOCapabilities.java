package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DeviceIOCapabilities",
        propOrder = {
                "xAddr",
                "videoSources",
                "videoOutputs",
                "audioSources",
                "audioOutputs",
                "relayOutputs",
                "any"
        })
public class DeviceIOCapabilities {

    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;

    @Getter @XmlElement(name = "VideoSources")
    protected int videoSources;

    @Getter @XmlElement(name = "VideoOutputs")
    protected int videoOutputs;

    @Getter @XmlElement(name = "AudioSources")
    protected int audioSources;

    @Getter @XmlElement(name = "AudioOutputs")
    protected int audioOutputs;

    @Getter @XmlElement(name = "RelayOutputs")
    protected int relayOutputs;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public String getXAddr() {
        return xAddr;
    }

    public void setXAddr(String value) {
        this.xAddr = value;
    }

    public void setVideoSources(int value) {
        this.videoSources = value;
    }

    public void setVideoOutputs(int value) {
        this.videoOutputs = value;
    }

    public void setAudioSources(int value) {
        this.audioSources = value;
    }

    public void setAudioOutputs(int value) {
        this.audioOutputs = value;
    }

    public void setRelayOutputs(int value) {
        this.relayOutputs = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
