package tp4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MonIH implements InvocationHandler{

	private Integer obj;
	
	public MonIH (Integer obj){
		this.obj = obj; 
	}
	
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		System.out.println("Methode : " + arg1.getName());
		System.out.println("Arguments : " + arg2[0]);
		System.out.println("Valeur : " + this.obj);

		Object res = arg1.invoke(this.obj, arg2[0]);
		System.out.println("Resultat Compare To: " + res);
		System.out.println();
		return res;
	}

}
