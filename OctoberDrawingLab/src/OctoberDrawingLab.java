
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class OctoberDrawingLab extends JPanel  {

	public void paint(Graphics g) {
		{
		g.setColor(Color.red);
		g.drawLine(500, 0, 500,500);//divider
		g.drawLine(0,250,1000,250);
		
		int counter = 1;
		int TLx1 =0;//variables of lines
		int TLy1 =0;
		int TLx2 =1000;
		int TLy2 =0;
		int TRx1=1000;
		int TRy1=0;
		int TRx2=0;
		int TRy2=0;
		int BLx1=0;
		int BLy1=500;
		int BLx2=1000;
		int BLy2=500;
		int BRx1=1000;
		int BRy1=500;
		int BRx2=0;
		int BRy2=500;
		while (counter<=100) {
			g.setColor(Color.black);	
			g.drawLine(TLx1, TLy1, TLx2, TLy2);
			g.drawLine(TRx1, TRy1, TRx2, TRy2);
			g.drawLine(BLx1, BLy1, BLx2, BLy2);	
			g.drawLine(BRx1, BRy1, BRx2, BRy2);
			TLx1+=25;
			TRx1-=25;
			BLx1+=25;
			BRx1-=25;
			TLy2+=25;
			TRy2+=25;
			BLy2-=25;
			BRy2-=25;
			counter++;
		
		}	
			
		}
	}

	// do not touch
	public OctoberDrawingLab() {
		JFrame frame = new JFrame("OctoberDrawingLab");
		frame.setSize(1000, 500);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	} // end of MainFrame



} // end of class curly - do not delete
