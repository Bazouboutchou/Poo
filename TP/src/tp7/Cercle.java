package tp7;
import tp4.Annee;
@Annee(annee = 2010)
public class Cercle extends Forme{
	//private Point originePoint; 
	private int rayon;
	public Cercle(Point originePoint, int rayon) {
		super(originePoint);
		//this.originePoint = originePoint;
		this.rayon = rayon;
	}
	
	public void dessiner (PileTransformation pile){
		System.out.println("Dessiner Cercle");
		System.out.println("origine : " + super.getOriginePoint().additionner(pile.getTransfoCourante()));
		System.out.println("rayon : " + this.rayon);
		
	}
	@Override
	public void deplacerSpecifique(Point point){
		//this.originePoint = this.originePoint.additionner(point);
	}

	@Override
	public String toString() {
		return "Cercle [originePoint=" + super.getOriginePoint() + ", rayon=" + this.rayon + "]";
	}



}
