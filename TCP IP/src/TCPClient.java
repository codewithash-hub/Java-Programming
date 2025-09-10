import java.io.*;
import java.net.*;

class TCPClient {
    public static void main(String[] args) throws IOException {
        // Connect to the server (replace "localhost" with server hostname if needed)
        Socket socket = new Socket("localhost", 8001);

        // Input from server
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // Output to server
        PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

        // Input from keyboard
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        // Read initial message from server (if any)
        System.out.println("Connected to server.");

        // Ask user for request
        System.out.print("Client can request for Date or Quit: ");
        String request = userInput.readLine();

        // Send request to server
        out.println(request);

        // Read response from server
        String response = in.readLine();
        System.out.println("Server responds: " + response);

        // Close everything
        in.close();
        out.close();
        socket.close();
    }
}
