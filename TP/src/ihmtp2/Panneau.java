package ihmtp2;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panneau extends JPanel{
	private JButton buttonR;
	private JButton buttonJ;
	private JButton buttonB;
	
	public Panneau (){
		this.buttonR = new JButton(new ActionRouge());
		this.buttonJ = new JButton(new ActionJaune());
		this.buttonB = new JButton(new ActionBleu());

		this.buttonR.setText("Rouge");
		this.buttonJ.setText("Jaune");
		this.buttonB.setText("Bleu");
		
		this.add(this.buttonR);
		this.add(this.buttonJ);
		this.add(this.buttonB);
		
	}
	
	private class ActionRouge extends AbstractAction{
		public ActionRouge (){
			putValue("Couleur", Color.RED);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			Color c = (Color)getValue("Couleur");
			setBackground(c);			
		}
	}
	private class ActionJaune extends AbstractAction{
		public ActionJaune (){
			putValue("Couleur", Color.YELLOW);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			Color c = (Color)getValue("Couleur");
			setBackground(c);			
		}
	}
	private class ActionBleu extends AbstractAction{
		public ActionBleu (){
			putValue("Couleur", Color.BLUE);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			Color c = (Color)getValue("Couleur");
			setBackground(c);			
		}
	}
	
}
