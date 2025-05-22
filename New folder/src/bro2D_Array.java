
public class bro2D_Array {

	public static void main(String[] args) {
		// 2D array = an array of arrays
		
		String[][] cars = new String[3][3];
		
		// row 1
		cars[0][0] = "Camero";
		cars[0][1] = "Covertte";
		cars[0][2] = "Sliverado";
		
		// row 2
		cars[1][0] = "Mustang";
		cars[1][1] = "Ranger";
		cars[1][2] = "F-150";
		
		// row 3
		cars[2][0] = "Ferari";
		cars[2][1] = "Lambo";
		cars[2][2] = "Tesla";
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println();
			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
			}
		}
	}

}
