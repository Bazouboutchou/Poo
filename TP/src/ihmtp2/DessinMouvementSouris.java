package ihmtp2;

import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class DessinMouvementSouris extends JPanel {

	
	
	
	public DessinMouvementSouris(){
		addMouseMotionListener(new MouseEventDraw());
	}
	
	private class MouseEventDraw extends MouseAdapter{
		@Override
		public void mouseMoved(MouseEvent e) {
			dessiner(e);
		}	
	}
	
	public void dessiner(MouseEvent e) {
		Graphics2D g = (Graphics2D)this.getGraphics();
		Rectangle2D rec = new Rectangle2D.Double(e.getX(), e.getY(), 2, 2);
		g.draw(rec);
		
	} 
	
	
}
