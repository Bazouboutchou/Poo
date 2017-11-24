package tp5;

public class OpMul implements ITerme {
	private boolean 	op; // 0 = *, 1 = /
	private IFacteur    g;
	private ITerme 		d;
	public OpMul(boolean op, IFacteur g, ITerme d) {
		super();
		this.op = op;
		this.g = g;
		this.d = d;
	}
	@Override
	public int resoudre (){
		int res;
		if (op){
			res = this.g.resoudre() / this.d.resoudre();
		}else{
			res = this.g.resoudre() * this.d.resoudre();
		}
		return res; 
	}
}
