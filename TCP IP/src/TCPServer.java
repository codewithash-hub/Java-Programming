import java.io.*;
import java.net.*;
import java.util.*;

class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8001);
        System.out.println("Server started on port 8001...");

        for (;;) {
            // Accept client connection
            Socket recSocket = server.accept();
            System.out.println("Client connected: " + recSocket.getInetAddress());

            // Setup I/O streams
            BufferedReader in = new BufferedReader(new InputStreamReader(recSocket.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(recSocket.getOutputStream()), true);

            // Read message from client
            String msg = in.readLine();
            String response;

            if (msg.equalsIgnoreCase("Date")) {
                response = "Client asked for Date and the current date is " + new Date().toString();
            } else if (msg.equalsIgnoreCase("Quit")) {
                response = "Server shutting down...";
                out.println(response);
                recSocket.close();
                server.close();
                System.exit(0);
                return;
            } else {
                response = "Invalid Request";
            }

            // Send response
            out.println(response);

            // Close resources
            in.close();
            out.close();
            recSocket.close();
        }
    }
}
