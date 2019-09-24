package app;
import java.util.Scanner;

/* Task:
Create a program called MethodsSecond that has a method called printRectangle
 that prints a 'rectangle shape' based on the given width and height. 
 The main method first inputs width and height from the user and then calls
  the printRectangle method with the width and height.

* A rectangle should be printed with the letter 'x' as shown in the example
 output.


Example output:
Enter width: 3
Enter height: 2

xxx
xxx 

*/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

		System.out.print("Enter width: ");
		int width = Integer.parseInt(input.nextLine());

		System.out.print("Enter height: ");
		int height = Integer.parseInt(input.nextLine());
		
		System.out.print("\n");

		printRectangle(width, height);

		input.close();
	}

	private static void printRectangle(int width, int height) {

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("x");

			}
			System.out.print("\n");
		}

	}

}