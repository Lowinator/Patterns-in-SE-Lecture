package proxyPattern;

public class WebClient {

	public static void main(String[] args) {

		// TOD: Implement the Firewall class. 
		// The firewall should have internally a reference to the network 
		// connection and uses this to create connections if allowed. 
		
		int[] allowedPorts = { 80, 8080 }; 
		Firewall firewall = new Firewall(allowedPorts); 
		
		
		firewall.open("google.com", 80);
		firewall.close();
		
		//should not open the connection
		firewall.open("google.com", 21);		
	}
}
