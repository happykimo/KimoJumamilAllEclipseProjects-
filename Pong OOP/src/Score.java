import java.awt.Font;
import java.awt.Graphics;

public class Score {
	int points;
	public Score() {
		points = 5;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int set) {
		points = set;
	}
	public void addPoint() {
		points++;
	}
	public void resetPoints() {
		points = 0;
	}
	
	Font verdana = new Font("Verdana", Font.BOLD,40);
	}
