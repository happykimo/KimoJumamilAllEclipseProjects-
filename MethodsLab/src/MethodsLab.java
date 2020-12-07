
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MethodsLab extends JPanel  {

	public void paint(Graphics g) {
		{
			// DRAW CUBE
g.drawRect(100, 100, 100, 100);
g.drawLine(75, 75, 100, 100);
g.drawLine(175,75,200,100);
g.drawRect(75, 75, 100, 100);
g.drawLine(200, 200, 175, 175);
g.drawLine(100, 200, 75, 175);




			// DRAW SPHERE
g.drawOval(400,50,200,200);
g.drawOval(400,75,200,150);
g.drawOval(400, 100, 200, 100);
g.drawOval(400, 125, 200, 50);
g.drawOval(425,50,150,200);
g.drawOval(450, 50, 100, 200);
g.drawOval(475, 50, 50, 200);



			// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
g.drawOval(400, 400, 200, 200);
g.drawLine(400,500, 600, 500);
g.drawLine(400,500,500,600);
g.drawLine(500, 600, 600, 500);
g.drawOval(459,500,82,82);//draw inner circle



			// DRAW APCS
g.fillRect(50, 400, 30,10);//A
g.fillRect(50, 400, 10, 60);
g.fillRect(80, 400, 10, 60);
g.fillRect(50, 420, 30,10);

g.fillRect(100,400,10,60);//P
g.fillRect(130,400,10,30);
g.fillRect(100,400, 30,10);
g.fillRect(100,430,40,10);

g.fillRect(150,400,40,10);//C
g.fillRect(150, 400,10,50);
g.fillRect(150,450,40,10);

g.fillRect(210,400,40, 10);//S
g.fillRect(210, 400, 10, 30);
g.fillRect(240,430,10,30);
g.fillRect(210,430, 40, 10);
g.fillRect(210,450, 40, 10);


			// DRAW PACMEN FLOWER
g.fillOval(50, 500, 30, 30);//circles
g.fillOval(50, 540, 30, 30);
g.fillOval(30,520 , 30, 30);
g.fillOval(70,520,30,30);
g.setColor(Color.white);

		}

	}

		
		


	// do not touch
	public MethodsLab() {
		JFrame frame = new JFrame("MethodsLab");
		frame.setSize(820, 680);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	} // end of MainFrame



} // end of class curly - do not delete
