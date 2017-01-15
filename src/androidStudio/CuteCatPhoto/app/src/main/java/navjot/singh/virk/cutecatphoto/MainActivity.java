package navjot.singh.virk.cutecatphoto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class MainActivity extends AppCompatActivity {

    ImageView catPhotoView;
    Button fetchCatPhotoButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catPhotoView = (ImageView) findViewById(R.id.catPhotoView);
        fetchCatPhotoButton = (Button) findViewById(R.id.fetchButton);

        try {
            String imageUrl = getPhotoUrl();
            System.out.print(imageUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getPhotoUrl() throws MalformedURLException, IOException {
        try {

            URL url = new URL("http://thecatapi.com/api/images/get?format=xml&results_per_page=5");
            //Object o = u.unmarshal( url );
            System.out.println(url);

            //File file = new File("C:\\file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Response photo = (Response) jaxbUnmarshaller.unmarshal(url);
            //List<Image> list = photo.getData().getImages().getImageList();
            Image image = photo.getData().getImages().getImage();
            System.out.println("lll" + image.getUrl());
            //System.out.print("nnn" + list.get(0).url);

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(photo, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return "heelo";
    }


    }

