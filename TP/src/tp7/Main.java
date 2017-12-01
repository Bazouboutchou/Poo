package tp7;

import java.util.ArrayList;

import java.util.Stack;

import javax.swing.text.html.Option;


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
		System.out.println();
	}
	
	private static void observater() {
		Point point = new Point();
		Forme forme = new Cercle (new Point(), 1);
		point.addObserver(forme);
		
		System.out.println("Point : " + point);
		System.out.println("Forme : " + forme);
		
		point.setX(1);
		
		System.out.println("Point : " + point);
		System.out.println("Forme : " + forme);
		
		point.setY(1);
		
		System.out.println("Point : " + point);
		System.out.println("Forme : " + forme);
		
	}
	
	private static void decorateur() {
		System.out.println("*************Decorateur****************");
		Voiture voiture = new Voiture ("Toyota", 5);
		System.out.println(voiture);
		
		DecorateurVoiture decorateur1 = new Option1(voiture);
		System.out.println(decorateur1);
		
		DecorateurVoiture decorateur2 = new Option1(new Option2(voiture));
		System.out.println(decorateur2);
		
	}
	
	public static void main (String[] args){
		commande();
		adaptateur();
		singleton();
		observater();
		decorateur();
	}


}
