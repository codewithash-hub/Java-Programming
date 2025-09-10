import java.io.*;
import java.net.*;

public class DemoInetAddress2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		InetAddress address;
		String host;
		
		BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the machines | hostname: ");
		
		host = str.readLine();
		
		address = InetAddress.getByName(host);
		
		System.out.println(address);

	}

}