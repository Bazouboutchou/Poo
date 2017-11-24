package tp5;

public class OpAdd implements IExpression {
	private boolean     op; // 0 si +,  - si 1
	private IExpression d;
	private ITerme 		g;
	
	public OpAdd(boolean op, IExpression d, ITerme g){
		this.op = op;
		this.d  = d;
		this.g  = g;
	}
	@Override
	public int resoudre (){
		int res;
		if (op){
			res = this.g.resoudre() - this.d.resoudre();
		}else{
			res = this.g.resoudre() + this.d.resoudre();
		}
		return res; 
	}
}
