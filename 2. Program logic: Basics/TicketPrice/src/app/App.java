package app;
import java.text.DecimalFormat;
import java.util.Scanner;

/* Task:
Create a program called TicketPrice that first inputs the price of a single
 bus ticket, price of the season ticket (valid for one month), and the number
  of bus trips the user makes per month. Then the program tells which one
 is the cheaper option (buying single tickets or buying a season ticket) 
 and how much cheaper it is.

The program program should display one of the following texts:

Buying single tickets is 99,00 euros cheaper.

Buying a season ticket is 99,00 euros cheaper.

There is no difference in the price. */

public class App {
    public static void main(String[] args) throws Exception {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);

		System.out.print("Enter price for a single ticket: ");
		double singleTicketPrice = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter price for a season ticket: ");
		double seasonTicketPrice = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter the number of bus trips per month: ");
		int numberOfTrips = Integer.parseInt(input.nextLine());

		double pricePerMonth = (singleTicketPrice * numberOfTrips);

		if (pricePerMonth < seasonTicketPrice) {
			System.out.print("Buying single tickets is " + twoDecimals.format(seasonTicketPrice - pricePerMonth) + " euros cheaper.");
		} else if (pricePerMonth > seasonTicketPrice) {
			System.out.print("Buying a season ticket is " + twoDecimals.format(pricePerMonth - seasonTicketPrice) + " euros cheaper.");
		} else {
			System.out.print("There is no difference in the price.");
		}

		input.close();
    }
}