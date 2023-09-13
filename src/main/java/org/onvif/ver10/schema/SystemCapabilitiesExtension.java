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
        name = "SystemCapabilitiesExtension",
        propOrder = {
                "any",
                "httpFirmwareUpgrade",
                "httpSystemBackup",
                "httpSystemLogging",
                "httpSupportInformation",
                "extension"
        })
public class SystemCapabilitiesExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @XmlElement(name = "HttpFirmwareUpgrade")
    protected Boolean httpFirmwareUpgrade;

    @XmlElement(name = "HttpSystemBackup")
    protected Boolean httpSystemBackup;

    @XmlElement(name = "HttpSystemLogging")
    protected Boolean httpSystemLogging;

    @XmlElement(name = "HttpSupportInformation")
    protected Boolean httpSupportInformation;

    @Getter @XmlElement(name = "Extension")
    protected SystemCapabilitiesExtension2 extension;

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
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

    public void setExtension(SystemCapabilitiesExtension2 value) {
        this.extension = value;
    }
}
