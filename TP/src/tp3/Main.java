package tp3;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.KeyStore.Entry;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {

	public static void testException(){
		System.out.println("**************Test testException****************");
		Pile pile = new Pile (Integer.class, 2);
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
		System.out.println("**************Test Genericite****************");
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
	
	public static void testAssociative(){
		System.out.println("**************Test Associative****************");
		File f = new File("test.txt");
		Scanner sc;
		try {
			TreeMap <String, Integer> text =  new TreeMap<>();	
			sc = new Scanner (f);
			String mot;
			while (sc.hasNext()){
				mot = sc.next();
				if (!text.containsKey(mot)){
					text.put(mot, 1);
				} else {
					text.replace(mot, text.get(mot) + 1);
				}
			}
			sc.close();
			System.out.println(text.headMap("milieu", false));
			TreeMap <String, Integer> textSortedNumber =  new TreeMap<>();	
			
			for(String key : text.keySet()){
				if (text.get(key) > 3 && text.get(key) < 5){
					textSortedNumber.put(key, text.get(key));
				}
			}
			System.out.println(textSortedNumber);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/* les points sont trié */
	public static void testEnsemble(){
		System.out.println("**************Test Ensemble****************");
		MonHashSet<Point> hs = new MonHashSet<>();
		hs.add(new Point());
		hs.add(new Point(4, 4));
		hs.add(new Point(3, 1));
		hs.add(new Point(1, 3));
		hs.add(new Point(1, 2));
		hs.add(new Point(1, 2));
		hs.add(new Point(5, 9));
		
		System.out.println(hs);
		
		System.out.println(hs.sousEnsembleAleatoire(3));		
	}
	static long chrono = 0 ;

	static void Go_Chrono() {
		chrono = java.lang.System.currentTimeMillis() ;
	}

	
	static void Stop_Chrono() {
		long chrono2 = java.lang.System.currentTimeMillis() ;
		long temps = chrono2 - chrono ;
		System.out.println("Temps ecoule = " + temps + " ms") ;
	} 
	public static void testIterateur(){
		System.out.println("**************Test Iterator****************");
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < 1000000; ++i){
			al.add(i);
		}
		Go_Chrono();
		for (int i = 0; i < 100000; ++i){
			al.add(al.size()/2, i);
		}
		Stop_Chrono();
		LinkedList<Integer> ll = new LinkedList<>();
		for (int i = 0; i < 1000000; ++i){
			ll.add(i);
		}
		Go_Chrono();
		ListIterator<Integer> li = ll.listIterator(500000);
				
		for (int i = 0; i < 100000; ++i){
			li.add(i);
		}
		Stop_Chrono();
		
	}
	public static void main (String[] args){
		//testException();
		testGenericite();
		testAssociative();
		testEnsemble();
		testIterateur();
	}


}
