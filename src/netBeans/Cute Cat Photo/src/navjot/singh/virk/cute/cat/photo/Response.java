package navjot.singh.virk.cute.cat.photo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author navNav
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
