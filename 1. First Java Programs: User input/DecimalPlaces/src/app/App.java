package app;
import java.text.DecimalFormat;
import java.util.Scanner;

/* Task:
Create a program called DecimalPlaces that first inputs a decimal value
 from the user. Then the program prints the value with two decimals
 */

public class App {
    public static void main(String[] args) throws Exception {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");
		double decimalNumber = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.println(twoDecimals.format(decimalNumber));
		input.close();
    }
}