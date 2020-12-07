
public class Ifstatementassignment2 {
	
	//if-statements, conditional statements
			//blocking code- lamen terms
		//	if(//*condition*/) {
			//run if condition is true
	public static void main(String[] args) {
		
		
		int age = 6;
		/*
		 *  age equals 16- print out "you can drive now"
		 *  age equals 18- print out "you can vote now"
		 *  age equals 21- print out "you can gamble now"
		 *  >60- print out "you can retire now"
		 */
		if(age >= 16) {// equality check --> == (reminder 1 equals is assign)
			System.out.println("You can drive now.");
		}
		if (age <= 16) {
			System.out.println("You are too young to do anything. :(");
		}
		if (age >= 18) {
			System.out.println("You can vote now.");
		}
		if (age >= 21) {
			System.out.println("You can gamble now.");
		}
		if (age >= 60) {
			System.out.println("You can retire now.:)");
		}
		
		
		// TODO Auto-generated method stub

	}

}
