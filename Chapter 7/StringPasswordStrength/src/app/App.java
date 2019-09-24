package app;
import java.util.Scanner;

/* Task:
Create a program called StringPasswordStrength that has a method
 called checkStrength that checks the strength of a password. 
 The method should accept a password as its input parameter and
  return true if the password is strong enough. Otherwise, it 
  should return false.

The main method first inputs a password from the user. Then it calls
 the method checkStrength with the inputted password. Finally, the 
 main method prints "OK" if the password is strong enough. Otherwise
  it prints "Not strong enough!"

A password is considered to be strong enough if it has at least 8
 characters and it includes characters from at least three different
  categories. The four categories of characters are the following:
   uppercase letters, lowercase letters, digits, and other characters. */

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter password: ");
		String password = input.nextLine();

		if (checkStrength(password) == true) {
			System.out.println("OK");
		} else {
			System.out.println("Not strong enough!");
		}

		input.close();
	}

	private static boolean checkStrength(String a) {
		int passwordStrength = 0;

		if (a.matches(".*[A-Z].*")) {
			passwordStrength = passwordStrength + 1;
		}
		if (a.matches(".*[a-z].*")) {
			passwordStrength = passwordStrength + 1;
		}
		if (a.matches(".*\\d.*")) {
			passwordStrength = passwordStrength + 1;
		}
		if (a.matches(".*[\\s`~!@#$%^&*()\\\\-_=+\\\\\\\\|\\\\[{\\\\]};:'\\\",<.>/?].*")) {
			passwordStrength = passwordStrength + 1;
		}

		if (passwordStrength >= 3 && a.length() >= 8) {
			return true;
		} else {
			return false;
		}

	}

}
