package org.FaraFan.Entity.Request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mohammadi on 4/25/2015.
 */
@XmlRootElement(name="request")
@XmlAccessorType(XmlAccessType.FIELD)
public class Request {
    @XmlElement(name = "userid")
    private String userid;
    @XmlElement(name = "password")
    private String password;
    @XmlElement(name = "cat")
    private String cat;
    @XmlElement(name = "action")
    private String action;
    @XmlElement(name = "body")
    private Body body;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Long lastRequest,int packetCount) {
        Body b=new Body();
        b.lastRequest=lastRequest;
        b.packetCount=packetCount;
        this.body = b;
    }
}
