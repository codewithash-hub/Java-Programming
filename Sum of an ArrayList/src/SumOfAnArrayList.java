import java.util.ArrayList;

public class SumOfAnArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		int sum = 0;
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		for (int i : numbers) {
			sum += i;
		}
		
		System.out.print(sum);
	}

}
