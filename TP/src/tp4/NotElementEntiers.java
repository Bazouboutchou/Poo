package tp4;

public class NotElementEntiers extends ExceptionFaible {
	private int elem;
	
	public NotElementEntiers (int elem){
		this.elem = elem;
	}
	@Override
	public String toString(){
		return "Not Element Entiers exception Element : " + this.elem + " introuvable";
	}
}
