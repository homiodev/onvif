
package org.oasis_open.docs.wsn.b_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"notificationMessage", "any"})
@XmlRootElement(name = "Notify")
public class Notify {

    @XmlElement(name = "NotificationMessage", required = true)
    protected List<NotificationMessageHolderType> notificationMessage;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    public List<NotificationMessageHolderType> getNotificationMessage() {
        if (notificationMessage == null) {
            notificationMessage = new ArrayList<NotificationMessageHolderType>();
        }
        return this.notificationMessage;
    }

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }
}
