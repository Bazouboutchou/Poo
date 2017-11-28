package tp7;

public class Entier {
	
	private int data[];
	private int size;
	private int current_size;
	
	private ICommande cDeb;
	private ICommande cFin;
	
	public Entier (int size){
		this.size = size;
		this.current_size = 0;
		this.data = new int [size];
	}
	
	public void inserer(int elem){
		this.cDeb.execute("inserer");
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
		this.cFin.execute("inserer");
	}
	
	public void supprimer (int elem){
		this.cDeb.execute("Supprimer");
		int tmp = existe(elem); 
		if (tmp != -1){
			--this.current_size;
			for (int i = tmp; i < this.current_size; ++i){
				this.data[i] = this.data[i+1];
			}

		}else{
			System.out.println("cet element est introuvable");
		}
		this.cFin.execute("Supprimer");
	}
	
	public int existe (int elem) {
		this.cDeb.execute("existe");
		int indice = -1; 
		for(int i = 0; i < this.current_size; ++i){
			if (this.data[i] == elem) indice = i;
		}
		this.cFin.execute("existe");
		return indice;

	}
	
	
	
	public ICommande getcDeb() {
		return cDeb;
	}

	public ICommande getcFin() {
		return cFin;
	}

	public void setcDeb(ICommande cDeb) {
		this.cDeb = cDeb;
	}

	public void setcFin(ICommande cFin) {
		this.cFin = cFin;
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
