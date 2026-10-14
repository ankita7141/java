import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(5000);//port number

        System.out.println("Server is Started");
//
        Socket s = ss.accept();//accept the client connection

        System.out.println("Client is Connected");

        BufferedReader input = new BufferedReader(//read the message from client
                new InputStreamReader(s.getInputStream()));

        String msg;

        while ((msg = input.readLine()) != null) {

            System.out.println("Client  message is: " + msg);
        }

        ss.close();
    }
}