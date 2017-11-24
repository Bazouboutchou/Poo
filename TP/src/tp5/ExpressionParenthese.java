package tp5;

public class ExpressionParenthese implements IFacteur {
	private IExpression expression;

	public ExpressionParenthese(IExpression expression) {
		super();
		this.expression = expression;
	}

	@Override
	public int resoudre() {
		return expression.resoudre();
	}
	
	
}
