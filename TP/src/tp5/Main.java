package tp5;

public class Main {

	public static void main(String[] args) {
		IExpression res = new OpAdd(true, new ExpressionParenthese(new OpAdd(true, new OpMul(true, new Chiffre(363), new Variable('y')),new Chiffre(2))) , new Chiffre(5));
		System.out.println("Res de (7/y -2) = " + res.resoudre() + " avec y = 121");
	}

}
