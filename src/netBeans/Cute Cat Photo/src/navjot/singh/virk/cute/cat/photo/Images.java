/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navjot.singh.virk.cute.cat.photo;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author navNav
 */

@XmlRootElement(name="images")
@XmlAccessorType(XmlAccessType.FIELD)
public class Images {

    
    Image image;

    //@XmlElement(name = "image", type=Image.class)
    public Image getImage() {
        return image;
    }

    
}
