package navjot.singh.virk.cutecatphoto;
import javax.xml.bind.annotation.*;
/**
 * Created by navNav on 15/01/2017.
 */

@XmlRootElement(name = "images")
@XmlAccessorType(XmlAccessType.FIELD)
public class Images {

    Image image;

    //@XmlElement(name = "image", type=Image.class)
    public Image getImage() {
        return image;
    }

}
