package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.oasis_open.docs.wsn.b_2.NotificationMessageHolderType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "EventStream",
        propOrder = {"notificationMessageOrExtension"})
public class EventStream {

    @XmlElements({
            @XmlElement(
                    name = "NotificationMessage",
                    namespace = "http://docs.oasis-open.org/wsn/b-2",
                    type = NotificationMessageHolderType.class),
            @XmlElement(name = "Extension", type = EventStreamExtension.class)
    })
    protected List<java.lang.Object> notificationMessageOrExtension;

    public List<java.lang.Object> getNotificationMessageOrExtension() {
        if (notificationMessageOrExtension == null) {
            notificationMessageOrExtension = new ArrayList<>();
        }
        return this.notificationMessageOrExtension;
    }
}
