
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"username"})
@XmlRootElement(name = "DeleteUsers")
public class DeleteUsers {

    @XmlElement(name = "Username", required = true)
    protected List<String> username;

    public List<String> getUsername() {
        if (username == null) {
            username = new ArrayList<>();
        }
        return this.username;
    }
}
