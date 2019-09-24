package app;
import java.util.Scanner;
import java.text.DecimalFormat;

/* Task:
Create a program called CarSharing for dividing fuel expenses in a group 
of people who have shared a car on a trip.

The program first inputs the driven kilometers, fuel consumption per 100km,
 fuel price per liter, and the number of people who have shared the car on
  the trip. Then the program calculates how much each of them should pay 
  for the fuel. Display the sum with two decimals. */

public class App {
    public static void main(String[] args) throws Exception {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter driven kilometers: ");
		int drivenKilometers = Integer.parseInt(input.nextLine());

		System.out.print("Enter fuel consumption per 100 km: ");
		double fuelConsumption = Double.parseDouble(input.nextLine().replace(',', '.'));
		;

		System.out.print("Enter fuel price per liter: ");
		double fuelPrice = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter number of people: ");
		int numberOfPeople = Integer.parseInt(input.nextLine());

		double pricePerPerson = (((drivenKilometers * (fuelConsumption / 100)) * fuelPrice) / numberOfPeople);

		System.out.print("Each of the " + numberOfPeople + " people should pay " + twoDecimals.format(pricePerPerson)
				+ " euros.");

		input.close();
    }
}