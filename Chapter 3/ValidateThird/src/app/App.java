package app;
import java.util.Scanner;

/* Task:
Create a program called ValidateThird that inputs a grade number (0-5)
 from the user. If the input is a valid grade number, the program should 
 print "OK". Otherwise, the program should print the entered value
  and "is not a valid grade." and prompt a grade number again. 
  The program should keep asking grade numbers until the user enters 
  a valid grade number. */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter grade (0-5): ");
		String grade = input.nextLine();
		
		if (grade.matches("[0-5]") == true) {
			System.out.print("OK");
		} else {
			while(grade.matches("[0-5]") == false) {
				System.out.println(grade + " is not a valid grade.");
				System.out.println("Enter grade (0-5): ");
				grade = input.nextLine();
				
			}
			System.out.print("OK");
		}
		
		
	
		
		
		input.close();
    }
}