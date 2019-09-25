package app;
import java.util.Scanner;

/* Task:
Create a program called ProductOfDigits that first inputs an integer 
from the user. Then the program computes and prints the product of the
 digits of the integer. Use the remainder operator in this exercise. */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter an integer: ");
		int enteredInteger = Integer.parseInt(input.nextLine());
		int product = 1;
		
		
		
		if (enteredInteger == 0) {
			System.out.println("0");
		} else {
			while(enteredInteger != 0) {
				product *= enteredInteger % 10;
				enteredInteger = enteredInteger / 10;
				
			}
			System.out.println(Math.abs(product));
		}
		
		
	
		input.close();
    }
}