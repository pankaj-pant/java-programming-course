package app;
import java.util.Scanner;
import java.text.DecimalFormat;

/* Task:
Create a program called AverageOfDecimalValues that first inputs decimal 
values from the user until he/she decides to quit by entering zero. Then 
the program computes and displays the average of the entered values 
(excluding the zero) with two decimals. If the only entered value is zero,
 then the program displays "Nothing to calculate". */


public class App {
    public static void main(String[] args) throws Exception {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter first number (zero ends): ");
		
		double number = readDouble(keyboard);
		
		if (number == 0) {
			System.out.print("Nothing to calculate");
		}
		
		else if (number !=0) {
			int count = 0;
			double sum = number;

			while (number != 0) {
				System.out.print("Enter next number (zero ends): ");
				number = readDouble(keyboard);
				sum = sum + number;
				count = count + 1;
			}

			double average = sum / count;

			System.out.print("The average is " + twoDecimals.format(average));

		}
		keyboard.close();
	}
		
		
		
		private static double readDouble(Scanner keyboard) {
			return Double.parseDouble(keyboard.nextLine().replace(',', '.'));
			}

}