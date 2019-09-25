package app;
import java.util.Scanner;

/* Task:
Create a program called StringLettersAndDigits that first inputs
 a string from the user. Then the program prints the number of letters
  and the number of digits in the string. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String enteredInput = input.nextLine();

		int numberOfLetters = 0;
		int numberOfDigits = 0;

		for (int i = 0; i < enteredInput.length(); i++) {
			Character c = enteredInput.charAt(i);
			if (Character.isLetter(c) == true) {
				numberOfLetters += 1;
			} else {
				if (Character.isDigit(c) == true) {
					numberOfDigits += 1;
				}
			}
		}
		System.out.println(numberOfLetters + " letter(s)");
		System.out.println(numberOfDigits + " digit(s)");

		input.close();
	}

}
