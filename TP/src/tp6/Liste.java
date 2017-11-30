package tp6;

import java.util.Iterator;

public class Liste implements MonIterable{
	
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
	public MonIterator createIterator() {
		return new ListeIterator();
		
	}
	
	class ListeIterator implements InitIterator, InsIterator{
		private Maillon index;
		
		public ListeIterator (){
			this.index = tete;
		}
		@Override
		public int courant() {
			return this.index.getElem();
		}

		@Override
		public void suivant() {
			this.index = this.index.getSuiv();
		}

		@Override
		public boolean fin() {
			return (this.index == null);
		}

		@Override
		public void insere(int i) {
			Liste.this.inserer(i);
			this.index = tete;
		}

		@Override
		public void init() {
			this.index = tete;
		}
		@Override
		public String toString() {
			return "Maillon : " + this.courant();
		}
	}
	
}
