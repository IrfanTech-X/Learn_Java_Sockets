
package serverclient;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234); // Step 1
        System.out.println("Connected to the server.");

        socket.close(); // Step 2
    }
}
