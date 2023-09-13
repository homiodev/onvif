package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "RelayOutputSettings",
        propOrder = {"mode", "delayTime", "idleState"})
public class RelayOutputSettings {

    @XmlElement(name = "Mode", required = true)
    protected RelayMode mode;

    @XmlElement(name = "DelayTime", required = true)
    protected Duration delayTime;

    @XmlElement(name = "IdleState", required = true)
    protected RelayIdleState idleState;

    public void setMode(RelayMode value) {
        this.mode = value;
    }

    public void setDelayTime(Duration value) {
        this.delayTime = value;
    }

    public void setIdleState(RelayIdleState value) {
        this.idleState = value;
    }
}
