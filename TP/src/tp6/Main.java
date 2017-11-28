package tp6;

import tp6.Entier.EntIterator;

public class Main {
	
	public static void testEntier (){
		Entier ent  = new Entier(3);
		ent.inserer(1);		
		ent.inserer(2);
		ent.inserer(3);
		
		EntIterator monIterableEntier = (EntIterator) ent.createIterator(); 
		
		while((!monIterableEntier.fini())){
			System.out.println(monIterableEntier);
			monIterableEntier.suivant();
		}
		monIterableEntier.precedent();
		monIterableEntier.supprime();
		System.out.println(monIterableEntier);
		
		
		
	}
	
	public static void main (String[] args){
		testEntier();
		
	}
}
