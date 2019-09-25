package app;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

/* Task:
Create a program called CompoundInterest to compute compound interest for
 the initial deposit in a savings account.

Assume that

all the interest is left to balance
the interest rate does not change after the initial deposit
the capital income tax is subtracted from the interest before it is added
 to the balance.
First, the program inputs the initial deposit , interest rate (%), 
capital income tax rate (%) and the number of years. Then the program
 prints the balance of the account at the end of each year. */

public class App {
    public static void main(String[] args) throws Exception {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter initial deposit: ");
		double deposit = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter interest rate: ");
		double interestRate = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter capital income tax rate: ");
		double taxRate = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter number of years: ");
		int numberOfYears = Integer.parseInt(input.nextLine());

		for (int i = 1; i <= numberOfYears; i++) {

			double amountAccrued = deposit * (1 + (interestRate / 100));

			double interestAccruedTaxed = (amountAccrued - deposit) * (1 - (taxRate / 100));

			double amountAccruedTaxed = deposit + interestAccruedTaxed;

			deposit = amountAccruedTaxed;

			System.out.println(i + ": " + twoDecimals.format(amountAccruedTaxed));
		}

		input.close();
    }
}