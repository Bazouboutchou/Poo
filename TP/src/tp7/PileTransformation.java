package tp7;

public class PileTransformation {
	private Point [] transformations;
	private int courant;
	private int taille;
	
	public PileTransformation (int taille){
		this.taille = taille;
		transformations = new Point [this.taille];
		this.courant = 0;
		this.transformations[0] = new Point (0, 0);
	}

	public int getCourant() {
		return courant;
	}

	public int getTaille() {
		return taille;
	}
	
	public Point getTransfoCourante (){
		return this.transformations[this.courant];
	}

	public void empiler (Point point){
		
		if (this.courant < this.taille - 1){
			
			point = this.transformations[this.courant].additionner(point);
			++this.courant;
			this.transformations [this.courant] = point;
			
			
		} else {
			System.out.println("Impossible d'ajouter un element dans la pile");
		}
	}

	public void depiler (){
		--this.courant;			
	}
	
	
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i <= this.courant; ++i){
			str += this.transformations[i].toString() + " ";
		}
		return str;
	}
	
}
