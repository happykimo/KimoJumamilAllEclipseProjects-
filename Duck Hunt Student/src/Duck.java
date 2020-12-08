import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Duck implements MouseListener{
	private int x = 450,y = 525;
	private int vx=(int)(Math.random()*(11)-5), vy= (int)(Math.random()*(9)-8);
	private Image img; // image of the frog
	private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);
	public boolean dead = false;
	public boolean miss;
	public Duck() {
		img = getImage("Zombie1.png"); //load the image for Tree
		init(x, y); 				//initialize the location of the image
	}
	
	public void paint(Graphics g) {
		
		//these are the 2 lines of code needed draw an image on the screen
		Graphics2D g2 = (Graphics2D) g;
		/*get the bird to move randomly up from the bottom of the screen
		 * it should bounce off the sides of the frame.
		 */
		y--;
		y+=vy;
		x+=vx;
		int bounce = 3;
		g.drawRect(x, y, 50, 70);
	
		if(y<=50) {
			vy= (int)(Math.random()*(9));
			bounce--;
		}
		else if(y>=500) {
			vy= (int)(Math.random()*(9)-8);
			bounce--;
		}
		else if(x<=50) {
			vx= (int)(Math.random()*(6));
			bounce--;
		}
		else if (x>=750) {
			vx= (int)(Math.random()*(6)-5);
			bounce--;
		}
		else if (bounce<=0) {
			x=450;
			y=525;
			bounce =3; 
		}
		
		g2.drawImage(img, tx, null);   
		tx.setToTranslation(x,y);
		
		
	}
	
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(1, 1);
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Duck.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}
	
	public boolean collided(int mX ,int mY){
		System.out.println(mX+":"+mY);

		// represent the duck as a Rectangle object
		Rectangle a = new Rectangle(x,y, 100, 100);
		//check if mouse x,y is in the rectangle
		if(a.contains(mX,mY)) {
			System.out.println("ouch");
			//what happens to the duck?
			x=450;
			y=525;
			vx=(int)(Math.random()*(11)-5);
			vy= (int)(Math.random()*(9)-8);
			miss=false;
			dead=true;
			return dead;
		}
		else {
			miss=true;
			dead=false;
			return dead;
		
		}
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ouch");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
