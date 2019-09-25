package app;
import java.text.DecimalFormat;

/* Task:
Objects Pizza Program
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
		

		Pizza flavor_1 = new Pizza("Diavolo", 8.75);
		Pizza flavor_2 = new Pizza("Frutti al Mare", 9.00);
		Pizza flavor_3 = new Pizza("Alla Pollo", 7.50);
		
		System.out.println(flavor_1.toString().replace('.', ','));
		System.out.println(flavor_2.toString().replace('.', ','));
		System.out.println(flavor_3.toString().replace('.', ','));
	}

	
	
}
