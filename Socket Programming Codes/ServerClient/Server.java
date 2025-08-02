
package serverclient;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234); // Step 1
        System.out.println("Server started. Waiting for a client...");

        Socket socket = serverSocket.accept(); // Step 2
        System.out.println("Client connected from " +    socket.getInetAddress());

        socket.close();        // Step 3
        serverSocket.close();  // Step 4

    }
}