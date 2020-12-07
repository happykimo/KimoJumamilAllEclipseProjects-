import java.awt.Font;
import java.awt.Graphics;

public class DuckHuntScore {
	private int points;
	public DuckHuntScore() {
		points = 0;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int set) {
		points = set;
	}
	public void add100Point() {//each time a duck dies 100 points is added
		points+=100;
	}
	public void resetPoints() {
		points = 0;
	}
	
	Font verdana = new Font("Verdana", Font.BOLD,40);
	}


