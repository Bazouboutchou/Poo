package tp2;

import java.util.Arrays;
import java.util.Comparator;

public class Image<T> extends Forme implements Compactable, Comparable<T>, Comparator<T>{

	private Forme []formes;
	private int taille;
	private int nbFormes;
	//private Point originePoint;
	
	
	public Image(int taille) {
		super(new Point());
		this.taille = taille;
		this.nbFormes = 0;
		this.formes = new Forme[this.taille];
		//this.originePoint = new Point();
	}

	public Image(int taille, Point originePoint) {
		super(originePoint);
		this.taille = taille;
		this.nbFormes = 0;
		//this.originePoint = originePoint;
		this.formes = new Forme[this.taille];
	}
	
	public void ajouter (Forme forme){
		if (this.nbFormes < this.taille){
			this.formes[this.nbFormes] = forme;
			++this.nbFormes;
		} else{
			System.out.println("Impossible d'ajouter une forme");
		}
	}
	
	@Override
	public void dessiner(PileTransformation pile) {
		System.out.println("Image " + super.getOriginePoint().additionner(pile.getTransfoCourante()));
		for (Forme f : this.formes){
			if (f != null)
				f.dessiner(pile);			
		}
	}

	@Override
	public void deplacerSpecifique(Point point) {
		for (Forme f : this.formes){
			if (f != null)
				f.deplacer(point);					
		}
	}

	@Override
	public String toString() {
		return "Image [formes=" + Arrays.toString(this.formes) + ", originePoint=" + super.getOriginePoint() + "nbForme =" +this.nbFormes +"]";
	}

	@Override
	public void afficher() {
		System.out.println("Image [formes=" + Arrays.toString(this.formes) + ", originePoint=" + super.getOriginePoint() + "]");	
	}

	@Override
	public void compacter(int nbElement) {

		if (this.nbFormes > nbElement){
			for(int i = this.nbFormes; i >= this.nbFormes - nbElement; --i){
				this.formes[i] = null;
			}
			this.nbFormes = this.nbFormes - nbElement;
			
		}
		else{
			for(int i = 0; i < this.nbFormes; ++i){
				this.formes[i] = null;
			}
			this.nbFormes = 0; 			
		}
	}

	@Override
	public int compareTo(T o) {
		Image<?> image = (Image<?>) o;
		if (image.nbFormes == this.nbFormes) return 0;
		else if (this.nbFormes >image .nbFormes) return 1;
		else return -1;
	}

	@Override
	public int compare(T o1, T o2) {
		Image img1 = (Image) o1;
		Image img2 = (Image) o2;
		
		if (img1.getOriginePoint().getY() > img2.getOriginePoint().getY()) return 1;
		else if (img1.getOriginePoint().getY() == img2.getOriginePoint().getY()) return 0;
		else return -1;
	}
	
	
}
