package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "OSDTextOptions",
        propOrder = {
                "type",
                "fontSizeRange",
                "dateFormat",
                "timeFormat",
                "fontColor",
                "backgroundColor",
                "extension"
        })
public class OSDTextOptions {

    @XmlElement(name = "Type", required = true)
    protected List<String> type;

    @Getter @XmlElement(name = "FontSizeRange")
    protected IntRange fontSizeRange;

    @XmlElement(name = "DateFormat")
    protected List<String> dateFormat;

    @XmlElement(name = "TimeFormat")
    protected List<String> timeFormat;

    @Getter @XmlElement(name = "FontColor")
    protected OSDColorOptions fontColor;

    @Getter @XmlElement(name = "BackgroundColor")
    protected OSDColorOptions backgroundColor;

    @Getter @XmlElement(name = "Extension")
    protected OSDTextOptionsExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<String> getType() {
        if (type == null) {
            type = new ArrayList<>();
        }
        return this.type;
    }

    public void setFontSizeRange(IntRange value) {
        this.fontSizeRange = value;
    }

    public List<String> getDateFormat() {
        if (dateFormat == null) {
            dateFormat = new ArrayList<>();
        }
        return this.dateFormat;
    }

    public List<String> getTimeFormat() {
        if (timeFormat == null) {
            timeFormat = new ArrayList<>();
        }
        return this.timeFormat;
    }

    public void setFontColor(OSDColorOptions value) {
        this.fontColor = value;
    }

    public void setBackgroundColor(OSDColorOptions value) {
        this.backgroundColor = value;
    }

    public void setExtension(OSDTextOptionsExtension value) {
        this.extension = value;
    }
}
