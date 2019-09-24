package app;
import java.util.Scanner;
import java.util.Arrays;

/* Task:
Create a program called ArrayDescendingNumbers that first inputs 4 decimal
 numbers from the user and saves them in an array. Then the program should
  print the numbers in descending order on a single line. */

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] enteredDouble = new double[4];
		for (int i = 0; i < 4; i++) {
			System.out.print("Enter " + (i + 1) + ". number: ");
			enteredDouble[i] = Double.parseDouble(input.nextLine().replace(',', '.'));

		}

		System.out.print("\n");
		Arrays.sort(enteredDouble);

		for (int i = enteredDouble.length - 1; i >= 0; i--) {
			System.out.print(enteredDouble[i] + " ");
		}

		input.close();
	}

}

