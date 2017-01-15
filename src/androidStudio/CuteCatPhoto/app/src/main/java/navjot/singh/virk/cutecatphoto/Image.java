package navjot.singh.virk.cutecatphoto;
import javax.xml.bind.annotation.*;
/**
 * Created by navNav on 15/01/2017.
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
