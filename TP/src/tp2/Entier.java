package tp2;

public class Entier extends Structure {
	
	private int data[];
	private int size;
	private int current_size;
	
	public Entier (int size){
		this.size = size;
		this.current_size = 0;
		this.data = new int [size];
	}
	@Override
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
	@Override
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
}
