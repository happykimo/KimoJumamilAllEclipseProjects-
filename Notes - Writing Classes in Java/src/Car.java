
public class Car {//class header	
	/*if you do not provide any constructors,
	 * the class will inherit one from the java 
	 * superclass
	 */
	
	//attributes (instance variables)
	private String color;
	private double price;
	
	//constructors
	
	public Car() {//default-constructor (no parameters)
		//initialize the instance variables
		color = "black";
		price = 20000.0;
	}
	public Car(String pColor, double paramPrice) {
		color = pColor;
		price = paramPrice;
	}
	public Car(double paramPrice) {
		color = "black";
		price = paramPrice;
	}
	public void print() {//create method to print out car variables
		
		System.out.println("Color:"+color+"Price:"+price);
		
	}
}
