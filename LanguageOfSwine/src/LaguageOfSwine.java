import java.util.Scanner;
public class LaguageOfSwine {
	public static void main(String[] args) {
	System.out.println("Enter any single word to be translated to the language of swine.");
	Scanner scan = new Scanner(System.in);
	String word = scan.nextLine();
	int length = word.length();
	int end = length-1; 

       // Use word.substring to construct word in pig latin
       String pigLatin = word.substring(1,length)+ word.substring(0,1)+"ay";

       System.out.println(word + " in Pig Latin is " + pigLatin);
   scan.close();

}
}