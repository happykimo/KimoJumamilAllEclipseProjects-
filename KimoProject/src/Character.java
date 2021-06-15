import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;
import java.util.*;

public class Character {
	boolean turn;
	private Image img;
	private int x;
	private int y;
	private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);

public Character() {

}
private Image getImage(String path) {//from duck hunt
	Image tempImage = null;
	try {
		URL imageURL = Player.class.getResource(path);
		tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return tempImage;
}
public void paint(Graphics g) {
	
	//these are the 2 lines of code needed draw an image on the screen
	Graphics2D g2 = (Graphics2D) g;
	
	tx.setToTranslation(x,y);
	g2.drawImage(img, tx, null);   
	
	
}
}






