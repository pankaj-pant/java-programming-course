package app;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

/* Task:
Create a class called ArrayStatLibrary for storing generic reusable methods.
 That is, the ArrayStatLibrary class is a method library class and it does
  not have the main method. Instead, the class should have the following 
  methods: max, min, median, mean, and standardDeviation. Each method should
   take an array of integers as parameter (argument) and return the 
   appropriate result.

Create a program called ArrayStatistics that uses methods of the 
ArrayStatLibrary class. First, the main method should ask the user how
 many values there are in the sample. Then, the main method should input
  the values from the user and save them to an array. Finally, the program
   should compute the required descriptive statistics from the sample data
    and display them. See the example output for more details.

The main method should call the methods max, min, median, mean, and 
standardDeviation of the ArrayStatLibrary class to get the values to
 be printed.

The minimum allowed sample size is 3. If the user enters less than 3 
as the number of values, then the program should just print the text 
"Sorry, at least 3 values required". */

public class App {

	public static void main(String[] args) {
		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		int numberOfValues = Integer.parseInt(input.nextLine());

		int[] enteredIntegers = new int[numberOfValues];

			if (numberOfValues < 3) {
			System.out.print("Sorry, at least 3 values required\n");
		} else {

			for (int i = 0; i < enteredIntegers.length; i++) {
				System.out.print("Enter an integer: ");
				enteredIntegers[i] = Integer.parseInt(input.nextLine());
			}
		}

		int[] copy = Arrays.copyOf(enteredIntegers, enteredIntegers.length);
		
		if (numberOfValues >= 3) {
		
		System.out.print("\n");

		System.out.print("n = " + numberOfValues);
		System.out.print("\nMin: " + ArrayStatLibrary.min(enteredIntegers));
		System.out.print("\nMax: " + ArrayStatLibrary.max(enteredIntegers));
		System.out.print("\nMedian: " + oneDecimal.format(ArrayStatLibrary.median(enteredIntegers)));
		System.out.print("\nMean: " + oneDecimal.format(ArrayStatLibrary.mean(enteredIntegers)));
		System.out.print("\nSample standard deviation: " + oneDecimal
				.format(ArrayStatLibrary.standardDeviation(enteredIntegers, ArrayStatLibrary.mean(enteredIntegers))));
		System.out.print("\nSample data: ");
		ArrayStatLibrary.printArray(copy);
		}
		input.close();
	}

}

class ArrayStatLibrary {

	public static int min(int[] a) {
		int min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) {
				min = a[i];
			}
		}

		return min;
	}

	public static int max(int[] a) {
		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		return max;
	}
	
	public static void printArray(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static double median(int[] a) {
		double median;

		Arrays.sort(a);

		if (a.length % 2 == 0) {
			median = ((a[((a.length / 2) - 1)] + a[(a.length / 2)])) / 2.0;
		} else {
			median = a[((a.length / 2) - (1 / 2))];
		}

		return median;
	}

	public static double mean(int[] a) {
		double sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		double mean = (sum / a.length);

		return mean;
	}

	public static double standardDeviation(int[] a, double b) {
		double sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += Math.pow((a[i] - b), 2);
		}

		double standardDeviation = Math.sqrt(sum / (a.length - 1));

		return standardDeviation;
	}

	

}



