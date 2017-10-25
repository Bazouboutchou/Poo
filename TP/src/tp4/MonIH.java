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
		System.out.println("Méthode : " + arg1.getName());
		System.out.print("Arguments : ");

		for (Object object : arg2) {
			System.out.print(object + " ");

		}
		System.out.println();
		Object res = arg1.invoke(this.obj, arg2);
		System.out.println("Resultat : " + res);
		System.out.println("Valeur : " + this.obj);
		
		return res;
	}

}
