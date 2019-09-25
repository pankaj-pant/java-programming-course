package app;

/* Task:
Create a program called ArrayWarmUp that has an array of five integers. 
The array contains the following values: 1, 5, 2, 6, and 7. The program 
should iterate through the array elements and print their values on a 
single line. */

public class App {

	public static void main(String[] args) {

		int[] fiveIntegers = { 1, 5, 2, 6, 7 };

		for (int i = 0; i < fiveIntegers.length; i++) {
			System.out.print(fiveIntegers[i] + " ");
		}

	}

}
