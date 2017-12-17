package no.fireflake.storageprotocol;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class FSPClient {
	private boolean running;
	private String adress;
	private int port;

	public FSPClient(String adress, int port) {
		this.adress = adress;
		this.port = port;
	}

	public void openConnection() {
		try {
			System.out.println("[Client] Client started");
			Socket clientSocket = new Socket(adress, port);
			running = true;
			
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			out.println("Test!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
