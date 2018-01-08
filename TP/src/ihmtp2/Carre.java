package ihmtp2;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Rectangle2D;

public class Carre extends Component {
	private int taille; 
	private int x; 


	
	private int y;
	public Carre(int taille, int x, int y) {
		super();
		this.taille = taille;
		this.x = x;
		this.y = y;
	} 
	
	
	public void dessiner (Graphics2D g) {
		g.draw(new Rectangle2D.Double(x, y, taille, taille));
	}
	
	@Override
	 public boolean contains(int x,int y){
	    if (x <= this.x + this.taille && x >= this.x &&
	    	y <= this.y + this.taille && y >= this.y)
	    	return true;
	    return false;
	 }      
	 public void setX(int x) {
		 this.x = x;
	 }
		
	 public void setY(int y) {
		 this.y = y;
	 }

}
