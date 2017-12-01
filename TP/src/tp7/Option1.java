package tp7;

public class Option1 extends DecorateurVoiture{
	
	public Option1 (Voiture voiture){
		this.voiture = voiture;
	}
	@Override
	public String getLibelle() {
		
		return this.voiture.getLibelle() + " " + "Option1";
	}

	@Override
	public double getPrix() {
		return this.voiture.getPrix() + 0.5;
	}
	@Override
	public String toString() {
		return "DecoratOption1 	[libelle : " + this.getLibelle() + " prix : " + this.getPrix() + "]";
	}

}
