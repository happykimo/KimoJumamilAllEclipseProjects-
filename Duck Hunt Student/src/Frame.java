import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements ActionListener, MouseListener {
	
	//Objects that need to be drawn on the JFrame in the paint method.
	
	Ground foreground = new Ground();
	Tree tree = new Tree();
	Duck duck = new Duck();
	Dog dog = new Dog();
	Duck duck2 = new Duck();
	
	Music pewpew = new Music("PewPew.wav",false);
	Music youSuck = new Music("YouSuck.wav",false);
	Music clickOn = new Music("ClickOn.wav", false);
	Music dead = new Music("Dead.wav",false);
	
	Font verdana = new Font("Verdana", Font.BOLD,20);
	int score=0;
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		duck.paint(g);
		duck2.paint(g);
		tree.paint(g);
		foreground.paint(g);
		
		 g.setFont(verdana);
		 g.drawString(""+score,800,30);
	}
			
	public static void main(String[] arg) {
		Frame f = new Frame();
	}
	
	public Frame() {
		JFrame f = new JFrame("Duck Hunt");
		f.setSize(new Dimension(900, 600));
		f.setBackground(Color.blue);
		f.add(this);
		f.addMouseListener(this);
		f.setResizable(false);
		
		Timer t = new Timer(16, this);
	
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) { //input off the release of initial press
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
		
		pewpew.play();
		int x = arg0.getX();
		int y = arg0.getY();
		duck.collided(x,y);
		duck2.collided(x, y);
		if (duck.collided(x,y)==true) {
			score++;//not updating score
		}
		if (duck2.collided(x,y)==true) {
			score++;
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}

}
