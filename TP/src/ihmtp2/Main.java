package ihmtp2;

public class Main {
	
	public static void exo1_2(){
		
		Fenetre fenetre = new Fenetre();
		fenetre.add(new Panneau());
		
		fenetre.setVisible(true);
		
	}
	
	public static void exo3(){
		Fenetre fenetre = new Fenetre();
		fenetre.add(new DessinMouvementSouris());		
		fenetre.setVisible(true);
		
	}
	
	public static void exo4(){
		Fenetre fenetre = new Fenetre();
		fenetre.add(new DessinClavier());		
		fenetre.setVisible(true);
		
	}
	
	public static void main (String[] args){
		//exo1_2();
		//exo3();
		exo4();
	}


}
