package proxyPattern;

public interface ConnectionInterface {
	
	public void open(String address, int port);
	
	public void close();
	

}
