package app;
import java.util.Scanner;

/* Task:
Create a program called ValidateFirst that inputs a grade number from the
 user. If the inputted value cannot be converted to an integer, the program 
 should print "Please enter an integer." 
 Otherwise, the program should print "OK".
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter grade (0-5): ");
		String grade = input.nextLine();
		
		if (grade.matches("[0-9]") == false) {
			System.out.print("Please enter an integer.");
		} else {
			System.out.print("OK");
		}
		
		
		
		input.close();
    }
}