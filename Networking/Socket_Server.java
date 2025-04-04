package Networking;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.*;
import java.io.IOException;

public class Socket_Server {
    public static void main(String[] args)
    {
       try {
           System.out.println("Server is Started...");
           ServerSocket ss = new ServerSocket(9999);

           System.out.println("__Server is waiting for client Request__");
           Socket s = ss.accept(); // when ss will be accepted create new object oif socket

           System.out.println("Client Connected...");

           // reading the client data
           BufferedReader br = new BufferedReader(new InputStreamReader((s.getInputStream())));
           String str = br.readLine();

           System.out.println("Client Data: " + str);
       }
       catch (SocketException e) {
           System.out.println("Client disconnected unexpectedly: " + e.getMessage());
       } catch (IOException e) {
           e.printStackTrace();
       }

    }
}
