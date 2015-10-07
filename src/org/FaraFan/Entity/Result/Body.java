package org.FaraFan.Entity.Result;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by PC-DPS on 04/21/2015.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Body")
@XmlRootElement(name="Body")
public class Body {

    private List<EventPacket> EventPacket;

    public List<EventPacket> getEventPacket() {
        return EventPacket;
    }
    @XmlElement(name = "EventPacket")
    public void setEventPacket(List<EventPacket> eventPacket) {
        EventPacket = eventPacket;
    }
}
