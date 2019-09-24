package app;
import java.util.Scanner;

/* Task: 
Create a program called MethodsPrimes that has a method called isPrime
 that takes an integer as  parameter and returns true if the integer is
  a prime. Otherwise, the method returns false. The method isPrime 
  should not input anything from the user or print anything. */

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("How many primes: ");
		int userInput = Integer.parseInt(input.nextLine());

		int counter = 0;
		int number = 2;

		while (counter < userInput) {

			if (isPrime(number) == true) {
				System.out.print(number + " ");
				counter++;
			}
			number++;

		}

		input.close();
	}

	private static boolean isPrime(int integer) {
		for (int i = 2; i <= Math.sqrt(integer); i++) {
			if (integer % i == 0)
				return false;
		}
		return true;
	}
}
