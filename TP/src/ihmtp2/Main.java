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
	
	public static void exo5(){
		Fenetre fenetre = new Fenetre();
		fenetre.add(new DessinCarre());		
		fenetre.setVisible(true);
		
	}
	
	public static void exo6() {
		FenetrePrincipal f = new FenetrePrincipal();
	}
	public static void main (String[] args){
		//exo1_2();
		//exo3();
		//exo4();
		exo5();
		//exo6();
		
	}


}
