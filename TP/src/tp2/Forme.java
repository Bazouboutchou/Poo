package tp2;

public abstract class Forme {
	private Point originePoint;
	
	public Forme(Point pointOrigine) {
		this.originePoint = pointOrigine;
	}
	public Point getOriginePoint() {
		return originePoint;
	}

	public void deplacer(Point point){
		this.originePoint = this.originePoint.additionner(point);
		deplacerSpecifique(point);
	}
	
	public abstract void dessiner (PileTransformation pile);
	public abstract void deplacerSpecifique(Point point);
}
