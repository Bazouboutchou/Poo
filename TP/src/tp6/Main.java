package tp6;

import java.awt.List;

import tp6.Entier.EntIterator;
import tp6.Liste.ListeIterator;

public class Main {
	
	public static void testEntier (){
		
		System.out.println("*******Entier**********");
		Entier ent  = new Entier(3);
		ent.inserer(1);		
		ent.inserer(2);
		ent.inserer(3);
		System.out.println("Mes entier traité : " + ent);
		EntIterator monIteratoreEntier = (EntIterator) ent.createIterator(); 
		System.out.println("test parcourt : ");
		while((!monIteratoreEntier.fin())){
			System.out.println(monIteratoreEntier);
			monIteratoreEntier.suivant();
		}
		System.out.println("Affiche l'avant dernier element");
		monIteratoreEntier.precedent();
		System.out.println(monIteratoreEntier);

		System.out.println("supprime un element");
		monIteratoreEntier.supprime();
		System.out.println(ent);
		
		System.out.println("*******Liste**********");		
		Liste liste = new Liste ();
		liste.inserer(1);
		liste.inserer(2);
		liste.inserer(3);
		
		System.out.println("Ma liste traité : " + liste);
		ListeIterator monIteratoreListe = (ListeIterator) liste.createIterator();
		System.out.println("test parcourt : ");
		while (!(monIteratoreListe.fin())){
			System.out.println(monIteratoreListe);
			monIteratoreListe.suivant();
		}
		System.out.println("insere et init :");
		monIteratoreListe.init();
		monIteratoreListe.insere(4);
		
		while (!(monIteratoreListe.fin())){
			System.out.println(monIteratoreListe);
			monIteratoreListe.suivant();
		}
	}
	
	public static void main (String[] args){
		testEntier();
		
	}
}
