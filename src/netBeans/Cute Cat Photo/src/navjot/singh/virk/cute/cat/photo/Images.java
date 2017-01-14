package navjot.singh.virk.cute.cat.photo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author navNav
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
