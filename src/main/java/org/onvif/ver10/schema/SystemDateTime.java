package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SystemDateTime",
        propOrder = {
                "dateTimeType",
                "daylightSavings",
                "timeZone",
                "utcDateTime",
                "localDateTime",
                "extension"
        })
public class SystemDateTime {

    @XmlElement(name = "DateTimeType", required = true)
    protected SetDateTimeType dateTimeType;

    @Getter @XmlElement(name = "DaylightSavings")
    protected boolean daylightSavings;

    @Getter @XmlElement(name = "TimeZone")
    protected TimeZone timeZone;

    @XmlElement(name = "UTCDateTime")
    protected DateTime utcDateTime;

    @Getter @XmlElement(name = "LocalDateTime")
    protected DateTime localDateTime;

    @Getter @XmlElement(name = "Extension")
    protected SystemDateTimeExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setDateTimeType(SetDateTimeType value) {
        this.dateTimeType = value;
    }

    public void setDaylightSavings(boolean value) {
        this.daylightSavings = value;
    }

    public void setTimeZone(TimeZone value) {
        this.timeZone = value;
    }

    public DateTime getUTCDateTime() {
        return utcDateTime;
    }

    public void setUTCDateTime(DateTime value) {
        this.utcDateTime = value;
    }

    public void setLocalDateTime(DateTime value) {
        this.localDateTime = value;
    }

    public void setExtension(SystemDateTimeExtension value) {
        this.extension = value;
    }
}
