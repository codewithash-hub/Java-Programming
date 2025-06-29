import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		try {
			File obj = new File("myfile.txt");
		
			if (obj.createNewFile()) {
				System.out.println("File created successfully.");
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}
		

	}

}
