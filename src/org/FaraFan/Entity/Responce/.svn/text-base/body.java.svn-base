package org.FaraFan.Entity.Responce;

import org.FaraFan.Entity.Result.Result;

import javax.xml.bind.annotation.*;

/**
 * Created by mohammadi on 4/26/2015.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="body")
public class body {

    private Result Result;

    public Result getResult() {
        return Result;
    }
    @XmlElement(name = "Result" ,required = true, type = Result.class)
    public void setResult(Result result) {
        Result = result;
    }
}
