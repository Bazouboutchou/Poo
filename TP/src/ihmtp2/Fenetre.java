package ihmtp2;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fenetre extends JFrame {
	public Fenetre (){
		super();
		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)dimension.getHeight();
		int width  = (int)dimension.getWidth();
		setTitle("TP2 Java");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int reponse = JOptionPane.showConfirmDialog(null,
		                "Voulez-vous quitter l'application",
		                "Confirmation",
		                JOptionPane.YES_NO_OPTION,
		                JOptionPane.QUESTION_MESSAGE);
				if(reponse == JOptionPane.YES_OPTION ){
					dispose();
				}
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(width/2, height/2);
		setLocationRelativeTo(null);
		
		
	}
	
	

}
