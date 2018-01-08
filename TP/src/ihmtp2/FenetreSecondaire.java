package ihmtp2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FenetreSecondaire extends JFrame{

	public FenetreSecondaire(int x, int y, int numero) {
		super();
		
		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)dimension.getHeight();
		int width  = (int)dimension.getWidth();
		setTitle("Fenetre n " + numero);
		setSize(width/2, height/2);
		
		setLocation(x, y);
		setVisible(true);
	}
}
