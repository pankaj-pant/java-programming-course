package app;
import java.util.Scanner;

/* Task:
Create a program called SumOfTwoIntegers that first inputs two integers 
from the user. Then the program prints the sum of the integers */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int firstInteger = Integer.parseInt(input.nextLine());

		System.out.print("Enter second integer: ");
		int secondInteger = Integer.parseInt(input.nextLine());

		System.out.print(firstInteger + " + " + secondInteger + " = " + (firstInteger + secondInteger));
		input.close();
    }
}