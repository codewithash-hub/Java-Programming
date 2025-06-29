import java.util.*;

public class UseDinnerParty {

	public static void main(String[] args) {
		int guests = 0;
		int choice;
		
//		PartyWithConstructor aParty = new PartyWithConstructor();
		DinnerPartyWithConstructor aDinnerParty = new DinnerPartyWithConstructor(guests);
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of guests for the party  >> ");
		guests = keyboard.nextInt();
		
//		aParty.setGuests(guests);
//		System.out.println("The party has " + aParty.getGuests() + " guests.");
//		aParty.displayInvitation();
		
		System.out.print("Enter the number of guests for the dinner party  >> ");
		aDinnerParty.setGuests(guests);
		
		System.out.print("Enter the menu option 1 -- for chicken or 2 for beef  >> ");
		choice = keyboard.nextInt();
		aDinnerParty.setDinnerChoice(choice);
		System.out.println("Menu option  " + aDinnerParty.getDinnerChoice() + " will be served.");
		aDinnerParty.displayInvitation();
		
		keyboard.close();
	}

}
