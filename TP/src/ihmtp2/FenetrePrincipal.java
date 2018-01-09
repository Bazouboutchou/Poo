package ihmtp2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FenetrePrincipal extends JFrame{
	private JButton btFermer;
	private JButton btCreer; 
	private int x;
	private int y;
	private int numero;
	public FenetrePrincipal ()  {
		super();
		numero = 1;
		btCreer = new JButton("Creer");
		btFermer = new JButton("Fermer");
		
		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)dimension.getHeight()/2;
		int width  = (int)dimension.getWidth()/2;
		this.setLocation(width, 0);
		this.x = 10;
		this.y = 10;
		
		setTitle("TP2 Exo 5 Java");
		
		setSize(width, height);
		setLayout(new GridLayout(1, 2));
		add(btCreer);		
		add(btFermer);
		btCreer.setBackground(Color.GREEN);
		btCreer.addActionListener(new AcitionListenerCreer());
		btFermer.setBackground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class AcitionListenerCreer implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			FenetreSecondaire f = new FenetreSecondaire(x, y, numero);
			btFermer.addActionListener(f.new MyActionListener());
			++numero;
			x += 50;
			y += 50;			
		}
	}

}
