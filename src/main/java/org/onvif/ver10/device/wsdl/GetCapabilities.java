package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.CapabilityCategory;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"category"})
@XmlRootElement(name = "GetCapabilities")
public class GetCapabilities {

    @XmlElement(name = "Category")
    protected List<CapabilityCategory> category;

    public List<CapabilityCategory> getCategory() {
        if (category == null) {
            category = new ArrayList<>();
        }
        return this.category;
    }
}
