package ihmtp3;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ZoneSaisie extends JPanel{
	private JTextField heures;
	private JTextField minutes; 
	private JLabel 	   h;
	private JLabel 	   m;
	private Horloge horloge;
	
	public ZoneSaisie (Horloge horloge){
		this.horloge = horloge;
		this.heures  = new JTextField();
		this.minutes = new JTextField();
		this.h 		 = new JLabel("Heures : ");
		this.m		 = new JLabel("Minutes : ");
		
		this.heures.setPreferredSize(new Dimension(30, 15));
		this.minutes.setPreferredSize(new Dimension(30, 15));
		
		this.add(h);
		this.add(heures);
		this.add(m);
		this.add(minutes);
		
		this.heures.getDocument().putProperty("value", 0);
		this.minutes.getDocument().putProperty("value", 1);
		
		this.heures.getDocument().addDocumentListener(new MyDocumentListener());
		this.minutes.getDocument().addDocumentListener(new MyDocumentListener());

	}
	
	private class MyDocumentListener implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			if (heures.getText().equals("")){
				horloge.changeHeure(0);	
			} else {
				horloge.changeHeure(Integer.parseInt(heures.getText()));
			}
			if (minutes.getText().equals("")) {
				horloge.changeMinute(0);
			} else {
				horloge.changeMinute(Integer.parseInt(minutes.getText()));
			}	
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			if (heures.getText().equals("")){
				horloge.changeHeure(0);	
			} else {
				horloge.changeHeure(Integer.parseInt(heures.getText()));
			}
			if (minutes.getText().equals("")) {
				horloge.changeMinute(0);
			} else {
				horloge.changeMinute(Integer.parseInt(minutes.getText()));
			}
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub

		}
		
	}
}
