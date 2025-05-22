
public class twoDimArray {

	public static void main(String[] args) {
		int[][] numbers; // null
		numbers = new int[5][3];
		
		numbers[0][0] = 5;
		numbers[4][2] = 5;
		numbers[2][2] = 8;
		numbers[1][0] = 4;
		numbers[1][2] = 10;
		
		// or I can do this in a one line
		// int[][] numbers = new int[5][3];
		
		
		int[][] integers = new int[2][2];
		
		integers[0][0] = 3; // [[3, 0], [0, 0]]
		integers[0][1] = 5; // [[3, 5], [0, 0]]
		
		integers[1][0] = 10; // [[3, 5], [10, 0]]
		integers[1][1] = 2; // [[3, 5], [10, 2]]
		
		// or I can initialize this array in the following way:
		
		int[][] integer = {{3, 5}, {10, 2}};
		
		int length = integer.length;

	}

}
