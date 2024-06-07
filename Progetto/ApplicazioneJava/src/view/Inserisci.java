package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import control.Controller;
import model.LetturaJAXB;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Inserisci extends JFrame {


	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldTelefono;
	private JTextField textFieldValutazione;
	private JTextField textFieldCap;
	private JTextField textFieldSito;
	private JTextField textFieldLocazione;
	private JLabel lblToilette;
	private JRadioButton rdbtnToilette;
	private JLabel lblWifi;
	private JRadioButton rdbtnCena;
	private JLabel lblCena;
	private JRadioButton rdbtnPranzo;
	private JRadioButton rdbtnDomicilio;
	private JLabel lblPranzo;
	private JRadioButton rdbtnPosto;
	private JLabel lblPosto;
	private JRadioButton rdbtnAsporto;
	private JLabel lblAsporto;
	private JButton btnInserimento;
	private JButton btnAnnulla;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblTitolo;
	private JPanel panel_2;
	private JPanel panel_3;
	private JComboBox comboBoxTipologia;
	private JLabel lblTipologia;
	private JLabel lblSito;
	private JLabel lblNome;
	private JLabel lblTelefono;
	private JLabel lblValutazione;
	private JLabel lblDescrizione;
	private JLabel lblCap;
	private JScrollPane scrollPane;
	private JTextArea textAreaDescrizione;
	private JRadioButton rdbtnWifi;
	private JLabel lblDomicilio;

	/**
	 * Create the frame.
	 */
	public Inserisci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		lblTitolo = new JLabel("INSERISCI");
		lblTitolo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblTitolo, BorderLayout.NORTH);
		
		panel = new JPanel();
		panel_1.add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{73, 135, 0};
		gbl_panel.rowHeights = new int[]{20, 20, 20, 20, 20, 20, 20, 20, 20, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblNome = new JLabel("NOME");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 1;
		panel.add(lblNome, gbc_lblNome);
		
		textFieldNome = new JTextField();
		GridBagConstraints gbc_textFieldNome = new GridBagConstraints();
		gbc_textFieldNome.anchor = GridBagConstraints.NORTH;
		gbc_textFieldNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNome.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNome.gridx = 1;
		gbc_textFieldNome.gridy = 1;
		panel.add(textFieldNome, gbc_textFieldNome);
		textFieldNome.setColumns(10);
		
		lblSito = new JLabel("SITO");
		GridBagConstraints gbc_lblSito = new GridBagConstraints();
		gbc_lblSito.anchor = GridBagConstraints.EAST;
		gbc_lblSito.insets = new Insets(0, 0, 5, 5);
		gbc_lblSito.gridx = 0;
		gbc_lblSito.gridy = 2;
		panel.add(lblSito, gbc_lblSito);
		
		textFieldSito = new JTextField();
		GridBagConstraints gbc_textFieldSito = new GridBagConstraints();
		gbc_textFieldSito.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldSito.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldSito.gridx = 1;
		gbc_textFieldSito.gridy = 2;
		panel.add(textFieldSito, gbc_textFieldSito);
		textFieldSito.setColumns(10);
		
		lblTipologia = new JLabel("TIPOLOGIA");
		GridBagConstraints gbc_lblTipologia = new GridBagConstraints();
		gbc_lblTipologia.anchor = GridBagConstraints.EAST;
		gbc_lblTipologia.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipologia.gridx = 0;
		gbc_lblTipologia.gridy = 3;
		panel.add(lblTipologia, gbc_lblTipologia);
		
		comboBoxTipologia = new JComboBox();
		comboBoxTipologia.setModel(new DefaultComboBoxModel(new String[] {"Caffè", "Cinese", "Fast food", "Indiana", "Giapponese", "Messicana", "Italiana settentrionale", "Pizzeria", "Pesce", "Italiana meridionale", "Vegetariana", "Enoteca", "Misto"}));
		comboBoxTipologia.setSelectedIndex(12);
		GridBagConstraints gbc_comboBoxTipologia = new GridBagConstraints();
		gbc_comboBoxTipologia.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTipologia.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxTipologia.gridx = 1;
		gbc_comboBoxTipologia.gridy = 3;
		panel.add(comboBoxTipologia, gbc_comboBoxTipologia);
		
		JLabel lblLocazione = new JLabel("LOCAZIONE");
		GridBagConstraints gbc_lblLocazione = new GridBagConstraints();
		gbc_lblLocazione.anchor = GridBagConstraints.EAST;
		gbc_lblLocazione.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocazione.gridx = 0;
		gbc_lblLocazione.gridy = 4;
		panel.add(lblLocazione, gbc_lblLocazione);
		
		textFieldLocazione = new JTextField();
		GridBagConstraints gbc_textFieldLocazione = new GridBagConstraints();
		gbc_textFieldLocazione.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLocazione.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldLocazione.gridx = 1;
		gbc_textFieldLocazione.gridy = 4;
		panel.add(textFieldLocazione, gbc_textFieldLocazione);
		textFieldLocazione.setColumns(10);
		
		lblTelefono = new JLabel("TELEFONO");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.EAST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 0;
		gbc_lblTelefono.gridy = 5;
		panel.add(lblTelefono, gbc_lblTelefono);
		
		textFieldTelefono = new JTextField();
		GridBagConstraints gbc_textFieldTelefono = new GridBagConstraints();
		gbc_textFieldTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldTelefono.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldTelefono.gridx = 1;
		gbc_textFieldTelefono.gridy = 5;
		panel.add(textFieldTelefono, gbc_textFieldTelefono);
		textFieldTelefono.setColumns(10);
		
		lblValutazione = new JLabel("VALUTAZIONE");
		GridBagConstraints gbc_lblValutazione = new GridBagConstraints();
		gbc_lblValutazione.anchor = GridBagConstraints.EAST;
		gbc_lblValutazione.insets = new Insets(0, 0, 5, 5);
		gbc_lblValutazione.gridx = 0;
		gbc_lblValutazione.gridy = 6;
		panel.add(lblValutazione, gbc_lblValutazione);
		
		textFieldValutazione = new JTextField();
		GridBagConstraints gbc_textFieldValutazione = new GridBagConstraints();
		gbc_textFieldValutazione.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldValutazione.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldValutazione.gridx = 1;
		gbc_textFieldValutazione.gridy = 6;
		panel.add(textFieldValutazione, gbc_textFieldValutazione);
		textFieldValutazione.setColumns(10);
		
		lblDescrizione = new JLabel("DESCRIZIONE");
		GridBagConstraints gbc_lblDescrizione = new GridBagConstraints();
		gbc_lblDescrizione.anchor = GridBagConstraints.EAST;
		gbc_lblDescrizione.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescrizione.gridx = 0;
		gbc_lblDescrizione.gridy = 7;
		panel.add(lblDescrizione, gbc_lblDescrizione);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 7;
		panel.add(scrollPane, gbc_scrollPane);
		
		textAreaDescrizione = new JTextArea();
		textAreaDescrizione.setLineWrap(true);
		scrollPane.setViewportView(textAreaDescrizione);
		
		lblCap = new JLabel("CAP");
		GridBagConstraints gbc_lblCap = new GridBagConstraints();
		gbc_lblCap.anchor = GridBagConstraints.EAST;
		gbc_lblCap.insets = new Insets(0, 0, 0, 5);
		gbc_lblCap.gridx = 0;
		gbc_lblCap.gridy = 8;
		panel.add(lblCap, gbc_lblCap);
		
		textFieldCap = new JTextField();
		GridBagConstraints gbc_textFieldCap = new GridBagConstraints();
		gbc_textFieldCap.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCap.gridx = 1;
		gbc_textFieldCap.gridy = 8;
		panel.add(textFieldCap, gbc_textFieldCap);
		textFieldCap.setColumns(10);
		
		panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.SOUTH);
		
		btnInserimento = new JButton("INSERISCI NEL DATABASE");
		btnInserimento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnAnnulla = new JButton("ANNULLA");
		panel_2.add(btnAnnulla);
		panel_2.add(btnInserimento);
		
		panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{43, 49, 111, 0};
		gbl_panel_3.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		lblAsporto = new JLabel("Servizio asporto");
		GridBagConstraints gbc_lblAsporto = new GridBagConstraints();
		gbc_lblAsporto.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsporto.gridx = 1;
		gbc_lblAsporto.gridy = 3;
		panel_3.add(lblAsporto, gbc_lblAsporto);
		
		rdbtnAsporto = new JRadioButton("");
		GridBagConstraints gbc_rdbtnAsporto = new GridBagConstraints();
		gbc_rdbtnAsporto.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnAsporto.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnAsporto.gridx = 2;
		gbc_rdbtnAsporto.gridy = 3;
		panel_3.add(rdbtnAsporto, gbc_rdbtnAsporto);
		
		lblPosto = new JLabel("Consumazione sul posto");
		GridBagConstraints gbc_lblPosto = new GridBagConstraints();
		gbc_lblPosto.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosto.gridx = 1;
		gbc_lblPosto.gridy = 4;
		panel_3.add(lblPosto, gbc_lblPosto);
		
		rdbtnPosto = new JRadioButton("");
		GridBagConstraints gbc_rdbtnPosto = new GridBagConstraints();
		gbc_rdbtnPosto.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnPosto.gridx = 2;
		gbc_rdbtnPosto.gridy = 4;
		panel_3.add(rdbtnPosto, gbc_rdbtnPosto);
		
		lblDomicilio = new JLabel("Servizio a domicilio");
		GridBagConstraints gbc_lblDomicilio = new GridBagConstraints();
		gbc_lblDomicilio.insets = new Insets(0, 0, 5, 5);
		gbc_lblDomicilio.gridx = 1;
		gbc_lblDomicilio.gridy = 5;
		panel_3.add(lblDomicilio, gbc_lblDomicilio);
		
		rdbtnDomicilio = new JRadioButton("");
		GridBagConstraints gbc_rdbtnDomicilio = new GridBagConstraints();
		gbc_rdbtnDomicilio.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnDomicilio.gridx = 2;
		gbc_rdbtnDomicilio.gridy = 5;
		panel_3.add(rdbtnDomicilio, gbc_rdbtnDomicilio);
		
		lblPranzo = new JLabel("Servizio pranzo");
		GridBagConstraints gbc_lblPranzo = new GridBagConstraints();
		gbc_lblPranzo.insets = new Insets(0, 0, 5, 5);
		gbc_lblPranzo.gridx = 1;
		gbc_lblPranzo.gridy = 6;
		panel_3.add(lblPranzo, gbc_lblPranzo);
		
		rdbtnPranzo = new JRadioButton("");
		GridBagConstraints gbc_rdbtnPranzo = new GridBagConstraints();
		gbc_rdbtnPranzo.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnPranzo.gridx = 2;
		gbc_rdbtnPranzo.gridy = 6;
		panel_3.add(rdbtnPranzo, gbc_rdbtnPranzo);
		
		lblCena = new JLabel("Servizio cena");
		GridBagConstraints gbc_lblCena = new GridBagConstraints();
		gbc_lblCena.insets = new Insets(0, 0, 5, 5);
		gbc_lblCena.gridx = 1;
		gbc_lblCena.gridy = 7;
		panel_3.add(lblCena, gbc_lblCena);
		
		rdbtnCena = new JRadioButton("");
		GridBagConstraints gbc_rdbtnCena = new GridBagConstraints();
		gbc_rdbtnCena.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnCena.gridx = 2;
		gbc_rdbtnCena.gridy = 7;
		panel_3.add(rdbtnCena, gbc_rdbtnCena);
		
		lblWifi = new JLabel("Wi-Fi");
		GridBagConstraints gbc_lblWifi = new GridBagConstraints();
		gbc_lblWifi.insets = new Insets(0, 0, 5, 5);
		gbc_lblWifi.gridx = 1;
		gbc_lblWifi.gridy = 8;
		panel_3.add(lblWifi, gbc_lblWifi);
		
		rdbtnWifi = new JRadioButton("");
		GridBagConstraints gbc_rdbtnWifi = new GridBagConstraints();
		gbc_rdbtnWifi.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnWifi.gridx = 2;
		gbc_rdbtnWifi.gridy = 8;
		panel_3.add(rdbtnWifi, gbc_rdbtnWifi);
		
		lblToilette = new JLabel("Toilette");
		GridBagConstraints gbc_lblToilette = new GridBagConstraints();
		gbc_lblToilette.insets = new Insets(0, 0, 0, 5);
		gbc_lblToilette.gridx = 1;
		gbc_lblToilette.gridy = 9;
		panel_3.add(lblToilette, gbc_lblToilette);
		
		rdbtnToilette = new JRadioButton("");
		GridBagConstraints gbc_rdbtnToilette = new GridBagConstraints();
		gbc_rdbtnToilette.gridx = 2;
		gbc_rdbtnToilette.gridy = 9;
		panel_3.add(rdbtnToilette, gbc_rdbtnToilette);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTextFieldNome() {
		return textFieldNome;
	}

	public JTextField getTextFieldTelefono() {
		return textFieldTelefono;
	}

	public JTextField getTextFieldValutazione() {
		return textFieldValutazione;
	}

	public JTextField getTextFieldCap() {
		return textFieldCap;
	}


	public JTextField getTextFieldSito() {
		return textFieldSito;
	}
	
	public JComboBox getComboBoxTipologia() {
		return comboBoxTipologia;
	}

	public JTextField getTextFieldLocazione() {
		return textFieldLocazione;
	}

	

	public JLabel getLblToilette() {
		return lblToilette;
	}

	public JRadioButton getRdbtnToilette() {
		return rdbtnToilette;
	}

	public JLabel getLblWifi() {
		return lblWifi;
	}

	public JRadioButton getRdbtnWifi() {
		return rdbtnWifi;
	}

	public JRadioButton getRdbtnCena() {
		return rdbtnCena;
	}

	public JLabel getLblCena() {
		return lblCena;
	}

	public JRadioButton getRdbtnPranzo() {
		return rdbtnPranzo;
	}

	public JRadioButton getRdbtnDomicilio() {
		return rdbtnDomicilio;
	}

	public JLabel getLblPranzo() {
		return lblPranzo;
	}

	public JRadioButton getRdbtnPosto() {
		return rdbtnPosto;
	}

	public JLabel getLblPosto() {
		return lblPosto;
	}

	public JRadioButton getRdbtnAsporto() {
		return rdbtnAsporto;
	}

	public JLabel getLblAsporto() {
		return lblAsporto;
	}

	public JButton getBtnInserimento() {
		return btnInserimento;
	}

	public JButton getBtnAnnulla() {
		return btnAnnulla;
	}

	public JPanel getPanel() {
		return panel;
	}

	public JPanel getPanel_1() {
		return panel_1;
	}

	public JLabel getLblTitolo() {
		return lblTitolo;
	}

	public JPanel getPanel_2() {
		return panel_2;
	}

	public JPanel getPanel_3() {
		return panel_3;
	}

	public JTextArea getTextAreaDescrizione() {
		return textAreaDescrizione;
	}

	public void registraEvento(Controller c) {
		this.btnInserimento.addActionListener(c);
		this.btnAnnulla.addActionListener(c);
	}
	
	public String ricavaNome() throws Exception{
		if(this.getTextFieldNome().getText().compareTo("")==0) {
			throw new Exception();
		}
		return this.getTextFieldNome().getText();
	}
	
	public String ricavaSito(){
		return this.getTextFieldSito().getText();
	}
	
	public String ricavaTipologia() {
		return (String)this.comboBoxTipologia.getSelectedItem();
	}
	
	public String ricavaLocazione() throws Exception {
		if(this.getTextFieldLocazione().getText().compareTo("")==0) {
			throw new Exception();
		}
		return this.getTextFieldLocazione().getText();
	}
	
	public long ricavaTelefono() throws Exception {
		if(this.getTextFieldTelefono().getText().compareTo("")==0) {
			throw new Exception();
		}else {
			return Long.parseLong(this.getTextFieldTelefono().getText());
		}
	}
	
	public float ricavaValMedia() throws Exception {
		if(this.getTextFieldTelefono().getText().compareTo("")==0 || Float.parseFloat(this.getTextFieldValutazione().getText())<=0 || Float.parseFloat(this.getTextFieldValutazione().getText())>5) {
			throw new Exception();
		}else {
			return Float.parseFloat(this.getTextFieldValutazione().getText());
		}
	}
	
	public String ricavaDescrizione() throws Exception {
		if(this.getTextAreaDescrizione().getText().length()>255) {
			throw new Exception();
		}
		return this.getTextAreaDescrizione().getText();
	}
	
	public int ricavaCap() throws Exception {
		if(this.getTextFieldCap().getText().compareTo("")==0 || this.getTextFieldCap().getText().length()!=5) {
			throw new Exception();
		}
		return Integer.parseInt(this.getTextFieldCap().getText());
	}
	
	public boolean ricavaSerAsporto() {
		return this.getRdbtnAsporto().isSelected();
	}
	
	public boolean ricavaConPosto() {
		return this.getRdbtnPosto().isSelected();
	}
	
	public boolean ricavaSerDomicilio() {
		return this.getRdbtnDomicilio().isSelected();
	}
	
	public boolean ricavaSerPranzo() {
		return this.getRdbtnPranzo().isSelected();
	}
	
	public boolean ricavaSerCena() {
		return this.getRdbtnCena().isSelected();
	}
	
	public boolean ricavaWifi() {
		return this.rdbtnWifi.isSelected();
	}
	
	public boolean ricavaToilette() {
		return this.rdbtnToilette.isSelected();
	}
	
	public void pulisciCampi() {
		this.getTextFieldNome().setText(null);
		this.getTextFieldSito().setText(null);
		this.getTextFieldLocazione().setText(null);
		this.getTextFieldTelefono().setText(null);
		this.getTextFieldValutazione().setText(null);
		this.getTextFieldCap().setText(null);
		this.getTextAreaDescrizione().setText(null);
		this.getRdbtnAsporto().setSelected(false);
		this.getRdbtnPosto().setSelected(false);
		this.getRdbtnDomicilio().setSelected(false);
		this.getRdbtnPranzo().setSelected(false);
		this.getRdbtnCena().setSelected(false);
		this.getRdbtnWifi().setSelected(false);
		this.getRdbtnToilette().setSelected(false);
	}
	
	public void finestraDialogo(String s) {
		JOptionPane.showMessageDialog(this, s);
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
}
