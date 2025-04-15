package predictRaise;
import java.util.*;

public class predictRaise {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a salary >> ");
		double sal = keyboard.nextDouble();
		
		System.out.println(raise(sal));
	}
	
	public static double raise(double salary) {
		double newSalary;
		final double RAISE_RATE = 1.10;
		
		newSalary = salary * RAISE_RATE;
		
		return newSalary;
	}
}
