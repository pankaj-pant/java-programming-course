package app;

import java.text.DecimalFormat;
import java.util.*;

/* Task:
Create a program called ObjectsPizzaArrayList. The program is a variation 
of the ObjectsPizzaArray program.

Use the ArrayList class and create a list of Pizzas. Reuse the Pizza class
 from the previous exercise.

Create three Pizza objects and save their references to the list. See the 
example output for the pizza names and prices. Finally, the program 
should iterate the list and print a pizza list exactly as shown in
 the example output. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();

		pizzaList.add(new Pizza("Diavolo", 8.75));
		pizzaList.add(new Pizza("Frutti al Mare", 9.00));
		pizzaList.add(new Pizza("Alla Pollo", 7.50));

		for (Pizza pizzaObject : pizzaList) {
			System.out.println(pizzaObject.getName() + " ("
					+ twoDecimals.format(pizzaObject.getPrice()).toString().replace('.', ',') + " euros)");
		}

	}

}

class Pizza {
	DecimalFormat twoDecimals = new DecimalFormat("0.00");

	private String name;
	private Double price;

	public Pizza(String name, Double price) {
		this.name = name;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public String toString() {
		return name + " (" + twoDecimals.format(price) + " euros)";
	}

}

