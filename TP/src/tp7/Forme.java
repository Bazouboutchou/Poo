package tp7;

import java.util.Observable;
import java.util.Observer;



public abstract class Forme implements Observer{

	private Point originePoint;
	
	public Forme(Point pointOrigine) {
		this.originePoint = pointOrigine;
	}
	public Point getOriginePoint() {
		return originePoint;
	}
	public void setOriginePoint(Point originePoint){
		this.originePoint = originePoint;
	}
	
	public void deplacer(Point point){
		this.originePoint = this.originePoint.additionner(point);
		deplacerSpecifique(point);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		int x = ((Point) o).getX();
		int y = ((Point) o).getY();
		System.out.println("update observateur");
		this.originePoint = new Point(x, y);
	}


	public abstract void dessiner (PileTransformation pile);
	public abstract void deplacerSpecifique(Point point);
}
