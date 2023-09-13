package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "CapabilitiesExtension",
        propOrder = {
                "any",
                "deviceIO",
                "display",
                "recording",
                "search",
                "replay",
                "receiver",
                "analyticsDevice",
                "extensions"
        })
public class CapabilitiesExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlElement(name = "DeviceIO")
    protected DeviceIOCapabilities deviceIO;

    @Getter @XmlElement(name = "Display")
    protected DisplayCapabilities display;

    @Getter @XmlElement(name = "Recording")
    protected RecordingCapabilities recording;

    @Getter @XmlElement(name = "Search")
    protected SearchCapabilities search;

    @Getter @XmlElement(name = "Replay")
    protected ReplayCapabilities replay;

    @Getter @XmlElement(name = "Receiver")
    protected ReceiverCapabilities receiver;

    @Getter @XmlElement(name = "AnalyticsDevice")
    protected AnalyticsDeviceCapabilities analyticsDevice;

    @Getter @XmlElement(name = "Extensions")
    protected CapabilitiesExtension2 extensions;

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public void setDeviceIO(DeviceIOCapabilities value) {
        this.deviceIO = value;
    }

    public void setDisplay(DisplayCapabilities value) {
        this.display = value;
    }

    public void setRecording(RecordingCapabilities value) {
        this.recording = value;
    }

    public void setSearch(SearchCapabilities value) {
        this.search = value;
    }

    public void setReplay(ReplayCapabilities value) {
        this.replay = value;
    }

    public void setReceiver(ReceiverCapabilities value) {
        this.receiver = value;
    }

    public void setAnalyticsDevice(AnalyticsDeviceCapabilities value) {
        this.analyticsDevice = value;
    }

    public void setExtensions(CapabilitiesExtension2 value) {
        this.extensions = value;
    }
}
