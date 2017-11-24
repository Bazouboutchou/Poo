package tp5;

import java.util.Map;

public class Variable implements IFacteur {
	char var;
	public Variable(char var) {
		super();
		this.var = var;
	}
	@Override
	public int resoudre() {
		return var;
	}
}
