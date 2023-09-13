package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Mpeg4Configuration",
        propOrder = {"govLength", "mpeg4Profile"})
public class Mpeg4Configuration {

    @XmlElement(name = "GovLength")
    protected int govLength;

    @XmlElement(name = "Mpeg4Profile", required = true)
    protected Mpeg4Profile mpeg4Profile;

    public void setGovLength(int value) {
        this.govLength = value;
    }

    public void setMpeg4Profile(Mpeg4Profile value) {
        this.mpeg4Profile = value;
    }
}
