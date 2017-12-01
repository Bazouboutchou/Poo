package tp7;

public class Option2 extends DecorateurVoiture{
	
	public Option2 (Voiture voiture){
		this.voiture = voiture;
	}
	@Override
	public String getLibelle() {
		
		return this.voiture.getLibelle() + " " + "Option2";
	}

	@Override
	public double getPrix() {
		return this.voiture.getPrix() + 1;
	}
	
	@Override
	public String toString() {
		return "DecoratOption2 	[libelle : " + this.getLibelle() + " prix : " + this.getPrix() + "]";
	}
}
