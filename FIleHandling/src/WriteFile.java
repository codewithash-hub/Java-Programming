import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// Writing Text File also Exception Handling
		try {
			FileWriter writer = new FileWriter("myfile.txt");
			
			// Writing to a file
			writer.write("Files in Java are serious;y good!");
			writer.close();
			
			System.out.println("Successfully written.");
		} catch (IOException e) {
			System.out.print("An error has occured.");
			e.printStackTrace();
		}
	}
}
