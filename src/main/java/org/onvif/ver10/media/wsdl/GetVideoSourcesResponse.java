
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.VideoSource;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"videoSources"})
@XmlRootElement(name = "GetVideoSourcesResponse")
public class GetVideoSourcesResponse {

    @XmlElement(name = "VideoSources")
    protected List<VideoSource> videoSources;

    public List<VideoSource> getVideoSources() {
        if (videoSources == null) {
            videoSources = new ArrayList<VideoSource>();
        }
        return this.videoSources;
    }
}
