
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.DateTime;
import org.onvif.ver10.schema.SetDateTimeType;
import org.onvif.ver10.schema.TimeZone;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"dateTimeType", "daylightSavings", "timeZone", "utcDateTime"})
@XmlRootElement(name = "SetSystemDateAndTime")
public class SetSystemDateAndTime {

    @XmlElement(name = "DateTimeType", required = true)
    protected SetDateTimeType dateTimeType;

    @Getter @XmlElement(name = "DaylightSavings")
    protected boolean daylightSavings;

    @Getter @XmlElement(name = "TimeZone")
    protected TimeZone timeZone;

    @XmlElement(name = "UTCDateTime")
    protected DateTime utcDateTime;

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
}
