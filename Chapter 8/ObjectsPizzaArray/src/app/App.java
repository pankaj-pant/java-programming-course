package app;

import java.text.DecimalFormat;

/* Task:
Objects Pizza Program with Arrays.
Example output:
Diavolo (8,75 euros)
Frutti al Mare (9,00 euros)
Alla Pollo (7,50 euros) */

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



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Pizza[] pizzaArray = new Pizza[3];

		pizzaArray[0] = new Pizza("Diavolo", 8.75);
		pizzaArray[1] = new Pizza("Frutti al Mare", 9.00);
		pizzaArray[2] = new Pizza("Alla Pollo", 7.50);

		for (Pizza pizzaObject : pizzaArray) {
			System.out.println(pizzaObject.getName() + " ("
					+ twoDecimals.format(pizzaObject.getPrice()).toString().replace('.', ',') + " euros)");

		}

	}
}
