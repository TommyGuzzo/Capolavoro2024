package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.glassfish.jaxb.runtime.v2.schemagen.xmlschema.List;

import control.Controller;
import model.ProvinciaTreviso;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import java.awt.TextArea;
import java.util.ArrayList;

public class InterfacciaPrinc extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnVisualizza;
	private JButton btnInserisci;
	private JButton btnElimina;
	private JPanel panel_1;
	private JLabel lblTitolo;
	private TextArea stampaRist;
	private JPanel panel_2;
	private JButton btnCercaNome;
	private JComboBox comboBoxCercaTipologia;
	private JButton btnCercaTipologia;
	private JTextField textFieldCercaNome;

	/**
	 * Create the frame.
	 */
	public InterfacciaPrinc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnVisualizza = new JButton("VISUALIZZA");
		btnVisualizza.setHorizontalAlignment(SwingConstants.LEADING);
		panel.add(btnVisualizza);
		
		btnInserisci = new JButton("INSERISCI");
		panel.add(btnInserisci);
		
		btnElimina = new JButton("ELIMINA");
		panel.add(btnElimina);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		lblTitolo = new JLabel("Visualizza");
		lblTitolo.setBounds(0, 0, 608, 26);
		lblTitolo.setFont(new Font("Tahoma", Font.PLAIN, 21));
		panel_1.add(lblTitolo);
		
		stampaRist = new TextArea();
		stampaRist.setBounds(161, 26, 447, 391);
		stampaRist.setEditable(false);
		panel_1.add(stampaRist);
		
		panel_2 = new JPanel();
		panel_2.setBounds(0, 26, 155, 391);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		btnCercaNome = new JButton("Cerca nome");
		btnCercaNome.setBounds(10, 132, 135, 23);
		panel_2.add(btnCercaNome);
		
		comboBoxCercaTipologia = new JComboBox();
		comboBoxCercaTipologia.setModel(new DefaultComboBoxModel(new String[] {"Caffè", "Cinese", "Fast food", "Indiana", "Giapponese", "Messicana", "Italiana settentrionale", "Pizzeria", "Pesce", "Italiana meridionale", "Vegetariana", "Enoteca", "Misto"}));
		comboBoxCercaTipologia.setBounds(10, 200, 135, 22);
		panel_2.add(comboBoxCercaTipologia);
		
		btnCercaTipologia = new JButton("Cerca tipologia");
		btnCercaTipologia.setBounds(10, 233, 135, 23);
		panel_2.add(btnCercaTipologia);
		
		textFieldCercaNome = new JTextField();
		textFieldCercaNome.setBounds(10, 101, 135, 20);
		panel_2.add(textFieldCercaNome);
		textFieldCercaNome.setColumns(10);
	}

	public JButton getBtnVisualizza() {
		return btnVisualizza;
	}

	public JButton getBtnInserisci() {
		return btnInserisci;
	}

	public JButton getBtnElimina() {
		return btnElimina;
	}

	public JLabel getLblTitolo() {
		return lblTitolo;
	}

	public TextArea getStampaRist() {
		return stampaRist;
	}

	public JButton getBtnCercaNome() {
		return btnCercaNome;
	}

	public JComboBox getComboBoxCercaTipologia() {
		return comboBoxCercaTipologia;
	}

	public JButton getBtnCercaTipologia() {
		return btnCercaTipologia;
	}

	public JTextField getTextFieldCercaNome() {
		return textFieldCercaNome;
	}

	public void stampaRist(ArrayList<ProvinciaTreviso.Ristorante> rist) {
		String stampa="";
		for(int i=0;i<rist.size();i++) {
			stampa+="Ristorante "+rist.get(i).getNome()+":\n";
			stampa+="-Codice ristorante: "+rist.get(i).getCodRist()+"\n";
			if(rist.get(i).getSitoWebSocial().compareTo(" ")==0) {
				stampa+="-Sito web/social: non disponibile\n";
			}else {
				stampa+="-Sito web/social: "+rist.get(i).getSitoWebSocial()+"\n";
			}
			stampa+="-Tipologia: "+rist.get(i).getTipologia()+"\n";
			stampa+="-Locazione: "+rist.get(i).getLocazione()+"\n";
			stampa+="-Recensione media: "+rist.get(i).getValMedia()+"\n";
			stampa+="-Telefono: "+rist.get(i).getTelefono()+"\n";
			if(rist.get(i).getDescrizione().compareTo(" ")==0) {
				stampa+="-Descrizione: non disponibile\n";
			}else {
				stampa+="-Descrizione: "+rist.get(i).getDescrizione()+"\n";
			}
			stampa+="-Comune:"+rist.get(i).getComune().getValue()+"(CAP="+rist.get(i).getComune().getCAP()+")\n";
			stampa+="-Servizi: \n";
			if(rist.get(i).getServizi().isAsporto()==true) {
				stampa+="	1)Asporto=Sì\n";
			}else {
				stampa+="	1)Asporto=No\n";
			}
			if(rist.get(i).getServizi().isConsPosto()==true) {
				stampa+="	2)Consumazione sul posto=Sì\n";
			}else {
				stampa+="	2)Consumazione sul posto=No\n";
			}
			if(rist.get(i).getServizi().isSerDomicilio()==true) {
				stampa+="	3)Servzio a domicilio=Sì\n";
			}else {
				stampa+="	3)Servizio a domicilio=No\n";
			}
			if(rist.get(i).getServizi().isPranzo()==true) {
				stampa+="	4)Servizio pranzo=Sì\n";
			}else {
				stampa+="	4)Servizio pranzo=No\n";
			}
			if(rist.get(i).getServizi().isCena()==true) {
				stampa+="	5)Servizio cena=Sì\n";
			}else {
				stampa+="	5)Servizio cena=No\n";
			}
			if(rist.get(i).getServizi().isWiFi()==true) {
				stampa+="	6)WiFi=Sì\n";
			}else {
				stampa+="	6)WiFi=No\n";
			}
			if(rist.get(i).getServizi().isToilette()==true) {
				stampa+="	7)toilette=Sì\n";
			}else {
				stampa+="	7)toilette=No\n";
			}
			stampa+="\n";
		}
		this.stampaRist.setText(stampa);
	}
	
	public void registraEvento(Controller c) {
		this.btnVisualizza.addActionListener(c);
		this.btnInserisci.addActionListener(c);
		this.btnElimina.addActionListener(c);
		this.btnCercaNome.addActionListener(c);
		this.btnCercaTipologia.addActionListener(c);
	}
	
	public String nomeRicerca() throws Exception{
		if(this.getTextFieldCercaNome().getText().compareTo("")==0) {
			throw new Exception("Errore: inserire il nome da cercare!");
		}else {
			return this.getTextFieldCercaNome().getText();
		}
	}
	
	public String tipologiaRicerca(){
		return (String)this.comboBoxCercaTipologia.getSelectedItem();
	}
	public void finestrachiusa() {
		this.setVisible(false);
	}
	
	public void finestraAperta() {
		this.setVisible(true);
	}
	
	public void mostraMessaggio(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	
	public void pulisciCampi() {
		this.getTextFieldCercaNome().setText(null);
		this.getStampaRist().setText(null);
	}
}
