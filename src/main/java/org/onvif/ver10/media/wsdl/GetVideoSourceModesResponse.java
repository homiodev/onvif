
package org.onvif.ver10.media.wsdl;

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
        propOrder = {"videoSourceModes"})
@XmlRootElement(name = "GetVideoSourceModesResponse")
public class GetVideoSourceModesResponse {

    @XmlElement(name = "VideoSourceModes", required = true)
    protected List<VideoSourceMode> videoSourceModes;

    public List<VideoSourceMode> getVideoSourceModes() {
        if (videoSourceModes == null) {
            videoSourceModes = new ArrayList<VideoSourceMode>();
        }
        return this.videoSourceModes;
    }
}
