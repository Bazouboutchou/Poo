package ihmtp3;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Fenetre extends JFrame {
	public Fenetre (){
		super();
		
		setTitle("TP3 Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		setSize((int) (dim.getWidth()/6), (int) (dim.getHeight()/3));
		setLocationRelativeTo(null);
		
		
	}
	
	

}
