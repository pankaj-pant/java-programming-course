package app;
import java.util.Scanner;

/* Task:
Create a program called Factorial that displays the factorial of 
the given non-negative integer. If the input value is invalid, 
the program should display "Please enter a non-negative integer."

The factorial n! is calculated as follows: 1 x 2 x 3 x ... x n.
For example, 4! = 1 x 2 x 3 x 4 = 24. */


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
		
		try {System.out.print("Enter a non-negative integer: ");
		String integer = input.nextLine();
		int integerNumerical = Integer.parseInt(integer);
		
		if (integerNumerical >= 1) {
			int product = 1;
			for (int i = 1; i <= integerNumerical; i++) {
				product = product * i;
			}
			System.out.print(integer + "! = " + product);
		} else if (integerNumerical == 0) {
			System.out.print("0! = 1");
		} else if (integer.matches("[a-z]") == true) {
			System.out.print("Please enter a non-negative integer.");
		} else {
			System.out.print("Please enter a non-negative integer.");
		}
			
		} catch (NumberFormatException e) {
			System.out.print("Please enter a non-negative integer.");
		} 
		
		input.close();
		
    }
}