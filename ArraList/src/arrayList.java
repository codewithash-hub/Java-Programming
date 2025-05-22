import java.util.ArrayList;
import java.util.Collections;

public class arrayList {

	public static void main(String[] args) {
		// ArrayList = A resizeable array that stores objects (autoboxing).
		//				Arrays are fixed in size, ArrayLists can change.
		
		ArrayList<Double> list = new ArrayList<>();
		ArrayList<String> fruits = new ArrayList<>();
		
		list.add(3.14);
		list.add(1.01);
		list.add(2.3);
		
		// Add fruits to "fruits" ArrayList
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Coconut");
		
		fruits.remove(0);
		fruits.set(2, "Pineapple");
		
		// to sort an ArrayList, you first need to import the collections module.
		Collections.sort(list);
		Collections.sort(fruits);
		
		System.out.println(list);
		System.out.println(fruits);
		System.out.println(fruits.get(2));
		System.out.println(fruits.size());
		
		// Using advanced for loop to print an ArrayList.
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

	}

}
