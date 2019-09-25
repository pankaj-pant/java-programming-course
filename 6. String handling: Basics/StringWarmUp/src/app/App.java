package app;

import java.util.Scanner;

/* Task:
Create a program called StringWarmUp that first inputs a string from the 
user. Then the program prints the following: the length of the string, the 
string in all capital letters, and the string in all small letters. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String enteredInput = input.nextLine();

		int numberOfCharacters = enteredInput.length();
		String upperCase = enteredInput.toUpperCase();
		String lowerCase = enteredInput.toLowerCase();

		System.out.println(numberOfCharacters + " characters");
		System.out.println(upperCase);
		System.out.println(lowerCase);

		input.close();
	}

}
