import java.util.InputMismatchException;
import java.util.Scanner;

public class guessingGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			int random = (int)(Math.random() * 10);
			
			System.out.print("Guess a number from 1-10: ");
			
			try {
				
				int guess = scanner.nextInt();

				if (guess == 000) {
					System.exit(0);
				} else {
					if (guess == random) {
						System.out.println("You WON!");
						break;
					} else {
						System.out.println("You LOST!, try again.");
						System.out.println("The number was " + random);
					}	
				}
			} catch (InputMismatchException e) {
				System.out.println("Try to enter a number this time.");
				break;
			}		
		}
		scanner.close();
	}
}
