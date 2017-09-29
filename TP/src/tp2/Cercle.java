package tp2;

public class Cercle extends Forme{
	private Point originePoint; 
	private int rayon;
	public Cercle(Point originePoint, int rayon) {
		super();
		this.originePoint = originePoint;
		this.rayon = rayon;
	}
	
	public void dessiner (PileTransformation pile){
		System.out.println("Dessiner Cercle");
		System.out.println("origine : " + this.originePoint.additionner(pile.getTransfoCourante()));
		System.out.println("rayon : " + this.rayon);
		
	}
	public void deplacer(Point point){
		this.originePoint = this.originePoint.additionner(point);
	}

	@Override
	public String toString() {
		return "Cercle [originePoint=" + originePoint + ", rayon=" + rayon + "]";
	}
}
