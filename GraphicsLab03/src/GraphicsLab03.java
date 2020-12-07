
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GraphicsLab03 extends JPanel  {

	public void paint(Graphics g) {
		{

			// Draw Grid
			g.drawRect(10,10,780,580);
			g.drawLine(400,10,400,590);
			g.drawLine(10,300,790,300);
			

			
			int counter = 0;
			while(counter <100 ) {
		
				//red: [0,255]
				//(int)Math.random()*(range+1)+min);
				
				int red = (int)(Math.random()*(255-0+1)+0); //random color generator
				int green = (int)(Math.random()*(255-0+1)+0);
				int blue = (int)(Math.random()*(255-0+1)+0);
				Color randomColor = new Color(red,green,blue);
				g.setColor(randomColor);
			
				int x1 = (int)(Math.random()*(399-11+1)+11);//line generator
				int y1 = (int)(Math.random()*(299-11+1)+11);
				//I didn't want the lines to overlap with the grid, so I subtracted "1" from the x&y borders.
				int x2 = (int)(Math.random()*(399-11+1)+11);
				int y2 = (int)(Math.random()*(299-11+1)+11);
				g.drawLine(x1, y1, x2, y2);
				
				g.setColor(randomColor);
				int Rectx = (int)(Math.random()*(789-50-401+1)+401);//rectangle generator
				int Recty = (int)(Math.random()*(299-50-11+1)+11);
				//I didn't want the lines to overlap with the grid, so I added "1" to left x border and subtracted "1" from right x border.
				//I didn't want the lines to overlap with the grid, so I subtracted "1" from bottom y border and added "1" to top y border.
				g.fillRect(Rectx, Recty, 50, 50);
				
				g.setColor(randomColor);
				int OvalDiameter = (int)(Math.random()*(200-0+1)+0);//circle generator
				int Ovalx = (int)(Math.random()*((399-OvalDiameter)-11+1)+(11));
				//I didn't want the lines to overlap with the grid, so I subtracted "1" from the right x border and added "1" to the left x border.
				//I didn't want the lines to overlap with the grid, so I subtracted "1" from the bottom y border and added "1" to the top y border.
				int Ovaly = (int)(Math.random()*((589-OvalDiameter)-301+1)+(301));
				g.drawOval(Ovalx, Ovaly, OvalDiameter, OvalDiameter);
				
				
				g.drawRect(600,400, 100, 100);//use to trace
				g.drawRect(575,375,100,100);//use to trace
				g.setColor(Color.red);//colored cube
				g.fillRect(600, 400, 100, 100);// front red polygon
				int [] greenX= {575,600,600,575};
				int [] greenY= {375,400,500,475};
				g.setColor(Color.green);
				g.fillPolygon(greenX, greenY,4);//green green
				int [] yellowX = {575,675,675,600};
				int [] yellowY = {375,375,400,400};
				g.setColor(Color.yellow);
				g.fillPolygon(yellowX, yellowY, 4);//yellow polygon
				int [] blueX = {675,700,675};
				int [] blueY = {375,400,400};
				g.setColor(Color.blue);
				g.fillPolygon(blueX, blueY, 3);//blue polygon
				
				
				counter++;//increment counter
				
			}

			
			
		}
	}

	// do not touch
	public GraphicsLab03() {
		JFrame frame = new JFrame("GraphicsLab03");
		frame.setSize(820, 680);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	} // end of MainFrame



} // end of class curly - do not delete
