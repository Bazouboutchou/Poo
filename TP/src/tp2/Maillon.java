package tp2;

public class Maillon implements Cloneable {
	private int     elem;
	private Maillon suiv;
	
	public Maillon(int elem, Maillon suiv){
		this.elem = elem;
		this.suiv = suiv;
	}

	public int getElem() {
		return elem;
	}

	public void setElem(int elem) {
		this.elem = elem;
	}

	public Maillon getSuiv() {
		return suiv;
	}

	public void setSuiv(Maillon suiv) {
		this.suiv = suiv;
	}
	
	@Override	
	public Object clone() throws CloneNotSupportedException {   
		Maillon copie = (Maillon)super.clone();
		copie.setElem(this.elem);
		copie.setSuiv((Maillon)this.suiv.clone());
		return copie;
	}
}
