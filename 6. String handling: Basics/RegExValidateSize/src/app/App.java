package app;
import java.util.Scanner;

/* Task:
Create a program called RegExValidateSize that first inputs size code
 (XS, S, M, L, or XL) from the user. If the size code is valid, the
  program prints "OK". Otherwise, the program prints "Invalid size". 
  Validate the inputted data with a single regular expression. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter size: ");
		String enteredInput = input.nextLine();

		if (enteredInput.matches("XS|S|M|L|XL")) {
			System.out.println("OK");
		} else {
			System.out.println("Invalid size");
		}

		input.close();
	}

}
