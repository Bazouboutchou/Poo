package tp7;

public class Voiture {
    private String libelle;
    private double prix;
    
    public Voiture() {
		
	}
    public Voiture(String libelle, double prix) {
		
		this.libelle = libelle;
		this.prix = prix;
	}
	public String getLibelle(){
            return libelle;
    }
    public double getPrix(){
            return prix;
    }
    
    public void setLibelle(String libelle){
            this.libelle = libelle;
    }
    public void setPrix(double prix){
            this.prix = prix;
    }
	@Override
	public String toString() {
		return "Voiture [libelle=" + libelle + ", prix=" + prix + "]";
	}
    
    
}
