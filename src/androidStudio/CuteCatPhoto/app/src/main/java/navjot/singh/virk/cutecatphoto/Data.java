package navjot.singh.virk.cutecatphoto;
import javax.xml.bind.annotation.*;
/**
 * Created by navNav on 15/01/2017.
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
