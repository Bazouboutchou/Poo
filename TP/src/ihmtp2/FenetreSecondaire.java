package ihmtp2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FenetreSecondaire extends JFrame{

	public FenetreSecondaire(int x, int y, int numero) {
		super();
		
		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)dimension.getHeight();
		int width  = (int)dimension.getWidth();
		setTitle("Fenetre n " + numero);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(width/2, height/2);
		setLocation(x, y);

		setVisible(true);
	}
	public class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
		  	dispose();
		  	JButton button = ((JButton) event.getSource());
		  	button.removeActionListener(this);
		}
	}

}
