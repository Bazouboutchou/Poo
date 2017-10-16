package tp4;

public class HorsLimites extends ExceptionForte {
	
	private int elem; 
	private int borne;
	public HorsLimites (int elem, int borne){
		this.elem = elem;
		this.borne = borne;
	}
	
	@Override
	public String toString(){
		return "Hors limite : valeur donnee " + this.elem + " borne du tableau : " + this.borne;
	}
	
}
