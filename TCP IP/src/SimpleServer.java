import java.net.*;
import java.io.*;
import java.util.*;

public abstract class SimpleServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5000);
			System.out.println("Server running on port 8001...");
			
			Socket socket = server.accept();
			System.out.println("Clint connect");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String message = in.readLine();
			System.out.println("Clint says: " + message);
			
			out.println("Hello Client, I received: " + message);
			
			socket.close();
			server.close();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
