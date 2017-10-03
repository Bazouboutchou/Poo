package tp2;

import java.util.Arrays;

public class Image extends Forme {

	private Forme []formes;
	private int taille;
	private int nbFormes;
	//private Point originePoint;
	
	
	public Image(int taille) {
		super(new Point());
		this.taille = taille;
		this.nbFormes = 0;
		this.formes = new Forme[this.taille];
		//this.originePoint = new Point();
	}

	public Image(int taille, Point originePoint) {
		super(originePoint);
		this.taille = taille;
		this.nbFormes = 0;
		//this.originePoint = originePoint;
		this.formes = new Forme[this.taille];
	}
	
	public void ajouter (Forme forme){
		if (this.nbFormes < this.taille){
			this.formes[this.nbFormes] = forme;
			++this.nbFormes;
		} else{
			System.out.println("Impossible d'ajouter une forme");
		}
	}
	
	@Override
	public void dessiner(PileTransformation pile) {
		System.out.println("Image " + super.getOriginePoint().additionner(pile.getTransfoCourante()));
		for (Forme f : this.formes){
			if (f != null)
				f.dessiner(pile);			
		}
	}

	@Override
	public void deplacerSpecifique(Point point) {
		//this.originePoint = this.originePoint.additionner(point);
		for (Forme f : this.formes){
			if (f != null)
				f.deplacer(point);					
		}
	}

	@Override
	public String toString() {
		return "Image [formes=" + Arrays.toString(this.formes) + ", originePoint=" + super.getOriginePoint() + "]";
	}

	@Override
	public void afficher() {
		System.out.println("Image [formes=" + Arrays.toString(this.formes) + ", originePoint=" + super.getOriginePoint() + "]");	
	}
	
	
}
