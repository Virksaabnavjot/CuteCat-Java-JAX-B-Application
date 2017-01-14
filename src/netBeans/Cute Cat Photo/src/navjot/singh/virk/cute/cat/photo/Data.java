package navjot.singh.virk.cute.cat.photo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author navNav
 */
@XmlRootElement(name = "data")
@XmlAccessorType(XmlAccessType.FIELD)
public class Data {

    Images images;

    //@XmlElement(name = "images", type=Images.class)
    public Images getImages() {
        return images;
    }

    public void setData(Data data) {
        this.images = images;
    }
}
