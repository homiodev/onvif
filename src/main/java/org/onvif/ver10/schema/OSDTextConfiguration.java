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
        name = "OSDTextConfiguration",
        propOrder = {
                "type",
                "dateFormat",
                "timeFormat",
                "fontSize",
                "fontColor",
                "backgroundColor",
                "plainText",
                "extension"
        })
public class OSDTextConfiguration {

    @XmlElement(name = "Type", required = true)
    protected String type;

    @XmlElement(name = "DateFormat")
    protected String dateFormat;

    @XmlElement(name = "TimeFormat")
    protected String timeFormat;

    @XmlElement(name = "FontSize")
    protected Integer fontSize;

    @XmlElement(name = "FontColor")
    protected OSDColor fontColor;

    @XmlElement(name = "BackgroundColor")
    protected OSDColor backgroundColor;

    @XmlElement(name = "PlainText")
    protected String plainText;

    @XmlElement(name = "Extension")
    protected OSDTextConfigurationExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setType(String value) {
        this.type = value;
    }

    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    public void setTimeFormat(String value) {
        this.timeFormat = value;
    }

    public void setFontSize(Integer value) {
        this.fontSize = value;
    }

    public void setFontColor(OSDColor value) {
        this.fontColor = value;
    }

    public void setBackgroundColor(OSDColor value) {
        this.backgroundColor = value;
    }

    public void setPlainText(String value) {
        this.plainText = value;
    }

    public void setExtension(OSDTextConfigurationExtension value) {
        this.extension = value;
    }
}
