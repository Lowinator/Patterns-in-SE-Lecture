package proxyPattern;



public class Firewall implements ConnectionInterface {
	
	private int[] allowedPorts = { 80, 8080 };
	
	private NetworkConnection connection;
	
	public Firewall(int[] allowedPorts) {
		this.allowedPorts = allowedPorts;
		connection = new NetworkConnection();
	}

	public int[] getAllowedPorts() {
		return allowedPorts;
	}
	
	@Override
	public void open(String address, int port) {
		// change to "allowedPorts.contains(port)"
		if (port == 80 || port == 8080)
			connection.open(address, port);
		else
			throw new RuntimeException("Connection rejected!");
		
	}

	@Override
	public void close() {
		connection.close();		
	}
	
	public boolean isConnected() {
		return connection.isConnected();
	}
	
}
