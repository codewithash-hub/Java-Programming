import java.io.File;
import java.io.IOException;

public class Creating {

	public static void main(String[] args) {
		// Creatinng the File also Handling the Exception
		try {
			File obj = new File("myfile.txt");
			
			// Creating File
			if (obj.createNewFile()) {
				System.out.println("File Created: " + obj.getName());
			} else {
			 	System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}
	}
}
