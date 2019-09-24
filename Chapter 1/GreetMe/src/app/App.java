package app;
import java.util.Scanner;

/* Task:
Create a program called GreetMe that first inputs a first name from the user. 
Then the program prints a greeting as shown in the example output. */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();

		System.out.println("Hello, " + firstName + "!");

		input.close();
    }
}