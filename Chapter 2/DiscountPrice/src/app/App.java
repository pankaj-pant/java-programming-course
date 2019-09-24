package app;
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* Task:
Create a program called DiscountPrice that first inputs the original price
 (decimal value) and discount percentage (decimal value) from the user. 
 Then the program calculates and prints the final price with two decimals. */

public class App {
    public static void main(String[] args) throws Exception {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter original price: ");
		BigDecimal price = input.nextBigDecimal();
				
		System.out.print("Enter discount percentage: ");
		BigDecimal discount = input.nextBigDecimal();
		
		//double finalPrice = (price * (1 - (discount / 100)));
		BigDecimal finalPrice = price.multiply(new BigDecimal("1").subtract(discount.divide(new BigDecimal("100"))));
				
		finalPrice = finalPrice.setScale(2, BigDecimal.ROUND_HALF_UP);

		System.out.print("The final price is " + twoDecimals.format(finalPrice));
		input.close();
    }
}