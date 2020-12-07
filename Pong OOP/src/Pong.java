import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Pong extends JPanel implements ActionListener, KeyListener{
	
	//attributes for a Pong frame
	Paddle left = new Paddle(100,20,50,325);
	Paddle right = new Paddle(100,20,700,325);
	Paddle top = new Paddle(20,100,325,50);
	Paddle bottom = new Paddle(20,100,325,700);

	Ball B1 = new Ball(375,375,10,10);
	
	Score leftScore = new Score();
	int leftLifes = leftScore.getPoints();
	Score rightScore = new Score();
	int rightLifes = rightScore.getPoints();
	Score topScore = new Score();
	int topLifes = topScore.getPoints();
	Score bottomScore = new Score();
	int bottomLifes = bottomScore.getPoints();
	
	//font for score
	Font verdana = new Font("Verdana", Font.BOLD,20);

	public void paint(Graphics g) {
		super.paintComponent(g); //ignore
		
		g.setColor(Color.cyan);
		left.paint(g);
		g.setColor(Color.red);
		right.paint(g);
		g.setColor(Color.yellow);
		top.paint(g);
		g.setColor(Color.green);
		bottom.paint(g);
		
		
		
		g.setColor(Color.black);
		B1.paint(g);
		
		 g.setFont(verdana);//set the font
		   //drawing text on the screen + using variables
		   g.drawString(""+leftLifes, left.getX(), left.getY()+50);		   
		   g.drawString(""+rightLifes, right.getX(),right.getY()+50);	
		   g.drawString(""+topLifes, top.getX()+50,top.getY()+20);
		   g.drawString(""+bottomLifes, bottom.getX()+50,bottom.getY()+20);

	}
	
	
	/* update variables */
	/*
	 * update ball x and y here
	 * update all other variables as necessary
	 */
	public void update() {
		//ask the ball to check for collision;
		B1.collideL(left);
		B1.collideR(right);
		B1.collideT(top);
		B1.collideB(bottom);
		
		//scores get updated
		
		//barrier
		right.barrier(right);
		left.barrier(left);
		top.barrier(top);
		bottom.barrier(bottom);
		
	
	}
	
	
	public static void main(String[] arg) {
		Pong p = new Pong();
	}
	
	
	Timer t = new Timer(16,this);
	//setup frame 
	JFrame f;
	public Pong() {
		//800x600 frame
		int width = 800;
		int height = 800;
		
		//setup frame
		f = new JFrame("P-OOP");
		f.setSize(width,height);		
		t.start();
		f.addKeyListener(this);
		f.add(this);
	
		//make frame visible
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		update();
	}


	@Override
	public void keyPressed(KeyEvent arg0) {
		System.out.println(arg0.getKeyCode());
		switch(arg0.getKeyCode()) {
		case 87:
			/* move the paddle up*/
			left.up();
			break;
		case 83:
			/*move the paddle down*/
			left.down();
			break;
		case 38:
			right.up();
			break;
		case 40:
			right.down();
			break;
		case 53:
			top.left();//"5" key
			break;
		case 55:
			top.right();//"7" key
			break;
		case 78:
			bottom.left();//"n" key
			break;
		case 44:
			bottom.right();//"," key
			break;
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		left.stop();
		right.stop();
		top.stop();
		bottom.stop();
	
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
