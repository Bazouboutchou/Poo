package tp4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

	public static void testIntrospection(){
		System.out.println("**************Test testInspection****************");
		System.out.println("**************A****************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir Point :");
		String str = sc.nextLine();
		System.out.println("Classe: " + str);
		try {
			Class <?> c = Class.forName(str);
			Field [] attributs = c.getDeclaredFields();
			Method [] methodes = c.getDeclaredMethods();
			
				
			for (Field attribut : attributs) {
				System.out.println(attribut);
			}
			
			for (Method method : methodes) {
				System.out.println(method);				
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("**************B****************");
		
		String choix;
		int elem = 0;
		Entier entier = new Entier (10);
		Method m;
		System.out.println("Entrer inserer ou supprimer et q pour sortir");
		choix = sc.next();
		
		while (!(choix.equals("q"))){
		
			System.out.println("Entrer l'element");
			elem = sc.nextInt();

			try {
				m = Entier.class.getMethod(choix, int.class);
				m.invoke(entier, elem);		
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println("Entrer inserer ou supprimer et q pour sortir");
			choix = sc.next();
		}		
		System.out.println(entier);
		
		System.out.println("**************C****************");
		
		Point p = new  Point (1,2);
		String name = null;
		System.out.println("Etrer x ou y");
		name = sc.next();
		System.out.println(p);
		try {
			
			Field f = Point.class.getDeclaredField(name);
			f.setAccessible(true);
			f.setInt(p, 0);
		} catch (IllegalArgumentException | IllegalAccessException
				| NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p);
		
		System.out.println("************D**************");

		Constructor<Entier> co;
		try {
			co = Entier.class.getConstructor(int.class);
			
			Entier a = co.newInstance(entier.getSize());
			
			a.setData(entier.getData());
			a.setCurrent_size(entier.getCurrent_size());

			System.out.println(a);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main (String[] args){
		testIntrospection();
		
	}


}
