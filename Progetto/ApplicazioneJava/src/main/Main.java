package main;

import java.awt.EventQueue;

import control.Controller;
import model.InvioRichiesteHTTP;
import model.LetturaJAXB;
import view.Elimina;
import view.Inserisci;
import view.InterfacciaPrinc;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfacciaPrinc finestraPrin = new InterfacciaPrinc();
					finestraPrin.setVisible(true);
					Inserisci finestraIn=new Inserisci();
					Elimina finestraEli=new Elimina();
					LetturaJAXB l= new LetturaJAXB();
					Controller c=new Controller(l,finestraPrin,finestraIn,finestraEli);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
