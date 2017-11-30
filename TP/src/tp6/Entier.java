package tp6;

import java.util.Iterator;

public class Entier implements MonIterable{
	
	private int data[];
	private int size;
	private int current_size;
	
	public Entier (int size){
		this.size = size;
		this.current_size = 0;
		this.data = new int [size];
	}
	
	public void inserer(int elem){
		if (this.current_size > 0){
			
			if (this.current_size <= this.size && existe(elem) == -1)
			{
				
			
				int i = 0;
				/* cherche l'indice ou inserer */
				while (this.data[i]< elem && i < this.current_size) {
					++i;
				} 
				++this.current_size;
				int tmp = 0;
				/* effectue le decalage */
				for(int j=i; j < this.current_size; ++j){
					if(j == i){
						tmp = this.data[j];
						this.data[j] = elem;
					}
					else {
						this.data[j] = tmp;
						tmp = this.data[j];
					}
				}
			} else{
				System.out.println("Taille depasse ou l element existe deja");
			}
		} else{
			this.data[this.current_size] = elem;
			++this.current_size;
		}
	}
	
	public void supprimer (int elem){
		int tmp = existe(elem); 
		if (tmp != -1){
			--this.current_size;
			for (int i = tmp; i < this.current_size; ++i){
				this.data[i] = this.data[i+1];
			}

		}else{
			System.out.println("cet element est introuvable");
		}
	}
	
	public int existe (int elem) {
		int indice = -1; 
		for(int i = 0; i < this.current_size; ++i){
			if (this.data[i] == elem) indice = i;
		}
		return indice;
	}
	
	@Override
	public String toString() {
		String str = "";
		if (this.current_size > 0) {
			str = "[";
			for (int i = 0; i < this.current_size; ++i) {
				str += this.data[i] + " ";
			}
			str += "]";
		} 
		str += "taille = " + this.size + " taille courante = " + this.current_size;
		return str;
	}

	@Override
	public MonIterator createIterator() {
		return new EntIterator();
	}
	

public class EntIterator implements BidirIterator, SupIterator{
		private int index;
		public EntIterator (){
			this.index = 0;
		}
		
		@Override
		public int courant() {	
			return data[this.index];
		}
	
		@Override
		public void suivant() {
			++this.index;
		}
	
		@Override
		public boolean fin() {
			return (this.index == current_size);
		}
	

		@Override
		public void supprime() {
			supprimer(data[this.index]);
			
			--this.index;
			
		}

		@Override
		public void precedent() {
			--this.index;
		}
		@Override
		public String toString() {
			return "Entier : " + this.courant();
		}
	};
	
}
