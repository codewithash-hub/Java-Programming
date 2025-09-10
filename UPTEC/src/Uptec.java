import java.net.*;

public class Uptec {
	static InetAddress adr;
	byte[] numadd;
	byte[] numadr;
	String Addrmsg;
	
	Uptec() throws UnknownHostException {
		adr = InetAddress.getLocalHost();
		numadr = adr.getAddress();
		Addrmsg = adr.getHostName() + "/";
	}
	
	public String toString() {
		for (int i = 0; i < numadr.length; i++)
			Addrmsg += (numadr[i] & 255) + ".";
		
			return "The local machine|’s address is :" + Addrmsg;
	}
}
