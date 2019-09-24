package app;
import java.util.Scanner;

/* Task:
Create a program called PositiveOddIntegers that inputs values from the 
user until he/she decides to quit by entering the text "quit". The program
 should check if the inputted value is a positive odd integer. 
 NB! Use the remainder operator in this exercise.

Hints:

1) Pay attention to indentation when you are printing the program output.

2) Print the last line of the program output with System.out.println */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

		boolean exitString = false;

		while (exitString == false) {
			System.out.print("Enter a positive odd integer: ");
			String enteredInput = input.nextLine();
			try {

				int enteredInteger = Integer.parseInt(enteredInput);

				if (enteredInteger % 2 != 0 && enteredInteger >= 0) {

					System.out.println("  OK\n");

				} else {

					System.out.println("  " + enteredInteger + " is not a positive odd integer\n");

					
				}
			} catch (NumberFormatException e) {
				if (enteredInput.matches("quit")) {
					System.out.println("  Bye!");
					exitString = true;
				} else {

					System.out.println("  '" + enteredInput + "'" + " is not a positive odd integer\n");

				}
			}

		}

		input.close();
    }
}