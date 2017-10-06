package tp2;

public class Liste extends Structure implements Cloneable {
	
	private Maillon tete;
	
	public Liste (){
		this.tete = null;
	}
	@Override
	public void inserer(int elem) {
		if(!this.existeDeja(elem)) {
			Maillon newElem = new Maillon(elem, this.tete);
			this.tete = newElem;			
		} else {
			System.out.println("l'element :" + elem +"  existe deja dans la liste");
		}
	}
	
	public boolean existeDeja (int elem) {
		Maillon tmp = this.tete;
		boolean existe = false;
		while (tmp != null && !existe) {
			if(tmp.getElem() == elem) {
				existe = true;
			} else {
				tmp = tmp.getSuiv();
			}
		}
		return  existe;
	}
	@Override
	public void supprimer (int elem) {
		if (this.tete != null) {
			Maillon tmp = this.tete;
			if (tmp.getElem() == elem) {
				this.tete = this.tete.getSuiv();
			}else {
				Maillon pred = this.tete;
				tmp = this.tete.getSuiv();
				while (tmp != null && tmp.getElem() != elem) {
					pred = tmp;
					tmp = tmp.getSuiv();
				}
				if (tmp != null) {
					pred.setSuiv(tmp.getSuiv());
				}
			}	
		}
	}
	
	@Override
	public String toString() {
		Maillon tmp = this.tete;
		String str = "[";
		while (tmp != null) {
			str += tmp.getElem() + " ";
			tmp = tmp.getSuiv();
		}		
		str += "]";
		return str;
	}
	@Override
	public void afficher() {
		Maillon tmp = this.tete;
		String str = "[";
		while (tmp != null) {
			str += tmp.getElem() + " ";
			tmp = tmp.getSuiv();
		}		
		str += "]";
		System.out.println(str);
		
	}
	@Override
	public void compacter(int nbElement) {
		for (int i = 0; i < nbElement; ++i){
			supprimer(this.tete.getElem());
		}
	}
	
	@Override	
	public Object clone() throws CloneNotSupportedException {   
		Liste copie = (Liste)super.clone();
		
		copie.setTete((Maillon)this.tete.clone());
		return copie;
	}
	public void setTete(Maillon tete) {
		this.tete = tete;
	}
	
}
