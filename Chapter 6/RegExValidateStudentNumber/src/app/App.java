package app;
import java.util.Scanner;

/* Task:
Create a program called RegExValidateStudentNumber that first inputs a
 student number from the user. If the inputted data contains exactly 7
  digits, the program should print "OK". Otherwise, the program should 
  print "Invalid student number". Validate the username with a single 
  regular expression. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter student number: ");
		String username = input.nextLine();

		if (username.matches("[0-9]{7}")) {
			System.out.print("OK");
		} else {
			System.out.print("Invalid student number");
		}

		input.close();
	}

}
