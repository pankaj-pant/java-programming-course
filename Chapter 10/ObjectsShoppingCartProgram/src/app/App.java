package app;
import java.text.DecimalFormat;
import java.util.*;

/* Task:
Suppose that we want to create a simple shopping cart.
* Products can be added to a shopping cart and removed from
 the shopping cart.
* Each product has product number, name and price.

Example output:
There are no items in the shopping cart.

=== Shopping cart ===
10: Bicycle, quantity: 1, unit price: 500,00, subtotal: 500,00
11: Energy bar, quantity: 5, unit price: 1,50, subtotal: 7,50
12: Water bottle, quantity: 2, unit price: 6,00, subtotal: 12,00
TOTAL PRICE: 519,50 euros

=== Shopping cart ===
10: Bicycle, quantity: 1, unit price: 500,00, subtotal: 500,00
12: Water bottle, quantity: 2, unit price: 6,00, subtotal: 12,00
TOTAL PRICE: 512,00 euros */

public class App {

	public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product product_1 = new Product(10, "Bicycle", 500.00);
        Product product_2 = new Product(11, "Energy bar", 1.50);
        Product product_3 = new Product(12, "Water bottle", 6.00);
        
        System.out.println(cart);

        cart.add(product_1, 1);
        cart.add(product_2, 5);
        cart.add(product_3, 2);    
        System.out.println(cart);
        
        cart.remove(product_2);
        System.out.println(cart);
    }
	
}

class Item {

	private Product product;
	
	private int quantity;
	
	public Item (Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
		
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getSubtotal() {
		return quantity * product.getPrice();
	}
}

class Product {

	private int itemNumber;

	private String product;

	private Double price;

	public Product(int itemNumber, String product, Double price) {
		this.itemNumber = itemNumber;
		this.product = product;
		this.price = price;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public String getProduct() {
		return product;
	}

	public Double getPrice() {
		return price;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}

class ShoppingCart {
	DecimalFormat twoDecimals = new DecimalFormat("0.00");

	private ArrayList<Item> itemList = new ArrayList<Item>();

	public ShoppingCart() {

	}

	public void add(Product product, int quantity) {
		itemList.add(new Item(product, quantity));
	}

	public void remove(Product product) {
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getProduct().equals(product)) {
				itemList.remove(i);
			}
		}
	}

	public double getTotalPrice() {
		double totalPrice = 0;

		for (Item itemObject : itemList) {
			totalPrice += itemObject.getSubtotal();
		}

	

		return totalPrice;
	}

	public String toString() {
		String toString = "";

		if (getTotalPrice() == 0) {

			toString = "There are no items in the shopping cart.\n";

		} else {
			toString = "=== Shopping cart ===\n";

			for (int i = 0; i < itemList.size(); i++) {
				toString += itemList.get(i).getProduct().getItemNumber() + ": "
						+ itemList.get(i).getProduct().getProduct() + ", quantity: " + itemList.get(i).getQuantity()
						+ ", unit price: " + twoDecimals.format(itemList.get(i).getProduct().getPrice())
						+ ", subtotal: " + twoDecimals.format(itemList.get(i).getSubtotal()) + " \n";

			}

			toString += "TOTAL PRICE: " + twoDecimals.format(getTotalPrice()) + " euros\n";

		}
		return toString;
	}

}
