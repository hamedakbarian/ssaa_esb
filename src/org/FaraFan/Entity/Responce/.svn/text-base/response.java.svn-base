package org.FaraFan.Entity.Responce;

import javax.xml.bind.annotation.*;

/**
 * Created by mohammadi on 4/26/2015.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"id","userid","cat","action","code","body"})
@XmlRootElement(name="response")
public class response {

    @XmlAttribute(required = true)
    private String id;
    @XmlElement(required = true, type = String.class)
    private String userid;
    @XmlElement(required = true, type = String.class)
    private String cat;
    @XmlElement(required = true, type = String.class)
    private String action;
    @XmlElement(required = true, type = String.class)
    private String code;
    @XmlElement(required = true, type = body.class)
    private body body;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public body getBody() {
        return body;
    }

    public void setBody(body body) {
        this.body = body;
    }
}
