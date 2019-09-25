package app;

/* Task:
Create a program called MethodsFactorial that has a method called factorial that
 accepts an integer as its input parameter and returns the factorial of the integer.
  See the previous "Factorial" exercise for more details. The factorial method should 
  not print anything.

The main method should print factorials of 1...9 */

public class App {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			int answer = factorial(i);
			System.out.print(i + "! = " + answer + "\n");
		}

	}

	private static int factorial(int i) {
		int product = 1;
		for (int j = i; j >= 1; j--) {
			product *= j;
		}
		return product;
	}
}
