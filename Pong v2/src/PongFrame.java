import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PongFrame extends JPanel implements ActionListener{

	//practice declarations and assignments
	int ballx = 280; //declare and assign
	int bally = 165;
	int ballWidth = 20;
	int ballHeight = 20;
	
	//velocity varriable
	int velx = 3;
	int vely = 3;
	
	//player 1
	int player1x = 50, player1y = 100,player1Width = 20,player1Height = 150;
	//player 2
	int player2x = 500, player2y = 100,player2Width = 20, player2Height = 150;
	
	/*declare and assign variables for a left paddle 
	 * and a right paddle
	 */
	
	/*
	 * paint method runs roughly 60x per second
	 */
	public void paint(Graphics g) {
		
		   super.paintComponent(g); //do not remove
		   
		   //add code below
		   ballx = ballx + velx; //changes in velocity of the ball
		   bally = bally + vely;
		   
		   ballx++; //++is increment operator
		   bally++; // y-axis is inverted
		   
		   g.setColor(Color.blue);
		   g.fillOval(ballx,bally,ballWidth,ballHeight); //x,y,width,height
		   
		   //drawing rectangles
		   g.fillRect(player1x,player1y,player1Width,player1Height); //x,y,width,hight
		   g.fillRect(player2x,player2y,player2Width,player2Height);
		   
		   //add code above - enter new lines when needed
		   
	} //end of paint curly do not delete

	


	
	
	
	
	
	
	//do not touch
	public PongFrame(){
		JFrame frame = new JFrame("Pong");
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);

		Timer t = new Timer(16, this);
		t.start();
		frame.setVisible(true);
	}//end of MainFrame




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	} //end of actionPerformed curly do not delete

} //end of class curly - do not delete
