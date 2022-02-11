package pruebas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ejemplolabeldinamica {

	JFrame frame = new JFrame("ejemplo label dinamica");
	JButton boton = new JButton("pulsa aqui");
	JPanel panel = new JPanel();
	JLabel label = new JLabel("has pulsado 0 veces");
	int pulsaciones;

	ejemplolabeldinamica() {
		frame.add(panel);
		panel.add(label);
		panel.add(boton);
		
		boton.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			Actualizapulsaciones();
			frame.pack();
			
		}
		});}
	
	public void Actualizapulsaciones() {
		pulsaciones++;
		label.setText("has pulsado " + pulsaciones + " veces");
	}

	 public void iniciar() {
		 frame.pack();
		 frame.setVisible(true);
		 
		 
	 }
	 
	public static void main(String[] args) {
		ejemplolabeldinamica uno = new ejemplolabeldinamica();
		uno.iniciar();

	}

}
