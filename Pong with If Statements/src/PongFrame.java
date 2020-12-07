import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongFrame extends JPanel implements ActionListener, KeyListener{

	//practice declarations and assignments
	int bx = 260;
	int by = 150;
	int bw = 20;
	int bh = 20;
	
	//ball velocity
	int bvx = 3;
	int bvy = 3;			
	
	//score variables
	int p1Score = 0;
	int p2Score = 0;
	
	// declare and assign new variables
	// to represent the two paddles you will
	// see on the screen
	// please use descriptive short names
	int	p1x = 50, p1y = 0, pw = 20, ph = 100; 	//paddle 1 and the width/height
	int	p2x = 500, p2y = 0; 	//paddle 2 and the width/height
										//i can reuse pw and ph 
	
	//font for score
	Font verdana = new Font("Verdana", Font.BOLD,40);
	
	//paddle velocities
	int	p1v = 0;
	int p2v = 0;
	//pause start variable
	boolean runGame = false;
	
	//paint is called 60x per second
	
	public void paint(Graphics g) {
		   super.paintComponent(g); //do not remove
		   
		   g.setFont(verdana);//set the font
		   //drawing text on the screen + using variables
		   g.drawString(""+p1Score, 150,30);		   
		   g.drawString(""+p2Score, 400,30);	
		   
		   //(EXPERIMENT)Determining a winner
		   if (p1Score == 7 && p1Score >= p2Score+2) {
			   g.setFont(verdana);
			   g.drawString("Player 1 Wins!", 100, 150);
			   p1Score= 0;
			   p2Score=0;
		   }
		   if (p2Score == 7 && p2Score >= p1Score+2) {
			   g.setFont(verdana);
			   g.drawString("Player 2 Wins!", 100, 150);
			   p1Score=0;
			   p2Score=0;
		   }
		   
		   //add code below
		   g.fillOval(bx, by, bw, bh);
		   	g.setColor(Color.black); //EXPERIMENT
		   //position in the x changes based on velocity in the x
		   bx = bx + bvx;
		   by = by + bvy;		   
		   
		   g.setColor(Color.blue);//EXPERIMENT
		   g.fillRect( p1x, p1y, pw, ph);
			  
		   g.setColor(Color.red);//EXPERIMENT
		   g.fillRect( p2x, p2y, pw, ph);
		   	
		   
		   	p1y += p1v;// velocities change the position
		   	p2y += p2v;
		   
		   //to do
		   // add additional if statements and conditions
		   // to detect the top, left, bottom borders
		   if(by < 0) {//top
			   bvy*= -1;   
		   }
		   if (bx > 555 ) {//right
			   bvy ++;//increase velocity of the ball as the game goes on
			   bvx ++;
			   bvx *= -1;
		   }
		   if (by > 340) {//bottom
			   bvy ++;
			   bvx ++;
			   bvy *= -1;
		   }
		   if (bx < 0) {//left
			   bvx *= -1;
		   }
		   
		   //EXPERIMENT (STOP PADDLES FROM GOING OFF SCREEN)
		   if (p1y <=0) {
			   p1v = 0;
			   p1y = 0;
		   }
		   if(p1y >= 261) {
			   p1v = 0;	
			   p1y = 261;
		   }
		   if (p2y <=0) {
			   p2v = 0;
			   p2y=0;
		   }
		   if (p2y >= 261) {
			   p2v = 0;
			   p2y=261;
		   }
		   // Score Detection IF statements
		   if (bx >= 555) {
			 int angle = (int)(Math.random()*7) +-3;			
			  p1Score ++;
			  bx = 260;
			  by = 150;	
			  bvx = -3 ; // reset velocity of ball so that the ball doesn't shoot at after being scored
			  bvy = angle;
		   }
		   if (bx <= 0) {
			 int angle = (int)(Math.random()*7)+-3;
			   p2Score ++;
			   bx = 260;
			   by = 150;
			   bvx = 3;
			   bvy = angle;
		   }
		   //Paddle Collisions (if velocity is too high the ball goes through)
		   if (bx+10 >=p1x && bx+10 <= p1x+pw) {//left player
			   if(by+10 >= p1y && by+10 <= p1y+ ph) {
				 
			   bvx -= 1;
			   bvx *= -1;
			   
		   }
		   }
	
		   
		   if (bx+10 >= p2x && bx+10 <= p2x+pw) {
			   if(by+10 >= p2y && by+10 <= p2y+ ph) {
				   
			   bvx++;
			   bvx *= -1;
			   
		   }
		   }
		 
		   
		   //add code above - enter new lines when needed
	} //end of paint curly do not delete
	
	//do not touch
	public PongFrame(){
		JFrame frame = new JFrame("Pong");
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		
		//setup frame to listen to keyboard presses
		frame.addKeyListener(this);
		
		Timer t = new Timer(16, this);
		t.start();
		
		frame.setVisible(true);
	}//end of MainFrame




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	} //end of actionPerformed curly do not delete

	@Override
	public void keyPressed(KeyEvent e) {
		// print out the keyCode for the current key
		// being pressed
		
		System.out.println("keyPressed!"+e.getKeyCode());
		
		
		
		//detect w key which is 87
		if (e.getKeyCode() == 87 ) {
			p1v -= 8;//left paddle goes up
		}
		if (e.getKeyCode() == 83) {
			p1v += 8;//left paddle goes down
		}
		if (e.getKeyCode() == 38) {
			p2v -= 8;//right paddle goes up
		}
		if(e.getKeyCode() == 40) {
			p2v += 8;//right paddle goes down
		}
// up arrow 38 down 40
		
		//try to control 
		
				
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == 87 ) {
			p1v = 0;//left paddle stops
		}
		if (e.getKeyCode() == 83) {
			p1v = 0;//left paddle stops
		}
		if (e.getKeyCode() == 38) {
			p2v = 0;//right paddle stops
		}
		if(e.getKeyCode() == 40) {
			p2v = 0;//right paddle stops
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

} //end of class curly - do not delete
