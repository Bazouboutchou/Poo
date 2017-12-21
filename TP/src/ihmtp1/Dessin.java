package ihmtp1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.TexturePaint;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Dessin extends JPanel {
	public Dessin (){
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    
	    Graphics2D g2 = ((Graphics2D)g);
	    Rectangle2D rec = new Rectangle2D.Double(100, 100, 400, 200);
	    ((Graphics2D)g).draw(rec); 


	   
	    
	    Arc2D arc = new Arc2D.Double(rec, 100, 400, 1);
	   // g2.setPaint(new Color (255, 0, 0));  setPaint car plus riche, rouge 	  
	    //g2.setPaint(new Color (255,0,0, 100)); // transparence
	    //GradientPaint gp = new GradientPaint( 100, 100, Color.red, 500, 300, Color.yellow);
	    //g2.setPaint(gp); dégradé 
	    Image img;
		try {
			
			BufferedImage bfImage = ImageIO.read(new File("texture.png"));
			TexturePaint texture = new TexturePaint(bfImage, rec);
			g2.setPaint(texture);
			g2.fill(arc);
			g2.draw(arc); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   

	    g2.setPaint(new Color (0,0,0)); // setPaint car plus riche 	  
	    g2.drawString("Hello",  (int)rec.getCenterX(), (int)rec.getCenterY()); // reste 
	    
	    g2.setPaint(new Color (0,0,255)); 
	    g2.draw(new Line2D.Double(rec.getX(), rec.getY(), rec.getX()+rec.getWidth(), rec.getY() + rec.getHeight()));
	    
	    g2.setPaint(new Color (0,255,0));
	    
	    Ellipse2D ell = new Ellipse2D.Double(rec.getCenterX()-50, rec.getY()+50, 100, 100);
	    g2.draw(ell);
	    
	    BasicStroke line = new BasicStroke(4.0f);
	    g2.setStroke(line);
	    AffineTransform af = new AffineTransform();
	    af.translate(100, 0);
	    g2.draw(af.createTransformedShape(ell));
	    
	    g2.setPaint(new Color (0,0,0));
	    
	    AffineTransform afRotate = new AffineTransform();
	    afRotate.rotate(Math.toRadians(45),  rec.getX(), rec.getY());
	    g2.draw(afRotate.createTransformedShape(rec));
	    
	    
	    
	}
}
