package app;
import java.util.Scanner;

/* Task:
Create a program called MethodsMax that has a method called max that accepts
 two doubles as its input parameters. The method should return the greater of 
 the two doubles. The max method should not print anything.

The main method first inputs two doubles from the user and then calls the max 
method. Finally, the main method prints the value that the max method has returned. 
This time, the number of decimal places should not be limited.  */

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first double: ");
		double firstDouble = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter second double: ");
		double secondDouble = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("\n");

		double maxValue = max(firstDouble, secondDouble);

		System.out.print("The max value is " + maxValue);

		input.close();
	}

	public static double max(double firstDouble, double secondDouble) {
		if (firstDouble > secondDouble) {
			return firstDouble;
		} else {
			return secondDouble;
		}

	}
}
