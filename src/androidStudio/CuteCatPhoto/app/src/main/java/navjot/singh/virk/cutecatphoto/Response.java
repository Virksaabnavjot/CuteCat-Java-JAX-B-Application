package navjot.singh.virk.cutecatphoto;

import javax.xml.bind.annotation.*;
/**
 * Created by navNav on 15/01/2017.
 */

@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
public class Response {

    Data data;

    //@XmlElement(name = "data", type=Data.class)
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}


