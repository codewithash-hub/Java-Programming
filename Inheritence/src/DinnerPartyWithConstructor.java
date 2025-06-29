
public class DinnerPartyWithConstructor extends PartyWithConstructor2{
	private int dinnerChoice;
	
	public DinnerPartyWithConstructor(int numGuests) {
		super(numGuests);
	}
	
	public int getDinnerChoice() {
		return dinnerChoice;
	}
	
	public void setDinnerChoice(int dinnerChoice) {
		this.dinnerChoice = dinnerChoice;
	}
	
	@Override
	public void displayInvitation() {
		System.out.println("Please come to my dinner party.");
	}
}
