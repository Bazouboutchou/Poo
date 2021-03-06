package ihmtp2;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DessinCarre extends JPanel{
	private ArrayList<Carre> carres; 
	private final int taille = 40; 
	
	public DessinCarre() {
		this.carres = new ArrayList<Carre>();
		addMouseListener(new MouseEventDraw());
		addMouseMotionListener(new MouseMotion());
	}
	
	
	
	private class MouseEventDraw extends MouseAdapter{
		boolean existeDeja = false;
		@Override
		public void mouseClicked(MouseEvent e) {
			
			for (Carre carre : carres) {
				if (carre.contains(e.getX(), e.getY()) && e.getClickCount() == 1) {
					existeDeja = true;
					break;
				} else if (!carre.contains(e.getX(), e.getY()) && e.getClickCount() == 1){
					existeDeja = false;
				}

			}
			if (!existeDeja && e.getClickCount() == 1){
				Carre car = new Carre(taille, e.getX(), e.getY());
				carres.add(car);				
			}		
			repaint();
			
		} 

		
		@Override
		public void mousePressed(MouseEvent e) {
			if (existeDeja){
				for (Carre carre : carres) {

					if (carre.contains(e.getX(), e.getY()) && e.getClickCount() == 2) {
						carres.remove(carre);
						existeDeja = false;
						break;
					}
						
				}
				
			}
			
			repaint();
		}
	
	}
		
	private class MouseMotion extends MouseMotionAdapter{
		
		@Override
		public void mouseMoved(MouseEvent e) {
			boolean isIn = false;
			for (Carre carre : carres) {
				if (carre.contains(e.getX(), e.getY()) ) {
					setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
					isIn = true;
					break;
				} 
			}
			
			if (!isIn) {
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

		}
		
		@Override
		public void mouseDragged(MouseEvent e) {

			for (Carre carre : carres) {
				if (carre.contains(e.getX(), e.getY())) {
					carre.setX(e.getX() - carre.getTaille()/2); // on se place au milieu 
					carre.setY(e.getY() - carre.getTaille()/2);
					break;
				} 
				
			}
			repaint();
		}
		
	}
	@Override
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    
	    Graphics2D g2 = ((Graphics2D)g);
	    
	    for (Carre carre : carres) {
			carre.dessiner(g2);
		}
	}
	
}
