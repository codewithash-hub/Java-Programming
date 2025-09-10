import java.net.*;
import java.io.*;

public class SimpleClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost", 5000);
		System.out.println("Connected to server.");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		out.println("Hello server!");
		
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		// Ask user for request
        System.out.print("Client can request anything: ");
        
		String response = userInput.readLine();
		System.out.println("Server says: " + response);
		
		in.close();
        out.close();
		socket.close();

	}

}
