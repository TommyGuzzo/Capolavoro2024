package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import control.Controller;

import java.awt.FlowLayout;

public class Elimina extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCodRistorante;
	private JButton btnAnnulla;
	private JButton btnCancellaDalDatabase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Elimina frame = new Elimina();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Elimina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 138);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.SOUTH);

		btnCancellaDalDatabase = new JButton("CANCELLA DAL DATABASE");
		btnAnnulla = new JButton("ANNULLA");

		panel_3.add(btnAnnulla);
		panel_3.add(btnCancellaDalDatabase);

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel = new JLabel("ID_RISTORANTE");
		panel_2.add(lblNewLabel);

		textFieldCodRistorante = new JTextField();
		panel_2.add(textFieldCodRistorante);
		textFieldCodRistorante.setColumns(10);
	}

	public void finestrachiusa() {
		this.setVisible(false);
	}

	public void finestraAperta() {
		this.setVisible(true);
	}

	public JButton getBtnAnnulla() {
		return btnAnnulla;
	}

	public JButton getBtnCancellaDalDatabase() {
		return btnCancellaDalDatabase;
	}

	public Integer ricavaCodRist() throws Exception {

		String codRist = textFieldCodRistorante.getText();

		if (codRist.matches("[0-9]+")) {
			return Integer.parseInt(codRist);
		} else {
			throw new Exception("Il campo contiene parole anziché numeri.");
		}
	}

	public JTextField getTextFieldCodRistorante() {
		return textFieldCodRistorante;
	}

	public void registraEvento(Controller c) {
		btnCancellaDalDatabase.addActionListener(c);
		btnAnnulla.addActionListener(c);
	}

	public void mostraEsitoEliminazione(String esito) {
		JOptionPane.showMessageDialog(this, esito, "Esito Eliminazione", JOptionPane.INFORMATION_MESSAGE);
	}
}