package app;
import java.util.Scanner;

/* Task:
Create a program called StringBackwards that has a method called reverse
 that reverses a string. The method should accept a string as its input 
 parameter and return a reversed version of the string. Hint: Maybe a 
 loop and the charAt method are needed here.

The main method first inputs a string from the user and then calls 
the method reverse with the inputted string. Finally, the main method
 prints the reversed string. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String enteredInput = input.nextLine();

		System.out.println(reverse(enteredInput));

		input.close();
	}

	private static String reverse(String a) {
		String reversedInput = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			reversedInput += a.charAt(i);
		}

		return reversedInput;

	}

}
