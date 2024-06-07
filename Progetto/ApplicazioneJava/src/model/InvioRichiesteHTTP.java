package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.net.ssl.HttpsURLConnection;

public class InvioRichiesteHTTP {
	
	private URL url; //URL dove inviare le richieste
	private String dati; //dati da inviare
	private HttpURLConnection conn; //connessione HTTP
	
	public InvioRichiesteHTTP(String dati) {
		try {
			this.url=new URL("http://localhost/webServiceRistoranti/inser_elim_ristoranti.php"); //URL del web service
			this.dati=dati;
			this.conn=(HttpURLConnection) url.openConnection(); //Apro la connessione
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public String invioDati() {
		try {
			//Impostazioni della connessione
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			conn.setDoInput(true);

			//Invio dei dati
			try(OutputStream os=conn.getOutputStream()){
				byte[] input=dati.getBytes(StandardCharsets.UTF_8);
				os.write(input,0,input.length);
			}
			return leggoEsito(conn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	//Metodo per leggere l'esito della richiesta
	public String leggoEsito(HttpURLConnection conn) {
		StringBuilder risposta=new StringBuilder();
		try(BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"))){
			String line;
			while((line=br.readLine())!=null) {
				risposta.append(line);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.conn.disconnect();
		return risposta.toString();
	}
}
