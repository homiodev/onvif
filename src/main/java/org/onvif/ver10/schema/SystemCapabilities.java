package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
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
        name = "SystemCapabilities",
        propOrder = {
                "discoveryResolve",
                "discoveryBye",
                "remoteDiscovery",
                "systemBackup",
                "systemLogging",
                "firmwareUpgrade",
                "supportedVersions",
                "extension"
        })
public class SystemCapabilities {

    @XmlElement(name = "DiscoveryResolve")
    protected boolean discoveryResolve;

    @Getter @XmlElement(name = "DiscoveryBye")
    protected boolean discoveryBye;

    @Getter @XmlElement(name = "RemoteDiscovery")
    protected boolean remoteDiscovery;

    @Getter @XmlElement(name = "SystemBackup")
    protected boolean systemBackup;

    @Getter @XmlElement(name = "SystemLogging")
    protected boolean systemLogging;

    @Getter @XmlElement(name = "FirmwareUpgrade")
    protected boolean firmwareUpgrade;

    @XmlElement(name = "SupportedVersions", required = true)
    protected List<OnvifVersion> supportedVersions;

    @Getter @XmlElement(name = "Extension")
    protected SystemCapabilitiesExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setDiscoveryResolve(boolean value) {
        this.discoveryResolve = value;
    }

    public void setDiscoveryBye(boolean value) {
        this.discoveryBye = value;
    }

    public void setRemoteDiscovery(boolean value) {
        this.remoteDiscovery = value;
    }

    public void setSystemBackup(boolean value) {
        this.systemBackup = value;
    }

    public void setSystemLogging(boolean value) {
        this.systemLogging = value;
    }

    public void setFirmwareUpgrade(boolean value) {
        this.firmwareUpgrade = value;
    }

    public List<OnvifVersion> getSupportedVersions() {
        if (supportedVersions == null) {
            supportedVersions = new ArrayList<OnvifVersion>();
        }
        return this.supportedVersions;
    }

    public void setExtension(SystemCapabilitiesExtension value) {
        this.extension = value;
    }
}
