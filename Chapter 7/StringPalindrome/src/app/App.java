package app;
import java.util.Scanner;
import java.util.Arrays;

/* Task:
Create a program called StringPalindrome that has a method called
 isPalindrome that determines whether a string contains a palindrome.
  The method should accept a string as its input parameter and return
   true if the string contains a palindrome. Otherwise, the method 
   should return false.

The main method first inputs a string from the user and then calls 
the method isPalindrome with the inputted string. Finally, the main
 method prints either "The text is a palindrome." or "No palindrome". */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String enteredInput = input.nextLine().toLowerCase();

		if (isPalindrome(enteredInput) == true) {
			System.out.println("The text is a palindrome.");
		} else {
			System.out.println("No palindrome");
		}

		input.close();
	}

	private static boolean isPalindrome(String a) {
		a = a.trim();
		a = a.replaceAll("[\\s,.:;\\?!\\-'\"]", "");

		String reverse = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			reverse = reverse + a.charAt(i);
		}

		char arrayA[] = a.toCharArray();
		char arrayReverse[] = reverse.toCharArray();

		if (a.length() < 1) {
			return false;
		}

		if (a.matches(".*[^a-zA-Z].*")) {
			return false;
		}

		if (Arrays.equals(arrayA, arrayReverse)) {
			return true;
		} else {
			return false;
		}

	}

}
