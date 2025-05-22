import java.util.ArrayList;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> foods = new ArrayList<>();
		
		System.out.print("Enter the # of food you would like: ");
		int noOfFood = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 1; i < noOfFood + 1; i++) {
			System.out.print("Enter food #" + i + ": ");
			String food = scanner.nextLine();
			foods.add(food);
		}
		System.out.println(foods);
		
		scanner.close();
	}
}
