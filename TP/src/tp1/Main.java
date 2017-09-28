package tp1;

public class Main {
	final static int SIZE = 10;
	public static void testClassPile(){
		System.out.println("**************Test Pile****************");
		Pile pile = new Pile (SIZE);
		System.out.println(pile);
		System.out.println("Test empile : ");
		
		for(int i = 0; i < SIZE; ++i){
			pile.empiler(i);
			System.out.println(pile);
		}
				
		System.out.println("Test depiler : ");
		for(int i = 0; i < SIZE; ++i){
			pile.depiler();
			System.out.println(pile);
		}
		System.out.println("************************************");
	}

	public static void testClassEntier (){
		System.out.println("**************Test Entier****************");
		Entier entier = new Entier(5);
		System.out.println("Test inserer Entier :");
		entier.inserer(2);
		System.out.println(entier);
		entier.inserer(1);
		System.out.println(entier);
		entier.inserer(5);
		entier.inserer(4);
		System.out.println(entier);
		entier.inserer(6);
		System.out.println(entier);
		System.out.println("Test supprimer Entier :");
		entier.supprimer(5);
		System.out.println(entier);
		entier.supprimer(4);
		System.out.println(entier);
		entier.supprimer(3);
		System.out.println("************************************");
	}
	
	public static void testListe() {
		System.out.println("**************Test Liste****************");
		System.out.println("Test inserer Liste :");
		Liste liste = new Liste();
		liste.inserer(1);
		System.out.println(liste);
		liste.inserer(2);
		System.out.println(liste);
		liste.inserer(1);
		liste.inserer(88);
		System.out.println(liste);
		
		liste.supprimer(1);
		liste.supprimer(3);
		System.out.println(liste);

		liste.inserer(87);
		System.out.println(liste);
		liste.inserer(103);
		System.out.println(liste);
		liste.supprimer(2);
		System.out.println(liste);
		System.out.println("**************************************");
	}
	
	public static void testArbreBinaire(){
		System.out.println("**************Test arbre****************");
		System.out.println("inserer arbre");
		
		ArbreBinaire arbre = new ArbreBinaire(10);
		arbre.affichage(arbre.getNoeud());
		System.out.println();
		arbre.inserer(5);
		arbre.affichage(arbre.getNoeud());
		System.out.println();
		arbre.inserer(5);
		arbre.affichage(arbre.getNoeud());
		System.out.println();
		arbre.inserer(11);
		arbre.affichage(arbre.getNoeud());
		System.out.println();
		arbre.inserer(6);
		arbre.affichage(arbre.getNoeud());
		System.out.println();
		arbre.inserer(13);
		arbre.affichage(arbre.getNoeud());
		System.out.println();
		arbre.inserer(14);
		arbre.affichage(arbre.getNoeud());
		System.out.println();
		arbre.inserer(3);
		arbre.affichage(arbre.getNoeud());
		System.out.println();
		arbre.inserer(4);
		arbre.affichage(arbre.getNoeud());
		System.out.println();
		arbre.inserer(6);
		arbre.affichage(arbre.getNoeud());
		System.out.println();
		System.out.println("Test Supprimer : ");

		arbre.supprimer(5);
		arbre.affichage(arbre.getNoeud());
		System.out.println();
		
		arbre.supprimer(1);
		arbre.affichage(arbre.getNoeud());
		System.out.println();
		System.out.println("************************************");

	}
	public static void main (String[] args){
		testClassPile();
		testClassEntier();
		testListe();
		testArbreBinaire();
	}


}
