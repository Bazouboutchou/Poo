package ihmtp1;

import java.util.ArrayList;

import java.util.Stack;

import javax.swing.text.html.Option;


public class Main {
	
	public static void exo1(){
		Fenetre fenetre1 = new Fenetre();
		fenetre1.fenetre1();
		
		Fenetre fenetre2 = new Fenetre();
		fenetre2.fenetre2();

		fenetre1.toFront();
		fenetre1.setResizable(false);
		fenetre1.setVisible(true);
	}
	
	public static void exo2(){
		Fenetre fenetre1 = new Fenetre();
		fenetre1.fenetre1();
		fenetre1.toFront();
		fenetre1.setResizable(false);
		fenetre1.setVisible(true);
		
		fenetre1.add(new Dessin());
	}
	
	public static void main (String[] args){
		//exo1();
		exo2();
	}


}