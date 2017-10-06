package tp2;

public abstract class Structure implements Affichable, Compactable{
	public abstract void inserer(int elem);
	public abstract void supprimer (int elem);
	public abstract void compacter (int nbElement);
}
