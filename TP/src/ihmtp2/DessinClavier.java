package ihmtp2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DessinClavier extends JPanel{
	private ArrayList<Line2D> segments;
	public DessinClavier(){
		this.segments= new ArrayList<Line2D>();
		segments.add(new Line2D.Double(0, 0, 0, 0));
		addKeyListener(new ClavierListener());
		setFocusable(true);
	}
	
	private class ClavierListener extends KeyAdapter{


		@Override
		public void keyPressed(KeyEvent e) {
			double x1 = segments.get(segments.size()-1).getX2(); 
			double x2 = segments.get(segments.size()-1).getX2();
			double y1 = segments.get(segments.size()-1).getY2();
			double y2 = segments.get(segments.size()-1).getY2();
			
			double valeur = 1;
			
			x1 = segments.get(segments.size()-1).getX2();
			y1 = segments.get(segments.size()-1).getY2();
			
			if (e.isShiftDown() || e.VK_H == KeyEvent.VK_H || e.VK_J == KeyEvent.VK_J ||
				e.VK_K == KeyEvent.VK_K || e.VK_L == KeyEvent.VK_L){
				valeur = valeur * 5;
			}
			
			if (e.getKeyCode() == KeyEvent.VK_LEFT || e.VK_H == KeyEvent.VK_H ){
				x2 -= valeur; 
			} else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
				x2 += valeur;
			}else if (e.getKeyCode() == KeyEvent.VK_UP){
				y2 -= valeur;
			}else if (e.getKeyCode() == KeyEvent.VK_DOWN){
				y2 += valeur;
			}
			segments.add(new Line2D.Double(x1, y1, x2, y2));
			repaint();
		}		
	}
	
	@Override
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    
	    Graphics2D g2 = ((Graphics2D)g);
	    
	    for (Line2D segment : segments) {
			g2.draw(segment);
		}
	}
}
