package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import org.glassfish.jaxb.runtime.v2.schemagen.xmlschema.List;

import model.*;
import view.Elimina;
import view.Inserisci;
import view.InterfacciaPrinc;

public class Controller implements ActionListener{
	
	private LetturaJAXB letturaXML;
	private InterfacciaPrinc finestraPrinc;
	private Inserisci finestraIns;
	private Elimina finestraElim;
	
	public Controller(LetturaJAXB letturaXML, InterfacciaPrinc finestraPrinc, Inserisci finestraIns, Elimina finestraElim) {
		this.letturaXML = letturaXML;
		this.finestraPrinc = finestraPrinc;
		this.finestraIns = finestraIns;
		this.finestraElim = finestraElim;
		
		this.finestraPrinc.registraEvento(this);
		this.finestraIns.registraEvento(this);
		this.finestraElim.registraEvento(this);
	}
	// Metodo per gestire gli eventi
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.finestraPrinc.getBtnVisualizza()) {
			stampaRist();
		}
		if(e.getSource()==this.finestraPrinc.getBtnInserisci()) {
			this.finestraPrinc.finestrachiusa();
			this.finestraIns.finestraAperta();
		}
		if(e.getSource()==this.finestraPrinc.getBtnElimina()) {
			this.finestraPrinc.finestrachiusa();
			this.finestraElim.finestraAperta();
		}
		if(e.getSource()==this.finestraPrinc.getBtnCercaNome()) {
			ricercaNome();
		}
		if(e.getSource()==this.finestraPrinc.getBtnCercaTipologia()) {
			ricercaTipologia();
		}
		if(e.getSource()==this.finestraIns.getBtnAnnulla()) {
			this.finestraIns.finestrachiusa();
			this.finestraPrinc.finestraAperta();
		}
		if(e.getSource()==this.finestraIns.getBtnInserimento()) {
			String esito=effettuaInserimento();
			this.finestraIns.mostraMessaggio(esito);
			this.finestraIns.pulisciCampi();
		}
		if (e.getSource() == this.finestraElim.getBtnCancellaDalDatabase()) {
			String esito = effettuaEliminazione();
			finestraElim.mostraEsitoEliminazione(esito);
		}
		if(e.getSource()==this.finestraElim.getBtnAnnulla()) {
			this.finestraElim.finestrachiusa();
			this.finestraPrinc.pulisciCampi();
			this.finestraPrinc.finestraAperta();
		}
	}

	// Metodo per effettuare la ricerca di un ristorante per tipologia
	private void ricercaTipologia() {
		ArrayList<ProvinciaTreviso.Ristorante> ris=new ArrayList<>();
		String nomeCerca;
		nomeCerca = this.finestraPrinc.tipologiaRicerca();
		ArrayList<ProvinciaTreviso.Ristorante> ristoranti=(ArrayList<ProvinciaTreviso.Ristorante>)this.letturaXML.effettuaLettura();
		for(int i=0;i<ristoranti.size();i++) {
			if(ristoranti.get(i).getTipologia().compareToIgnoreCase(nomeCerca)==0) {
				ris.add(ristoranti.get(i));
			}
		}
		if(ris.size()==0) {
			this.finestraPrinc.mostraMessaggio("Errore: Non ci sono ristoranti con quella tipologia!");
		}else {
			this.finestraPrinc.stampaRist(ris);
		}
	}

	// Metodo per effettuare la ricerca di un ristorante per nome
	private void ricercaNome() {
		try {
			ArrayList<ProvinciaTreviso.Ristorante> ris=new ArrayList<>();
			String nomeCerca;
			nomeCerca = this.finestraPrinc.nomeRicerca();
			ArrayList<ProvinciaTreviso.Ristorante> ristoranti=(ArrayList<ProvinciaTreviso.Ristorante>)this.letturaXML.effettuaLettura();
			for(int i=0;i<ristoranti.size();i++) {
				if(ristoranti.get(i).getNome().compareToIgnoreCase(nomeCerca)==0) {
					ris.add(ristoranti.get(i));
				}
			}
			if(ris.size()==0) {
				this.finestraPrinc.mostraMessaggio("Ristorante inesistente!");
			}else {
				this.finestraPrinc.stampaRist(ris);
			}
		} catch (Exception e) {
			this.finestraPrinc.mostraMessaggio("Errore: non è stato inserito alcun nome!");
		}
	}

	// Metodo per effettuare l'inserimento di un ristorante
	private String effettuaInserimento() {
		InvioRichiesteHTTP irHTTP=null;
		try {
			String dati="nome="+this.finestraIns.ricavaNome();
			dati+="&sito_web_social="+this.finestraIns.ricavaSito()+"&tipologia="+this.finestraIns.ricavaTipologia();
			dati+="&locazione="+this.finestraIns.ricavaLocazione()+"&telefono="+this.finestraIns.ricavaTelefono();
			dati+="&valutazione="+this.finestraIns.ricavaValMedia()+"&descrizione="+this.finestraIns.ricavaDescrizione();
			dati+="&CAP="+this.finestraIns.ricavaCap()+"&asporto="+this.finestraIns.ricavaSerAsporto();
			dati+="&con_posto="+this.finestraIns.ricavaConPosto()+"&domicilio="+this.finestraIns.ricavaSerDomicilio();
			dati+="&pranzo="+this.finestraIns.ricavaSerPranzo()+"&cena="+this.finestraIns.ricavaSerCena();
			dati+="&wi_fi="+this.finestraIns.ricavaWifi()+"&toilette="+this.finestraIns.ricavaToilette();
			dati+="&richiesta=inserisci";
			String controlloServizi=controlloServizi();
			if(controlloServizi.compareTo("")==0) {
				irHTTP= new InvioRichiesteHTTP(dati);
				return irHTTP.invioDati();
			}else {
				return controlloServizi;
			}
		} catch (Exception e) {
			return "Errore: parametri mal inseriti o non inseriti!";
		}
	}

	// Metodo per controllare che almeno un servizio sia selezionato
	private String controlloServizi(){
		String errore="";
		if(this.finestraIns.ricavaSerAsporto()==false && this.finestraIns.ricavaSerDomicilio()==false && this.finestraIns.ricavaConPosto()==false) {
			errore+="Errore: non è stato selezionato nè un servizio d'asporto\n";
			errore+="nè un servizio di consumazione sul posto e nemmeno il servizio a domicilio\n";
			errore+="Ci deve essere almeno uno di questi\n";
		}
		if(this.finestraIns.ricavaSerPranzo()==false && this.finestraIns.ricavaSerCena()==false) {
			errore+="Errore: non è stato selezionato un tipo di servizio pranzo/cena.\n";
			errore+="Ci deve essere almeno uno dei due tipi di ristorazione!";
		}
		return errore;
	}

	private void stampaRist() {
		ArrayList<ProvinciaTreviso.Ristorante> rist=(ArrayList<ProvinciaTreviso.Ristorante>)this.letturaXML.effettuaLettura();
		this.finestraPrinc.stampaRist(rist);
	}
	
	// Metodo per effettuare l'eliminazione di un ristorante
	private String effettuaEliminazione() {
		InvioRichiesteHTTP elHTTP = null;
		try {
			int codiceRistorante = this.finestraElim.ricavaCodRist(); // Otteni il codice ristorante dalla finestra
			if (controlloCodice(codiceRistorante)==true) {
				// Il codice ristorante esiste nel database, procedi con l'eliminazione
				String dati = "cod_rist=" + codiceRistorante + "&richiesta=elimina";
				elHTTP = new InvioRichiesteHTTP(dati);
				return elHTTP.invioDati();
			} else {
				// Il codice ristorante non esiste nel database, mostra un messaggio di errore
				return "Errore: Il codice ristorante specificato non esiste nel database";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	private boolean controlloCodice(int codiceRistorante) {
		ArrayList<ProvinciaTreviso.Ristorante> rist=(ArrayList<ProvinciaTreviso.Ristorante>)this.letturaXML.effettuaLettura();
		for(int i=0;i<rist.size();i++) {
			if(rist.get(i).getCodRist()==codiceRistorante) {
				return true;
			}
		}
		return false;
	}
	
	
}
