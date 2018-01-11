package ihmtp3;

import java.awt.BorderLayout;

public class Main{
	
	public static void exo1(){
		Fenetre fenetre = new Fenetre();
		Horloge horloge = new Horloge();
		ZoneSaisie zone = new ZoneSaisie(horloge);
		fenetre.setLayout(new BorderLayout(15, 30));
		fenetre.add(horloge, BorderLayout.CENTER );
		fenetre.add(zone, BorderLayout.SOUTH);


		fenetre.setVisible(true);
	}
	public static void main (String[] args){
		exo1();
	}
}
