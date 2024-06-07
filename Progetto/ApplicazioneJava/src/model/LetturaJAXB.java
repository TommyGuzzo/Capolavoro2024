package model;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class LetturaJAXB {
	
	private JAXBContext context; //Oggetto per la gestione del contesto JAXB
	private Unmarshaller unmarshaller; //Oggetto per effettuare la lettura del file XML
	
	public LetturaJAXB() {
		try {
			this.context=JAXBContext.newInstance(ProvinciaTreviso.class);
			this.unmarshaller=this.context.createUnmarshaller();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Metodo per effettuare la lettura del file XML
	public List<ProvinciaTreviso.Ristorante> effettuaLettura(){
		String urlFile= "http://localhost/webServiceRistoranti/stampaXML.php";
		ProvinciaTreviso rist=null;
		try {
			URL url=new URL(urlFile);
			rist=(ProvinciaTreviso) this.unmarshaller.unmarshal(url);
		} catch (JAXBException | MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rist.getRistorante();
	}
	
}
