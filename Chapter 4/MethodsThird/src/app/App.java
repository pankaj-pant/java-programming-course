package app;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Task:
Create a program called MethodsThird that has a method called calculateNetSalary
 that accepts gross salary and income tax rate as its input parameters.
  The method should compute and return the net salary. 
  The main method first inputs gross salary and income tax rate from the 
  user and then calls the calculateNetSalary method with the inputted values.
   Finally, the main method prints the net salary.
 */

public class App {

	public static void main(String[] args) {
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter gross salary: ");
		double grossSalary = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter income tax rate: ");
		double incomeTaxRate = Double.parseDouble(input.nextLine().replace(',', '.'));	
		
		double netSalary = calculateNetSalary(grossSalary, incomeTaxRate);
		
		System.out.print("\n");
		
		System.out.print("The net salary is " + twoDecimals.format(netSalary));
		
		input.close();
	}

	private static double calculateNetSalary(double grossSalary, double incomeTaxRate) {
		return (grossSalary - ((grossSalary * incomeTaxRate) / 100 ));
	}
	
}