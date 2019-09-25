package app;
import java.util.Scanner;
import java.text.DecimalFormat;

/* Task:
Write a program called ArrayGrossPayCalculation.

The gross pay is calculated by multiplying the number of hours worked 
by the hourly wage.

The overtime compensation is 50 % of your hourly wage. You get overtime
 compensation on those days when you work more than 8 hours. For example, 
 10 working hours give you overtime compensation on two hours. */

public class App {

	public static void main(String[] args) {
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your hourly wage: ");
		double hourlyWage = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter the number of days: ");
		int numberOfDaysUserInput = Integer.parseInt(input.nextLine());

		int[] hoursWorkedPerDay = new int[numberOfDaysUserInput];

		for (int i = 0; i < hoursWorkedPerDay.length; i++) {
			System.out.print("Hours worked on day " + (i + 1) + ": ");
			hoursWorkedPerDay[i] = Integer.parseInt(input.nextLine());
		}

		int totalHours = 0;
		for (int i = 0; i < hoursWorkedPerDay.length; i++) {
			totalHours = totalHours + hoursWorkedPerDay[i];
		}

		System.out.print("\nTotal work hours is " + totalHours);

		int[] overTimeHours = new int[numberOfDaysUserInput];

		for (int i = 0; i < overTimeHours.length; i++) {
			if (hoursWorkedPerDay[i] <= 8) {
				overTimeHours[i] = 0;
			} else {
				overTimeHours[i] = hoursWorkedPerDay[i] - 8;
			}
		}

		int totalOverTimeHours = 0;
		for (int i = 0; i < overTimeHours.length; i++) {
			totalOverTimeHours = totalOverTimeHours + overTimeHours[i];
		}

		double grossPay = (hourlyWage * totalHours) + (totalOverTimeHours * (hourlyWage / 2));

		System.out.print("\nGross pay is " + twoDecimals.format(grossPay));

		System.out.print("\nYou entered the following daily hours: ");
		for (int i = 0; i < hoursWorkedPerDay.length; i++) {
			System.out.print(hoursWorkedPerDay[i] + " ");
		}

		input.close();
	}

}
