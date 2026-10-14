import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 5000);//

        BufferedReader read = new BufferedReader(//
                new InputStreamReader(System.in));//

        PrintWriter out = new PrintWriter(//
                s.getOutputStream(), true);

        System.out.println("Connected to Server");

        String msg;

        while (true) {

            msg = read.readLine();

            out.println( msg);
        }
    }
}

