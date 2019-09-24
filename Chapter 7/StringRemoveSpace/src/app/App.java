package app;
import java.util.Scanner;

/* Task:
Create a program called StringRemoveSpace that has a method called
 removeExtraSpace. The method removes all extra whitespace from a string.
  The method should accept a string as its input parameter, process the
   string content and return a new string.

The main method first inputs a string from the user and then calls
 the method removeExtraSpace with the inputted string. Finally, the
  main method prints the result enclosed in double quotes. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String enteredInput = input.nextLine();

		removeExtraSpace(enteredInput);

		input.close();
	}

	private static String removeExtraSpace(String a) {
		a.trim();
		String toPrint = a.replaceAll("[\\s]{2,}", " ");
		System.out.println("\"" + toPrint + "\"");

		return a;

	}

}
