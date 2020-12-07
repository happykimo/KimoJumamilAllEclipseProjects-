
public class Runner {

	public static void main(String[] args) {
		int x;//declare an int x
		Car c1; //a reference to a car object
		c1 = new Car();// actually creates the object
					  //the call to the constructor
		//declare and initialize a car with a color of silver and a price of 8000.0
		Car c2 = new Car("Silver", 8000.0);
		Bicycle b1 = new Bicycle();
		Bicycle b2 = new Bicycle("red", 200.0, true);
		
		c1.print();
		c2.print();
		b1.print();
		b2.print();

	}

}
