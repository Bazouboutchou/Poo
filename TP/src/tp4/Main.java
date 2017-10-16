package tp4;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

	public static void testInspection(){
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
		
		int choix = 0;
		int elem = 0;
		Entier entier = new Entier (10);
		do{
			System.out.println("Entrer 0 pour inserer, 1 pour supprimer et -1 pour sortir");
			choix = sc.nextInt();
			System.out.println("Entrer l'element");
			switch (choix){
				case 0:
						
					elem = sc.nextInt();

					entier.inserer(elem);
					
					break;
				case 1:
					try {
						
						elem = sc.nextInt();
						entier.supprimer(elem);
					} catch (ExceptionFaible e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				default:
					System.out.println("Mauvais choix");
					break;
				
			}
			System.out.println(elem);
		}while (choix != -1);
		
		System.out.println(entier);
		
		System.out.println("**************C****************");
		
	}

	public static void main (String[] args){
		testInspection();
		
	}


}
