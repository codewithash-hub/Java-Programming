package predictRaiseV2;
import java.util.*;

public class Raise {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a salary >> ");
		
		double sal = keyboard.nextDouble();
		
		System.out.print(raise(sal));
	}

	public static double raise(double salary) {
		double newAmount;
		double bonusAmount;
		final double RAISE_RATE = 1.10;
		
		newAmount = salary * RAISE_RATE;
		bonusAmount = calculateBonus(newAmount);
		newAmount = newAmount + bonusAmount;
		
		return newAmount;
	}
	
	public static double calculateBonus(double salary) {
		final double BONUS_AMOUNT = 50.00;
		salary = salary + BONUS_AMOUNT;
		
		return salary;
	}
}
