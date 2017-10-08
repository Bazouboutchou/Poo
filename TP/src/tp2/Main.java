package tp2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void testPoint (){
		System.out.println("**********Test point************");
		Point point = new Point ();
		System.out.println(point);
		
		System.out.println(point.additionner(new Point (5, 6)));
	}
	
	public static void testTransformations(){
		System.out.println("**********Test Transformation************");
		PileTransformation transfo = new PileTransformation(3);
		Point point = new Point (1, 2);
		transfo.empiler(point);
		transfo.empiler(point);
		transfo.empiler(point);
		transfo.empiler(point);
		
		System.out.println(transfo);
		transfo.depiler();
		System.out.println(transfo);
	}
	
	
	public static void testSegment(){
		System.out.println("******Test Segment**********");
		Segment seg = new Segment (new Point (1, 2), new Point(3, 2));
		PileTransformation transfo = new PileTransformation(3);
		Point point = new Point (1, 2);
		transfo.empiler(point);
		seg.dessiner(transfo);
		seg.deplacer(new Point (1, 1));
		System.out.println(seg);
	}
	public static void testCercle(){
		System.out.println("******Test Cercle**********");
		Cercle cer = new Cercle (new Point(3, 2), 1);
		PileTransformation transfo = new PileTransformation(3);
		Point point = new Point (1, 2);
		transfo.empiler(point);
		cer.dessiner(transfo);
		cer.deplacer(new Point (1, 1));
		System.out.println(cer);
	}
	
	public static void testImage(){
		System.out.println("******Test Image**********");
		Cercle cer = new Cercle (new Point(3, 2), 1);
		PileTransformation transfo = new PileTransformation(3);
		Point point = new Point (1, 2);
		transfo.empiler(point);
		Segment seg = new Segment (new Point(3, 2), new Point(2, 2));
		Image image = new Image(3, new Point ());
		image.ajouter(seg);
		image.ajouter(cer);
		System.out.println(image);
		
		image.deplacer(new Point (1, 1));
		image.dessiner(transfo);
	}

	
	/* On constate que dans un 1er temps nous effectuons des transformations 
	 * sur le cercle puis le segment séparement, puis en effectuant un déplacement 
	 * sur l'image ce déplacement sera appliquer également au segment et au cercle 
	 * appartenant à l'image (polymorphisme)
	 */
	public static void testQuestion5(){
		System.out.println("********* Test Question 5 **************");
		Point point = new Point (1,1);
		Segment seg = new Segment (new Point (1,1), new Point (2,2));
		Cercle cer = new Cercle (new Point (1,1), 5);
		PileTransformation pile = new PileTransformation(5);
		
		pile.empiler(point);
		
		seg.dessiner(pile);
		cer.dessiner(pile);
		
		seg.deplacer(new Point (1,1));
		cer.deplacer(new Point (1,1));
		
		Image img = new Image(10);
		
		img.ajouter(seg);
		img.ajouter(cer);
		
		img.dessiner(pile);
		
		img.deplacer(new Point(1,1));
		
		img.dessiner(pile);
		
		pile.depiler();
	}
	
	/* On constate ici que lorsque l'on effectue une transformation sur une 
	 * image, la transformation sera appliqué à tout les éléments de l'image 
	 * donc ici d'autre image, puis aux elements de ces images 
	 */
	public static void testQuestion6(){
		System.out.println("********* Test Question 6 **************");
		Point point = new Point (1,1);
		Segment seg1 = new Segment (new Point (1,1), new Point (2,2));
		Cercle cer1 = new Cercle (new Point (1,1), 5);
		Segment seg2 = new Segment (new Point (2,2), new Point (2,2));
		Cercle cer2 = new Cercle (new Point (2,2), 5);
		Image img1 = new Image(10, new Point (1,1));
		Image img2 = new Image(8, new Point (2,2));
		Image img3 = new Image(6, new Point (3,3));
		PileTransformation pile = new PileTransformation(5);
		
		pile.empiler(point);
		
		img1.ajouter(seg1);
		img1.ajouter(cer1);
		
		img2.ajouter(seg2);
		img2.ajouter(cer2);
		
		img1.dessiner(pile);
		img2.dessiner(pile);
		
		img1.deplacer(new Point(1,2));
		
		img3.ajouter(img1);
		img3.ajouter(img2);
		
		img3.dessiner(pile);
		
		pile.depiler();
	}
	
	public static void testStructure(){
		System.out.println("********* Test Structure **************");
		Structure structures[] = new Structure [2];
		structures[0] = new Entier(10);
		structures[1] = new Liste ();
		
		for (int i = 0; i < 10; ++i){
			structures[0].inserer(i);
			structures[1].inserer(i);
		}
		System.out.println(structures[0]);
		System.out.println(structures[1]);
		for (int i = 0; i < 10; ++i){
			structures[0].supprimer(i);
			structures[1].supprimer(i);
		}
		System.out.println(structures[0]);
		System.out.println(structures[1]);
	}
	
	/* La liaison dynamique et le polymorphisme marche tres bien meme 
	 * avec des classe tres diferentes
	 */
	public static void testAffichable(){
		System.out.println("********* Test Affichable **************");
		Affichable affichable[] = new Affichable [2];
		Structure stru = new Entier (10);
		for (int i = 0; i < 10; ++i){
			stru.inserer(i);
		}
		
		Forme forme = new Cercle(new Point(1,1), 5);		
		affichable[0] = stru;
		affichable[1] = forme;
		
		for (Affichable a : affichable) {
			a.afficher();
		}
	}
	
	public static void testCompactable(){
		System.out.println("********** Test Compactable *********");
		Compactable compact[] = new Compactable [3];
		Entier entier = new Entier(10);
		Liste liste = new Liste();
		Image image = new Image (2);
		for (int i = 0; i < 10; ++i){
			entier.inserer(i);
			liste.inserer(i);
		}
		image.ajouter(new Segment (new Point (1,1), new Point (2,2)));
		image.ajouter(new Cercle (new Point (1,1), 5));
		
		compact[0] = entier;
		compact[1] = liste;
		compact[2] = image;
		System.out.println("Avant : " + compact[0]);
		System.out.println("Avant : " + compact[1]);
		System.out.println("Avant : " + compact[2]);
		
		for (Compactable compactable : compact) {
			compactable.compacter(2);
		}
		
		System.out.println("Apres : " + compact[0]);
		System.out.println("Apres : " + compact[1]);
		System.out.println("Apres : " + compact[2]);

	}
	
	public static void testComparable(){
		System.out.println("********** Test Comparable *********");
		Image images [] = new Image [4];
		images[0] = new Image<>(15);
		images[1] = new Image<>(19);
		images[2] = new Image<>(1);
		images[3] = new Image<>(20);	
		
		images[0].ajouter(new Segment(new Point(), new Point()));
		images[0].ajouter(new Segment(new Point(), new Point()));
		
		images[1].ajouter(new Segment(new Point(), new Point()));
		images[1].ajouter(new Segment(new Point(), new Point()));
		images[1].ajouter(new Segment(new Point(), new Point()));
		images[1].ajouter(new Segment(new Point(), new Point()));
		
		images[2].ajouter(new Segment(new Point(), new Point()));
		
		images[3].ajouter(new Segment(new Point(), new Point()));
		images[3].ajouter(new Segment(new Point(), new Point()));
		images[3].ajouter(new Segment(new Point(), new Point()));
		System.out.println("Avant : ");

		for (Image image : images) {
			System.out.println(image);
		}
		Arrays.sort(images);
		
		System.out.println("Apres : ");
		for (Image image : images) {
			System.out.println(image);
		}
	}
	
	public static void testComparator(){
		System.out.println("********** Test Comparator *********");
		ArrayList <Image> images = new ArrayList<>();
		images.add(new Image<>(15, new Point(10, 10)));
		images.add(new Image<>(19, new Point(11, 11)));
		images.add(new Image<>(1, new Point(5, 5)));
		
		Image maximum = Collections.max(images, new Image(1));
		System.out.println(maximum);
	}
	
	public static void testCloneable(){
		System.out.println("*********Test Cloneable***********");
		
		Liste liste = new Liste();
		Segment seg = new Segment(new Point (1,1), new Point(2,2));
		for (int i = 0; i < 10; ++i){
			liste.inserer(i);
		}
		
		try {
			Liste liste2 = (Liste) liste.clone();
			System.out.println("Liste normal : " + liste);
			System.out.println("Liste clone : " + liste2);
			
			Segment seg2 = (Segment) seg.clone();
			System.out.println("Segment normal : " + seg);
			System.out.println("Segment clone : " + seg2);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		testPoint();
		testTransformations ();
		testSegment ();
		testCercle();
		testImage();
		testQuestion5();
		testQuestion6();
		testStructure ();
		testAffichable();
		testCompactable();
		testComparable();
		testComparator();
		testCloneable();
	}

}
