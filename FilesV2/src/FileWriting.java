import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("myfile.txt");
			
			writer.write("Tomorrow i'm getting 80% on Programming 731!!!");
			writer.close();
			
			System.out.println("successfully written.");
		} catch (IOException e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}
	}
}
