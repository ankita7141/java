
import java.io.*;
import java.net.*;
import java.util.*;

public class client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Socket s =
                    new Socket("localhost", 5555);

            InputStream in =
                    s.getInputStream();

            BufferedInputStream bin =
                    new BufferedInputStream(in);

            OutputStream out =
                    s.getOutputStream();

            BufferedOutputStream bout =
                    new BufferedOutputStream(out);


            String msg = "Send Files";

            bout.write(msg.getBytes());

            bout.flush();

            byte[] readFiles = new byte[500];

            bin.read(readFiles);

            String files =
                    new String(readFiles);

            System.out.println(
                    "Available Files :");

            System.out.println(files);

            System.out.print(
                    "Enter the File Number : ");

            String choice = sc.next();

            bout.write(choice.getBytes());

            bout.flush();

            byte[] readFileName =
                    new byte[100];

            bin.read(readFileName);

            String fileName =
                    new String(readFileName).trim();

            FileOutputStream fout =
                    new FileOutputStream(fileName);

            BufferedOutputStream fileBout =
                    new BufferedOutputStream(fout);

            byte[] buffer = new byte[1024];

            int bytes;

            while ((bytes = bin.read(buffer)) != -1) {

                fileBout.write(buffer, 0, bytes);
            }

            fileBout.flush();

            System.out.println(
                    "File Downloaded Successfully...!!");

            fileBout.close();
            fout.close();

            bin.close();
            in.close();

            bout.close();
            out.close();

            s.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}