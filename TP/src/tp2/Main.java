package tp2;

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
	
	public static void main(String[] args) {
		testPoint();
		testTransformations ();
		testSegment ();
		testCercle();
		testImage();
	}

}
