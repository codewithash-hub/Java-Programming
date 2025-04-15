import java.util.Scanner;

public class ParadiceInfo {
	public static void main(String[] args) {
		double price;
		double discount;
		double savings;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter cutoff price for discount >> ");
		price = keyboard.nextDouble();
		
		System.out.print("Enter a discount rate as a whole number >> ");
		discount = keyboard.nextDouble();
		
		savings = computeDiscountInfo(price, discount);
		
		System.out.println("Special this week on any service ober " + price);
		System.out.println("Discount of " + discount + " percent");
		System.out.println("That's a savings of at least R" + savings);
	}
	
	public static double computeDiscountInfo(double price, double discountRate) {
		double savings;
		savings = price * discountRate / 100;
		return savings;
	}

}
