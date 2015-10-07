package org.FaraFan.Entity.Result;

import javax.xml.bind.annotation.*;

/**
 * Created by PC-DPS on 04/21/2015.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Result")
public class Result {
    @XmlAttribute(name = "ErrorCode")
    private String ErrorCode;
    @XmlAttribute(name = "ErrorMessage")
    private String ErrorMessage;
    @XmlAttribute(name = "ReqNo")
    private String ReqNo;
    @XmlElement(name="Body",type = Body.class)
    private Body Body;

    public String getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(String errorCode) {
        ErrorCode = errorCode;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }

    public String getReqNo() {
        return ReqNo;
    }

    public void setReqNo(String reqNo) {
        ReqNo = reqNo;
    }

    public Body getBody() {
        return Body;
    }

    public void setBody(Body body) {
        this.Body = body;
    }
}

