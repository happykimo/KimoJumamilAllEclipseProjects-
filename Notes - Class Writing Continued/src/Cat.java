
public class Cat {
	private int age;
	private String name;
	
	public Cat() {
		age = 0;
		name = "Felix";
	}
	//getters / accessors
	//getter for the age attribute of a Cat
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setName(String cat) {
		name = cat;
	}
	public String toString() {
		//return a String representation of a cat object
		return name+" "+age;
	}
}
