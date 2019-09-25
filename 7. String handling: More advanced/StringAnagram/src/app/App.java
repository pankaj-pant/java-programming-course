package app;
import java.util.Scanner;
import java.util.Arrays;

/* Task:
Create a program called StringAnagram that has a method called isAnagram 
that determines whether two strings are anagrams of each other.

The main method first inputs two strings from the user and then calls
 the method isAnagram with the inputted strings. Finally, the main 
 method prints either "Anagram!" or "No anagram.".

Rules (in this exercise)

The method isAnagram should allow only letters, whitespace, commas 
and dots in an anagram. If there are any other characters, then the 
string cannot contain an anagram.
The method should ignore all whitespace, commas and dots when it 
checks the text.
If there are no letters in the text, then the text cannot be an anagram. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String enteredInput = input.nextLine().toLowerCase();

		System.out.print("Enter second string: ");
		String secondInput = input.nextLine().toLowerCase();

		if (isAnagram(enteredInput, secondInput) == true) {
			System.out.print("Anagram!");
		} else {
			System.out.print("No anagram.");
		}

		input.close();

	}

	private static boolean isAnagram(String a, String b) {
		a.trim();
		b.trim();
		
		a = a.replaceAll("[\\s.,]", "");
		b = b.replaceAll("[\\s.,]", "");

		char arrayA[] = a.toCharArray();
		Arrays.sort(arrayA);
		char arrayB[] = b.toCharArray();
		Arrays.sort(arrayB);
		
		if(a.length() < 1 || b.length() < 1) {
			return false;
		}

		if (a.matches(".*[^a-zA-Z].*") || b.matches(".*[^a-zA-Z].*")) {
			return false;
		}

		if (Arrays.equals(arrayA, arrayB)) {
			return true;
		} else {
			return false;
		}

	}

}
