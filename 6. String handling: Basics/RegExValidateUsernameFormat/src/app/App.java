package app;
import java.util.Scanner;

/* Task:
Create a program called RegExValidateUsernameFormat that first inputs
 an email username from the user. The username should be a standard 
 Haaga-Helia student email in the following format: 
 a1234567@myy.haaga-helia.fi. If the username is in the correct format,
  the program should print "OK". Otherwise, the program should print
   "Invalid username format". Validate the username with a single
    regular expression. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String enteredInput = input.nextLine();

		if (enteredInput.matches("a[0-9]{7}@myy\\.haaga-helia\\.fi")) {
			System.out.println("OK");
		} else {
			System.out.println("Invalid username format");
		}

		input.close();
	}

}
