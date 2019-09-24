package app;
import java.util.Scanner;

/* Task:
Create a program called StringDecimalPartLength that first inputs a
 decimal number from the user. Then the program determines how many 
 digits there are after the decimal point in the decimal number. Finally,
  the program prints the result.

If the inputted value is not a "proper decimal number", the program 
should print "Please enter a proper decimal number". */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");
		String enteredinput = input.nextLine().replace(',', '.');

		if (enteredinput.matches("[0-9]{1,}[,|.][0-9]{1,}")) {
		
			int positionOfSeperator = enteredinput.indexOf(".");

			int lengthOfString = enteredinput.length();

			int numberOfDecimals = lengthOfString - positionOfSeperator - 1;
			System.out.println(numberOfDecimals + " decimal place(s)");
		} else {
			System.out.print("Please enter a proper decimal number");
		}

		input.close();
	}

}
