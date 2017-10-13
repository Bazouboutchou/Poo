package tp3;

public class Liste {
	
	private Maillon tete;
	
	public Liste (){
		this.tete = null;
	}
	
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

	public void supprimer (int elem) throws ExceptionFaible {
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
				}else {
					throw new NotElementListe();
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
	
	
}
