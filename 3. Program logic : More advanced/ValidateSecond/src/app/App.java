package app;
import java.util.Scanner;

/* Task:
Create a program called ValidateSecond that inputs a grade number (0-5) 
from the user. If the inputted value is not valid integer between 0 and 5, 
the program should print "Please enter an integer between 0 and 5." 
Otherwise, the program should print "OK". */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter grade (0-5):");
		String grade = input.nextLine();
		
		if (grade.matches("[0-5]") == false) {
			System.out.print("Please enter an integer between 0 and 5.");
		} else {
			System.out.print("OK");
		}
		
		input.close();
    }
}