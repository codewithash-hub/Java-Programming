
public class Droid {
	// Instance variable
	String name;
	int batteryLevel;
	
	// Constructor
	public Droid(String name) {
		this.name = name;
		batteryLevel = 100;
	}
	
	// Method to perform a task
	public void performTask(String task) {
		System.out.println(name + " is performing task: " + task);
		batteryLevel -= 10;
		if (batteryLevel < 10) {
			System.out.print("Can't perform a task. Battery level is at " + batteryLevel);
			System.exit(0);
		}
	}
	
	// Method to report battery level
	public void energyReport() {
		System.out.println(name + " has " + batteryLevel + "% battery left.");
	}
	
	// Method to charge the battery
	public void chargeBattery() {
		batteryLevel = 100;
		System.out.println(name + " is fully charged.");
	}
	
	// Method to return the status of the droid
	public String toString() {
		return "Hello, I'm the droid: " + name;
	}
}
