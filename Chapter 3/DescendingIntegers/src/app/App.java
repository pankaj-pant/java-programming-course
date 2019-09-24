package app;
import java.util.Scanner;

/* Task:
Create a program called DescendingIntegers that first inputs an integer 
from the user. Then the program prints all integers between 1 and the 
inputted integer in descending order. The integers should be printed on a 
single line. */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int startingNumber = Integer.parseInt(input.nextLine());

		for (int i = startingNumber; i > 0; i--) {
			System.out.print(i + " ");
		}

		input.close();
    }
}