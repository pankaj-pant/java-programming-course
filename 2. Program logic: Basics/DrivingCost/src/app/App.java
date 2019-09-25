package app;
import java.util.Scanner;
import java.text.DecimalFormat;

/* Task:
Create a program named DrivingCost that calculates the driving cost per 
kilometer.

First, the program inputs the driven kilometers (integer), amount of fuel
 consumed (decimal) and fuel price per liter (decimal). Finally, the program 
 prints the cost per kilometer with two decimals. */

public class App {
    public static void main(String[] args) throws Exception {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter driven kilometers: ");
		int drivenKilometers = Integer.parseInt(input.nextLine());

		System.out.print("Enter amount of fuel consumed: ");
		double fuelConsumed = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter fuel price per liter: ");
		double fuelPricePerLiter = Double.parseDouble(input.nextLine().replace(',', '.'));

		double costPerKilometer = ((fuelPricePerLiter * fuelConsumed) / drivenKilometers);

		System.out.print("The cost per kilometer is " + twoDecimals.format(costPerKilometer) + " euros.");

		input.close();
    }
}