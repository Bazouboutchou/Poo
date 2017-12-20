package ihmtp1;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Fenetre extends JFrame {
	public Fenetre (){
		super();
		
	}
	
	public void fenetre1 (){
		setTitle("Fenetre1 Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setSize(400, 100);
		
        //setAlwaysOnTop(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //setVisible(true);
	}
	
	public void fenetre2 (){
		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)dimension.getHeight();
		int width  = (int)dimension.getWidth();
		setTitle("Fenetre2 Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(width/2, height/2);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
