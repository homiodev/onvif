package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"token", "type"})
@XmlRootElement(name = "GetProfiles")
public class GetProfiles {

    @XmlElement(name = "Token")
    protected String token;

    @XmlElement(name = "Type")
    protected List<String> type;

    public void setToken(String value) {
        this.token = value;
    }

    public List<String> getType() {
        if (type == null) {
            type = new ArrayList<>();
        }
        return this.type;
    }
}
