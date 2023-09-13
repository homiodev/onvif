
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemCapabilities")
public class SystemCapabilities {

    @XmlAttribute(name = "DiscoveryResolve")
    protected Boolean discoveryResolve;

    @XmlAttribute(name = "DiscoveryBye")
    protected Boolean discoveryBye;

    @XmlAttribute(name = "RemoteDiscovery")
    protected Boolean remoteDiscovery;

    @XmlAttribute(name = "SystemBackup")
    protected Boolean systemBackup;

    @XmlAttribute(name = "SystemLogging")
    protected Boolean systemLogging;

    @XmlAttribute(name = "FirmwareUpgrade")
    protected Boolean firmwareUpgrade;

    @XmlAttribute(name = "HttpFirmwareUpgrade")
    protected Boolean httpFirmwareUpgrade;

    @XmlAttribute(name = "HttpSystemBackup")
    protected Boolean httpSystemBackup;

    @XmlAttribute(name = "HttpSystemLogging")
    protected Boolean httpSystemLogging;

    @XmlAttribute(name = "HttpSupportInformation")
    protected Boolean httpSupportInformation;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public Boolean isDiscoveryResolve() {
        return discoveryResolve;
    }

    public void setDiscoveryResolve(Boolean value) {
        this.discoveryResolve = value;
    }

    public Boolean isDiscoveryBye() {
        return discoveryBye;
    }

    public void setDiscoveryBye(Boolean value) {
        this.discoveryBye = value;
    }

    public Boolean isRemoteDiscovery() {
        return remoteDiscovery;
    }

    public void setRemoteDiscovery(Boolean value) {
        this.remoteDiscovery = value;
    }

    public Boolean isSystemBackup() {
        return systemBackup;
    }

    public void setSystemBackup(Boolean value) {
        this.systemBackup = value;
    }

    public Boolean isSystemLogging() {
        return systemLogging;
    }

    public void setSystemLogging(Boolean value) {
        this.systemLogging = value;
    }

    public Boolean isFirmwareUpgrade() {
        return firmwareUpgrade;
    }

    public void setFirmwareUpgrade(Boolean value) {
        this.firmwareUpgrade = value;
    }

    public Boolean isHttpFirmwareUpgrade() {
        return httpFirmwareUpgrade;
    }

    public void setHttpFirmwareUpgrade(Boolean value) {
        this.httpFirmwareUpgrade = value;
    }

    public Boolean isHttpSystemBackup() {
        return httpSystemBackup;
    }

    public void setHttpSystemBackup(Boolean value) {
        this.httpSystemBackup = value;
    }

    public Boolean isHttpSystemLogging() {
        return httpSystemLogging;
    }

    public void setHttpSystemLogging(Boolean value) {
        this.httpSystemLogging = value;
    }

    public Boolean isHttpSupportInformation() {
        return httpSupportInformation;
    }

    public void setHttpSupportInformation(Boolean value) {
        this.httpSupportInformation = value;
    }
}
