
public class Main {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		
		Fruit fruit = new Fruit("Apple", 20, "Fuji");
		Weapon weapon = new Weapon("Katana", 2, 30, "Sword");
		
		inventory.addItems(fruit);
		inventory.addItems(weapon);
		
//		inventory.removeItem(0);
		
		inventory.displayItems();
	}

}
