package tp1;

/** 
 * class pile pour creer et gerer une pile
 * @author Julien MARIE
 */
public class Pile {
	
	/** valeurs contenues dans la pile */
	private int data[];
	/** taille de la pile */
	private int size;
	/** taille courante de la pile */
	private int current_size;
	
	/**
	 * Constructeur de Pile, initialise la taille du tableau et fixe taille courante a 0 
	 * @param size : taille de la pile
	 */
	public Pile (int size){
		this.size = size;
		data = new int [this.size];
		this.current_size = 0;
	}
	
	/**
	 * empile la donnee en parametre au sommet de la pile
	 * @param data : donnee � inserer 
	 */
	
	public void empiler (int data){
		if (!this.pleine()){
			this.data [current_size] = data;
			++current_size;
		} else {
			System.out.println("Impossible d'ajouter un element dans la pile");
		}
	}
	
	/**
	 * depile le sommet de la pile et diminue la taille courrante de 1
	 * @return sommet de la pile si la taille est sup�rieur � 0, et -1 sinon
	 */
	public int depiler(){
		int top = 0;
		assert this.current_size > 0;
		
		top = this.data[this.current_size-1];
		
		--this.current_size;			
		return top;
	}
	
	/**
	 * test si la pile est pleine
	 * @return vrai si la taille courrante egale a la taille
	 */
	public Boolean pleine(){
		return (this.current_size == this.size); 
	}

	/**
	 * surcharge de la methode toString, pour faciliter l'affichage. Affiche la pile 
	 * (si elle n'est pas vide) ainsi que la taille et la taille courrante
	 * @return la chaine qui sera affichee
	 */
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
