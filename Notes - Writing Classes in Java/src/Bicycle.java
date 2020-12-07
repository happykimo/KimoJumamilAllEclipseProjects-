
public class Bicycle {
	private String color;
	private double price;
	private boolean horn;
	
	public Bicycle() {
		color = "";
		price = 0.0;
		horn = false;
	}
	public Bicycle(String initColor, double initPrice, boolean initHorn){
		color = initColor;
		price = initPrice;
		horn = initHorn;
	}
	public void print() {
		System.out.println("Color:"+color+"Price:$"+price+"Horn:"+horn);
	}
}
