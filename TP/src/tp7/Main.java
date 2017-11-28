package tp7;

import java.util.ArrayList;
import java.util.Stack;

import tp6.Entier.EntIterator;

public class Main {
	
	public static void commande (){
		Entier ent = new Entier (2);
		ent.setcDeb(new CommandeTrace());
		ent.setcFin(new CommandePile(new Stack<String>()));
		ent.inserer(1);
		ent.inserer(2);
		
		ent.supprimer(2);
		
		System.out.println((CommandePile) ent.getcFin());
		
	}
	
	public static void adaptateur (){
		Adaptateur<Integer> adap = new Adaptateur<Integer>(new ArrayList<>());
		adap.push(1);
		adap.push(2);
		adap.push(3);
		adap.push(4);
		
		System.out.println(adap);
		
		System.out.println(adap.peek());
		System.out.println(adap.pop());
		
		System.out.println(adap);
	}
	
	public static void singleton (){
		SingletonEntier singleton = SingletonEntier.getInstance(2);
		singleton.inserer(1);
		singleton.inserer(2);
		System.out.println(singleton);
	}
	public static void main (String[] args){
		commande();
		adaptateur();
		singleton();
	}
}
