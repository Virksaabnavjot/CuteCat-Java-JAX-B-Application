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

@XmlRootElement(name="image")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"url", "id", "source_url"})
public class Image {
    
    String url, id, source_url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource_url() {
        return source_url;
    }

    public void setSource_url(String source_url) {
        this.source_url = source_url;
    }

}
