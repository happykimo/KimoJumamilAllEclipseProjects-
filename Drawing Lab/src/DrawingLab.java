
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DrawingLab extends JPanel  {

	public void paint(Graphics g) {
	
		
		
		//draw head shape
		int red = 255;
		int green = 224;
		int blue = 189;
		Color whiteskin = new Color(red,green,blue);
		g.setColor(whiteskin);
		g.fillRect(300, 150, 200, 125);
		//draw left eye
		g.setColor(Color.white);
		g.fillRect(325, 180, 20,20);
		g.setColor(Color.black);
		g.fillRect(325, 185, 15, 15);
		g.setColor(Color.white);
		g.fillRect(325,185,5,5);
		//draw right eye
		g.setColor(Color.white);
		g.fillRect(455, 180, 20,20);
		g.setColor(Color.black);
		g.fillRect(455, 185, 15, 15);
		g.setColor(Color.white);
		g.fillRect(455,185,5,5);
		//draw mouth
		g.setColor(Color.LIGHT_GRAY);//beard
		int[] xs3 = {325,400,475};
		int[] ys3 = {250,400,250};
		g.fillPolygon(xs3,ys3,3);
		g.setColor(Color.black);
		g.drawLine(350,260 ,450,260);
		//draw hat
		g.setColor(Color.yellow);//trim
		g.drawLine(200,150,600,150);
		g.setColor(Color.blue);//base
		int[] xs = {200,400,600};
		int[] ys= {150,100,150};
		int[] xs2= {325,400,475};//top
		int[] ys2= {150,0,150};
		g.fillPolygon(xs,ys,3);
		g.fillPolygon(xs2,ys2,3);
	
		
	}

	// do not touch
	public DrawingLab() {
		JFrame frame = new JFrame("Wizard");
		frame.setSize(820, 680);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	} // end of MainFrame



} // end of class curly - do not delete
