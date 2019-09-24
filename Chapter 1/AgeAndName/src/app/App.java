package app;
import java.util.Scanner;

/* Task:
Create a program called  AgeAndName  that first inputs age and name from the user. 
Then the program prints the entered data */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = Integer.parseInt(input.nextLine());

		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();

		System.out.print(firstName + ", " + age + " years");
		
		input.close();
    }
}