import java.awt.Graphics;

public class Paddle {
	private int height;
	private int width;
	private int x,y;
	
	private int vy=0, vx;
	
	public Paddle(int paramHeight, int paramWidth,int paramX, int paramY) {
		x = paramX;
		y = paramY;
		height = paramHeight;
		width = paramWidth;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public void setX(int newX) {
		x = newX;
	}
	public void setY(int newY) {
		y = newY;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public void up() {
		vy=-10;
	}
	public void down() {
		vy=10;
	}
	public void left() {
		vx= -10;
	}
	public void right() {
		vx=10;
	}
	public void stop() {
		vx=0;
		vy=0;
	}
	public void barrier(Paddle p) {
		if(p.getX() == 50 && p.getY()==50) {
			vx=0;
			vy=0;
		}
		else if(p.getX()== 750 && p.getY()==50) {
			vx=0;
			vy=0;
		}
		else if(p.getX()== 50 && p.getY()==750) {
			vx=0;
			vy=0;
		}
		else if(p.getX()== 750 && p.getY()==750) {
			vx=0;
			vy=0;
		}


		}
	public void paint(Graphics g) {
		g.fillRect(x, y, width, height);
		y+=vy;//updates position in y-axis
		x+=vx;//updates position in x-axis
	}
	
}

