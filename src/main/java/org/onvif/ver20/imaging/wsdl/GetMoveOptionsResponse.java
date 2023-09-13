package org.onvif.ver20.imaging.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.MoveOptions20;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"moveOptions"})
@XmlRootElement(name = "GetMoveOptionsResponse")
public class GetMoveOptionsResponse {

    @XmlElement(name = "MoveOptions", required = true)
    protected MoveOptions20 moveOptions;

    public void setMoveOptions(MoveOptions20 value) {
        this.moveOptions = value;
    }
}
