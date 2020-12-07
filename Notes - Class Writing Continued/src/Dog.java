
public class Dog {
	private int age;
	private String name;
	
	public Dog(int paramAge) {
		//assign the age attribute to the "input" aka parameter/argument
		//recall that this value is coming from some other set of code
		age = paramAge;
	
	}
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		//String representation of dog
		return name+ " "+ age;
	}
}
