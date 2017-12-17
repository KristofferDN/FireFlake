package no.fireflake.storageprotocol;

public class FSP {
	
	public static void main(String[] args) {
		FSPServer server = new FSPServer(55037);
		FSPClient client = new FSPClient("localhost", 55037);
		
		server.openConnection();
		client.openConnection();
	}
	
}
