package app;
import java.util.Scanner;

/* Task:
Create a program called StringEquality that first inputs two strings from
 the user. Then the program checks if the strings are equal and displays
  either "Equal" or "Not equal". */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter first string: ");
		String firstString = input.nextLine().trim();
		
		System.out.print("Enter second string: ");
		String secondString = input.nextLine().trim();
		
		if (firstString.equals(secondString)) {
			System.out.print("Equal");
		} else {
			System.out.print("Not equal");
		}
		
		
		input.close();
    }
}