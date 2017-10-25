package tp4;

public class Generique <A>{
	private A info1;
	private A info2;
	
	public Generique (A a, A b){
		this.info1 = a;
		this.info2 = b;
	}
	
	public A getInfo1 () {
		return this.info1;
	}
	
	public A getInfo2 () {
		return this.info2;
	}

	public void setInfo1(A info1) {
		this.info1 = info1;
	}

	public void setInfo2(A info2) {
		this.info2 = info2;
	}
	
	public Generique <A> fusionner (Generique<A> g){
		return new Generique <A> (getInfo1(), g.getInfo2());
	}
}
