package app;
import java.util.Scanner;
import java.text.DecimalFormat;

/* Task:
Create a program called AgentCommission that first inputs the selling price of the 
apartment from the user. Then the program calculates ands the real estate agent's 
commission with two decimals.

The commission is 3.44 % of the selling price. Minimum commission is 2400,00 euros.

For example, if the selling price is 120000 euros then the commission is 4128,00 euros. 
If the selling price is 50000, then the commission is 2400,00 euros. */

public class App {
    public static void main(String[] args) throws Exception {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter selling price: ");
		double price = Double.parseDouble(input.nextLine().replace(',', '.'));

		double commission = (price * 0.0344);

		if (commission < 2400) {
			System.out.print("The commission is 2400,00 euros.");
		} else {
			System.out.print("The commission is " + twoDecimals.format(commission) + " euros.");
		}
		input.close();
    }
}