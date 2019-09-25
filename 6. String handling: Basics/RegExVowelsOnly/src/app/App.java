package app;
import java.util.Scanner;

/* Task:
Create a program called RegExVowelsOnly that first inputs a string
 from the user. If the string contains only Finnish vowels, the program
  should print "Vowels only". Otherwise, the program should print 
  "Not only vowels!". Check the string with a single regular expression. */


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String enteredInput = input.nextLine();

		if (enteredInput.matches("[AaEeIiOoUuYyÄäÖöÅå]{1,}")) {
			System.out.println("Vowels only");
		} else {
			System.out.println("Not only vowels!");
		}

		input.close();

	}

}