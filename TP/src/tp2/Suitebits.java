package tp2;

public class Suitebits extends Structure {

	private long bits[];
	private int taille;
	
	public Suitebits (int taille){
		this.taille = taille;
		this.bits = new long [taille];
	}
	
	@Override
	public void afficher() {
		for (long l : this.bits) {
			System.out.println(l);
		}
		System.out.println();
	}

	@Override
	public void inserer(int elem) {
		if (elem > taille * 64){
			System.out.println("Element trop grand");
		}else {
			int col = elem / 64; 
			int bit = elem % 64;
			this.bits[col] = this.bits[col] | (long)Math.pow(2, bit);
		}
	}

	@Override
	public void supprimer(int elem) {
		// TODO Auto-generated method stub
		if (elem > taille * 64){
			System.out.println("Element trop grand");
		}else {
			int col = elem / 64; 
			int bit = elem % 64;
			this.bits[col] = this.bits[col] ^ (long)Math.pow(2, bit);
		}
	}

	@Override
	public void compacter(int nbElement) {
		if (this.taille > nbElement){
			this.taille = this.taille - nbElement;
		}
		else{
			this.taille = 0; 			
		}
	}

}
