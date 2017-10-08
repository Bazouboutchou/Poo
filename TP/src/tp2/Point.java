package tp2;

public class Point implements Cloneable{
	private int x;
	private int y;
	
	public Point (){
		this.x = 0;
		this.y = 0;
	}
	
	public Point (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Point additionner (Point point){
		int x = this.x + point.getX();
		int y = this.y + point.getY();
		return new Point (x, y);
	}
	
	@Override
	public String toString() {
		String str = "(" + this.x + " ;" + this.y + ")"; 
		return str;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override	
	public Object clone() throws CloneNotSupportedException {   
		Point copie = (Point)super.clone();
		copie.setX(this.x);
		copie.setY(this.y);
		
		return copie;
	}
}
