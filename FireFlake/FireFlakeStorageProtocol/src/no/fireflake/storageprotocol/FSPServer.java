package no.fireflake.storageprotocol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FSPServer {
	private int port;

	public FSPServer(int port) {
		this.port = port;
	}

	public void openConnection() {
		try {
			System.out.println("[Server] Waiting for clients...");
			ServerSocket serverSocket = new ServerSocket(this.port);
			Socket clientSocket = serverSocket.accept();
			System.out.println("[Server] Connection established");

			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			System.out.println("[Server] " + in.readLine());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
