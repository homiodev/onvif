package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SystemLogUriList",
        propOrder = {"systemLog"})
public class SystemLogUriList {

    @XmlElement(name = "SystemLog")
    protected List<SystemLogUri> systemLog;

    public List<SystemLogUri> getSystemLog() {
        if (systemLog == null) {
            systemLog = new ArrayList<SystemLogUri>();
        }
        return this.systemLog;
    }
}
