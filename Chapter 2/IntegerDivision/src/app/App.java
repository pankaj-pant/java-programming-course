package app;
import java.util.Scanner;

/* Task:
Create a program called IntegerDivision that first inputs two integers 
(dividend and divisor) from the user. Then the program computes displays 
the quotient and remainder of the division. */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

		System.out.print("Enter dividend: ");
		int dividend = Integer.parseInt(input.nextLine());

		System.out.print("Enter divisor: ");
		int divisor = Integer.parseInt(input.nextLine());

		double quotient = dividend / divisor;
		int quotientInteger = (int) quotient;

		int remainder = dividend % divisor;

		System.out.print(dividend + " / " + divisor + " = " + quotientInteger + ", the remainder is " + remainder);

		input.close();
    }
}