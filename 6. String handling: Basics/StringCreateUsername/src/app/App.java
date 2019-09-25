package app;
import java.util.Scanner;

/* Task:
Create a program called StringCreateUsername that has a method called 
createUsername that creates a new username based on the user's first name
 and surname. The method should accept first name and surname as its input
  parameters and return either a new username or null if the username
   cannot be created.

The main method first inputs first name and surname from the user and then
 calls the method createUsename with the inputted data. Finally, the main
  method prints either the username or "Not enough letters to create a
   username!"

A username should be written in small letters only and it should include
 first three letters from the given surname and first two letters from
  the first name. No username should be created if there are not
   enough letters available in the first name or in the surname. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String firstName = input.nextLine().toLowerCase();

		System.out.print("Enter surname: ");
		String surname = input.nextLine().toLowerCase();

		if (createUsername(firstName, surname) == null) {
			System.out.println("Not enough letters to create a username!");
		} else {
			System.out.println(createUsername(firstName, surname));
		}

		input.close();
	}

	private static String createUsername(String a, String b) {
		String username = "";

		if (b.length() > 2 && a.length() > 1) {
			username += b.substring(0, 3) + a.substring(0, 2);
			return username;
		} else {
			return null;
		}

	}

}
