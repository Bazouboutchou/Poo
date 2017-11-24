package tp5;

public class Chiffre implements IFacteur {
	int number;

	public Chiffre(int number) {
		super();
		this.number = number;
	}

	@Override
	public int resoudre() {
		return number;
	} 
	
	
	
}
