package tp3;

import java.util.ArrayDeque;

public class Main {

	public static void testException(){
		System.out.println("**************Test testException****************");
		Pile pile = new Pile (2);
		pile.empiler(1);
		pile.empiler(1);
		
		for(int i = 0; i < 4; ++i){
			try {
				pile.depiler();
			} catch (ExceptionForte e) {
				
				System.err.println(e);
			}
			System.out.println(pile);
		}
		
		
		Liste liste = new Liste ();
		liste.inserer(1);
		try {
			liste.supprimer(5);
		} catch (ExceptionFaible e) {
			System.err.println(e);
		}
		
		Entier entier = new Entier (2);
		
		try {
			entier.inserer(1);
			entier.getTabi(1);
			entier.getTabi(2);
			entier.supprimer(78);
		} catch (ExceptionForte e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		} catch (ExceptionFaible e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
		
		
	}
	public static void testGenericite(){
		Pile <Integer>pile = new Pile<Integer> (Integer.class, 1);
		pile.empiler(2);
		//pile.data[0]=7; //ne marche pas car java fait des conversion implicite (dans byte code tout est object
		System.out.println(pile);
		
		ArrayDeque<String> array = new ArrayDeque<>();
		array.add("1");
		System.out.println(array);
		array.add("blop");
		System.out.println(array);
	}
	public static void main (String[] args){
		//testException();
		testGenericite();
	}


}
