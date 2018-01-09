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
		int height = (int)dimension.getHeight()/4;
		int width  = (int)dimension.getWidth()/4;
		this.setLocation((int)dimension.getWidth(), (int)dimension.getHeight());
		this.x = 10;
		this.y = 10;
		
		setTitle("TP2 Exo 5 Java");
		
		setSize(width, height);
		setLayout(new GridLayout(1, 2));
		add(btCreer);		
		add(btFermer);
		btCreer.setBackground(Color.GREEN);
		btCreer.addMouseListener(new MouseCreerListener());
		btFermer.setBackground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class MouseCreerListener extends MouseAdapter{
		public void mouseClicked(MouseEvent event) {
			FenetreSecondaire f = new FenetreSecondaire(x, y, numero);
			btFermer.addActionListener(f.new MyActionListener());
			++numero;
			x += 50;
			y += 50;
			
		}
	}

}
