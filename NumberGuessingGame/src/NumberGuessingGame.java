import java.util.Scanner;

public class NumberGuessingGame
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
   // Choose a random number from 0-100 
 int answer = (int)(Math.random()*101);
   // Ask the user to guess a number from 0 to 100 
   System.out.println("Guess a number from 0 to 100.");
   // Get the first guess using scan.nextInt();
int guess = scan.nextInt();
// Loop while the guess does not equal the random number,
while (guess!=answer){
     // If the guess is less than the random number, print out "Too low!"
  if (guess < answer){
    System.out.println("Too low!");
  }
  if (guess < answer){
    System.out.println("Too high!");
  }
}
     // Get a new guess (save it into the same variable)
guess = scan.nextInt();   

  // Print out something like "You got it!"
System.out.println("You Win!");
  }
}