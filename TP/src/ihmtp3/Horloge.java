package ihmtp3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;
import javax.swing.JTextField;

import ihmtp2.Carre;

public class Horloge extends JPanel {

	private Line2D     heure;
	private Line2D	   minute;
	private int width;
    private int height;
    private AffineTransform afRotateMinute;
    private AffineTransform afRotateHeure;
    
    
	public Horloge (){
		this.changeHeure(0);
		this.changeMinute(0);
		
	}
	
	public void changeHeure(int heure){
		afRotateHeure = new AffineTransform();
		afRotateHeure.rotate(Math.toRadians(30*heure), width/2, height/2);
		repaint();
		System.out.println("heure :" + heure);
	}
	public void changeMinute(int minute){
		
		afRotateMinute = new AffineTransform();
		afRotateMinute.rotate(Math.toRadians(6*minute), width/2, height/2);
		afRotateHeure.rotate(Math.toRadians(0.5*minute), width/2, height/2);
		System.out.println("minute :" + 6*minute);
		repaint();
	}
	@Override
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    this.width = this.getSize().width;
		this.height = this.getSize().height;
		this.minute = new Line2D.Double(width/2, height/2 - 100, width/2, height/2);
		this.heure = new Line2D.Double(width/2, height/2 - 60, width/2, height/2);

		Graphics2D g2 = ((Graphics2D)g);
	    Ellipse2D ell = new Ellipse2D.Double(width/2 - 125, height/2 - 125, 250, 250);
	    g2.draw(ell);	   
	    g2.draw(afRotateMinute.createTransformedShape(this.minute));
	    g2.draw(afRotateHeure.createTransformedShape(this.heure));

	}
}
