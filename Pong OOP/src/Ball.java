import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball {
	private int x,y;
	private int vx, vy;
	private int height, width;
	
	public Ball(int x1, int y1, int h1, int w1) {
		x=x1;
		y=y1;
		height = h1;
		width = w1;	
		//(int)(Math.random()*(range+1)+min);
		vx = (int)(Math.random()*(9)-4);
		vy = (int)(Math.random()*(9)-4);
		
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
	
	
	public void paint(Graphics g) {
		g.fillOval(x, y, width, height);
		x+=vx;//update the position here because it gets re-drawn
		y+=vy;
		
		if(y<0||y>=800) {
		x =375;
		y = 375;
		vx = (int)(Math.random()*(9)-4);
		vy = (int)(Math.random()*(9)-4);
		for(;vx==0 && vy==0;) {
			vx = (int)(Math.random()*(9)-4);//random velocity reset that doesn't go to 0
			vy = (int)(Math.random()*(9)-4);
		}
		}
		else if(x<0||x>=800) {
			x =375;
			y = 375;
			vx = (int)(Math.random()*(9)-4);
			vy = (int)(Math.random()*(9)-4);
			for(;vx==0 && vy==0;) {
				vx = (int)(Math.random()*(9)-4);
				vy = (int)(Math.random()*(9)-4);
				}
			}
		}
		public boolean collideL(Paddle thePaddle) {
			//represent both objects as rectangles
			//use the intersect command to check for collision
			Rectangle r1 = new Rectangle(x,y,width,width);//ball
			
			//r2 will be the paddle
			Rectangle r2 = new Rectangle(
					thePaddle.getX(),
					thePaddle.getY(),
					thePaddle.getWidth(),
					thePaddle.getHeight()
					);
			if(r1.intersects(r2)) {
				vx*=-1;//reverse velocity x
				vx+=1;
				vy+=(int)(Math.random()*(2)-1);//randomizes vy in case vy was previously 0 and the ball never reaches other players 
			}
			return r1.intersects(r2);
		}
			
		public boolean collideR(Paddle thePaddle){
				//represent both objects as rectangles
				//use the intersect command to check for collision
				Rectangle r1 = new Rectangle(x,y,width,width);//ball
				
				//r2 will be the paddle
				Rectangle r2 = new Rectangle(
						thePaddle.getX(),
						thePaddle.getY(),
						thePaddle.getWidth(),
						thePaddle.getHeight()
						);
				if(r1.intersects(r2)) {
					vx*=-1;//reverse velocity x
					vx-=1;
					vy+=(int)(Math.random()*(3)-1);
				}
				return r1.intersects(r2);
		}
		
		public boolean collideT(Paddle thePaddle){
			//represent both objects as rectangles
			//use the intersect command to check for collision
			Rectangle r1 = new Rectangle(x,y,width,width);//ball
			
			//r2 will be the paddle
			Rectangle r2 = new Rectangle(
					thePaddle.getX(),
					thePaddle.getY(),
					thePaddle.getWidth(),
					thePaddle.getHeight()
					);
			if(r1.intersects(r2)) {
				vy*=-1;//reverse velocity x
				vy+=1;
				vx+=(int)(Math.random()*(3)-1);
			}
			return r1.intersects(r2);
		}
		public boolean collideB(Paddle thePaddle){
			//represent both objects as rectangles
			//use the intersect command to check for collision
			Rectangle r1 = new Rectangle(x,y,width,width);//ball
			
			//r2 will be the paddle
			Rectangle r2 = new Rectangle(
					thePaddle.getX(),
					thePaddle.getY(),
					thePaddle.getWidth(),
					thePaddle.getHeight()
					);
			if(r1.intersects(r2)) {
				vy*=-1;//reverse velocity x
				vy+=1;
				vx+=(int)(Math.random()*(3)-1);
			}
			return r1.intersects(r2);
		
		
		
	}
	

}
