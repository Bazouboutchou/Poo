package tp2;

public class Segment extends Forme{
	private Point originPoint;
	private Point finalPoint;
	
	public Segment(Point originPoint, Point finalPoint) {
		super();
		this.originPoint = originPoint;
		this.finalPoint = finalPoint;
	}
	
	public void dessiner (PileTransformation pile){
		System.out.println("Dessiner Segment");
		System.out.println("origine : " + this.originPoint.additionner(pile.getTransfoCourante()));
		System.out.println("final : " + this.finalPoint.additionner(pile.getTransfoCourante()));
	}
	public void deplacer(Point point){
		this.originPoint = this.originPoint.additionner(point);
		this.finalPoint = this.finalPoint.additionner(point);
	}

	@Override
	public String toString() {
		return "Segment [originPoint=" + originPoint + ", finalPoint=" + finalPoint + "]";
	}
}
