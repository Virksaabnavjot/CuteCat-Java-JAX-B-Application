/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navjot.singh.virk.cute.cat.photo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author navNav
 */
@XmlRootElement(name="data")
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
