package app;
import java.util.Scanner;
import java.util.Arrays;

/* Task:
Create a program called ArrayDistinctValues. The program should first input
 the number of integers to be saved to an array. Then the program should
  create the array, input integers and save them to the array. Finally,
   the program should print all distinct values in the array. */

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		int arrayLength = Integer.parseInt(input.nextLine());

		int[] array = new int[arrayLength];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter an integer: ");
			array[i] = Integer.parseInt(input.nextLine());
		}

		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			int j;
			for (j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					break;
				}
			}
			if (i == j) {
				System.out.print(array[i] + " ");
			}
		}

		input.close();
	}

}
