package ihmtp1;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class FonteImage extends JPanel {
	
	public FonteImage () {};
	
	@Override
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    
	    Graphics2D g2 = ((Graphics2D)g);
	    
	    int x = 10;
	    int y = 10;
	    String chaine1 = "chaine1";
		String chaine2 = "chaine 2 allignee avec chaine 1";
		String chaine3 = "chaine 3 en dessous de chaine 1";
		
		FontMetrics fm = g2.getFontMetrics();		
		int espace = fm.stringWidth(chaine1);
	    int taille = fm.getHeight();
		g2.drawString(chaine1, x, y);
	    g2.drawString(chaine2, espace + x, y);
	    g2.drawString(chaine3, x, taille + y);
	    
	    try {
			BufferedImage img = ImageIO.read(new File("unity.png"));
			Image dimg = img.getScaledInstance(getWidth()/4, getHeight()/4,
			        Image.SCALE_SMOOTH);
			g2.drawImage(dimg, getWidth()/4, getHeight()/4, null);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
