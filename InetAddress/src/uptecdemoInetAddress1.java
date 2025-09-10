import java.net.*;

public class uptecdemoInetAddress1 {

	public static void main(String[] args) throws UnknownHostException{
		InetAddress idr;
		
		idr = InetAddress.getLocalHost();
		
		System.out.println(idr);

	}

}
