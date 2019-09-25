package app;

import java.util.Scanner;

/* Task:
Create a program called StringPassword that has a method called 
validatePassword that checks whether a password is in the required format. 
The method should accept a username and password as its input parameters and
 return true if the password format is ok. Otherwise, it should return false.

The main method first inputs a user name and password from the user and 
then calls the method validatePassword with the inputted data. Finally, 
the main method prints "OK" if the password format is ok. Otherwise, it 
prints "NOT OK"

The password validation rules are the following:

A password should be at least 8 characters long.
A password should not include the username. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter username: ");
		String username = input.nextLine().toLowerCase();
		
		System.out.print("Enter password: ");
		String password = input.nextLine().toLowerCase();
		
		if (validatePassword(username, password) == true) {
			System.out.print("OK");
		} else {
			System.out.print("NOT OK");
		}
		
		input.close();
	}

	private static boolean validatePassword(String a, String b) {
		int passwordLength = b.length();
		
		int check = b.indexOf(a);
		
		if (passwordLength >= 8 && check == -1) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
}
