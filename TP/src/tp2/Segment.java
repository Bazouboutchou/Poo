package tp2;

public class Segment extends Forme{
	//private Point originePoint;
	private Point finalPoint;
	
	public Segment(Point originePoint, Point finalPoint) {
		super(originePoint);
		//this.originePoint = originePoint;
		this.finalPoint = finalPoint;
	}
	
	public void dessiner (PileTransformation pile){
		System.out.println("Dessiner Segment");
		System.out.println("origine : " + super.getOriginePoint().additionner(pile.getTransfoCourante()));
		System.out.println("final : " + this.finalPoint.additionner(pile.getTransfoCourante()));
	}
	public void deplacerSpecifique(Point point){
		//this.originePoint = this.originePoint.additionner(point);
		this.finalPoint = this.finalPoint.additionner(point);
	}

	@Override
	public String toString() {
		return "Segment [originePoint=" + super.getOriginePoint() + ", finalPoint=" + this.finalPoint + "]";
	}
}
