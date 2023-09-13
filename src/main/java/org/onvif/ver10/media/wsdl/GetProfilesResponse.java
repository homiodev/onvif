
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.Profile;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"profiles"})
@XmlRootElement(name = "GetProfilesResponse")
public class GetProfilesResponse {

    @XmlElement(name = "Profiles")
    protected List<Profile> profiles;

    public List<Profile> getProfiles() {
        if (profiles == null) {
            profiles = new ArrayList<Profile>();
        }
        return this.profiles;
    }
}
