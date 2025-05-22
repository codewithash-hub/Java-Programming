import java.util.ArrayList;


// Encapsulation
public class Inventory {
	private ArrayList<Items> items;
	
	public Inventory() {
		this.items = new ArrayList<>();
	}
	
	public void addItems(Items item) {
		items.add(item);
	}
	
	public void removeItem(int item) {
		items.remove(item);
	}
	
	public void displayItems() {
		for (Items item : items) {
			System.out.println(item.toString());
		}
	}
}
