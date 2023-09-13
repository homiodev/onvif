package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "VideoEncoder2Configuration",
        propOrder = {"encoding", "resolution", "rateControl", "multicast", "quality", "any"})
public class VideoEncoder2Configuration extends ConfigurationEntity {

    @XmlElement(name = "Encoding", required = true)
    protected String encoding;

    @Getter @XmlElement(name = "Resolution", required = true)
    protected VideoResolution2 resolution;

    @Getter @XmlElement(name = "RateControl")
    protected VideoRateControl2 rateControl;

    @Getter @XmlElement(name = "Multicast")
    protected MulticastConfiguration multicast;

    @Getter @XmlElement(name = "Quality")
    protected float quality;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAttribute(name = "GovLength")
    protected Integer govLength;

    @Getter @XmlAttribute(name = "Profile")
    protected String profile;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
