
public class Driver {

	public static void main(String[] args) {
		//1)create a cat object
		Cat c1 = new Cat();
		System.out.println(c1.toString());
		System.out.println(c1);//toString() is called automatically
		//behind the scenes due to a java superclass. 
		//You don't want to add .toString because it is unnecessary
		
		//2)alter the constructor so that all cat objects have 
		//name "Felix"
		
		//3)create a Dog object and print to the console
		Dog d1 = new Dog(2);
		System.out.println(d1);//printing doesn't work 
		//correctly without toString() method
		
		Cat felix = new Cat();
		System.out.println(felix.getName());
		
		Rectangle square2 = new Rectangle(2,2);
		Rectangle r1 = new Rectangle(1,5);
		System.out.println(square2.getArea());
		
		//call the isSquare method and see if it returns
		//the expected results
		
		System.out.println("Square:"+r1.isSquare());
		System.out.println("Square:"+square2.isSquare());
		
		Fraction f1 = new Fraction(333,111);
		Fraction f2 = new Fraction(120,3);
		f1.simplify();
		f2.simplify();
		System.out.println(f1);
		System.out.println(f2);
	}
	
}
