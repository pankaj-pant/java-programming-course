package app;
import java.util.Scanner;

/* Task:
Create a class called MethodsLibrary for storing generic methods. That is, the MethodsLibrary class is a
 method library class and it does not have the main method. Copy your already existing code of the factorial
  method to the MethodsLibrary class and do the minor modification to make the method accessible from outside
   of the MethodsLibrary class.

Create a program called MethodsUseLibraryClass that uses the method factorial of the MethodsLibrary class. 
The main method inputs an integer from the user and calls the factorial method of the MethodsLibrary class to 
get the factorial of the integer. Finally, the main method prints the result. */

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int userInput = Integer.parseInt(input.nextLine());

		int answer = MethodsLibrary.factorial(userInput);

		System.out.print(userInput + "! = " + answer);

		input.close();
	}

}


 class MethodsLibrary {

	public static int factorial(int input) {
		int product = 1;
		for (int i = input; i >= 1; i--) {
			product *= i;
		}
		return product;
	}

}