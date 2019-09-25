package app;

/* Task:
Create a program called ArrayMatrixSum. First, copy/paste the main method
 below to your program class.
Then write the printSum method. The printSum method should print the sum
 of two matrices. */

public class App {

	public static void main(String[] args) {
		int[][] first = { { 1, 2, 0 }, { 2, 3, 4 } };
		int[][] second = { { 3, 2, 5 }, { 6, 4, 3 } };
		int[][] third = { { 1, 1, 1, 1 }, { 4, 3, 2, 1 }, { 2, 2, 2, 2 } };
		int[][] fourth = { { 2, 2, 2, 3 }, { 2, 3, 2, 0 }, { 1, 2, 3, 4 } };

		printSum(first, second);
		System.out.println();

		printSum(third, fourth);

	}

	private static int[][] printSum(int[][] a, int[][] b) {

		int rows = a.length;
		int columns = a[0].length;

		int[][] sumOfMatrices = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sumOfMatrices[i][j] = a[i][j] + b[i][j];

				if (j == (columns - 1)) {
					for (int col = 0; col < columns; col++) {
						System.out.print(sumOfMatrices[i][col] + " ");
					}

				}

			}
			System.out.println();
		}

		return sumOfMatrices;
	}
}