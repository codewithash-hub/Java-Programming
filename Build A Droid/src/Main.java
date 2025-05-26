
public class Main {

	public static void main(String[] args) {
		Droid codey = new Droid("Codey");
		
		// Print the droid 
		System.out.println(codey);
		
		// Perform some tasks
		codey.performTask("Cleaning");
		codey.performTask("Dancing");
		codey.performTask("Coding");
		
		// Recharges the droid
		codey.chargeBattery();
		
		// Check battery again
		codey.energyReport();
		

	}

}
