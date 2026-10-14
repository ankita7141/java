
import java.io.*;
import java.net.*;

class ClientThread extends Thread {

    Socket connection;

    public ClientThread(Socket s) {
        connection = s;
    }

    public void run() {

        try {

            InputStream in = connection.getInputStream();
            BufferedInputStream bin =
                    new BufferedInputStream(in);

            OutputStream out =
                    connection.getOutputStream();

            BufferedOutputStream bout =
                    new BufferedOutputStream(out);


            byte[] readMsg = new byte[100];

            bin.read(readMsg);

            String msg = new String(readMsg).trim();

            System.out.println("Client Message : " + msg);


            File folder = new File("files");

            String[] fileArr = folder.list();

            String files = "";

            for (int i = 0; i < fileArr.length; i++) {

                files += (i + 1) + ". " +
                        fileArr[i] + "\n";
            }

            byte[] sendFiles = files.getBytes();

            bout.write(sendFiles);

            bout.flush();


            byte[] readChoice = new byte[100];

            bin.read(readChoice);

            int choice =
                    Integer.parseInt(
                            new String(readChoice).trim());

            System.out.println(
                    "Requested File : "
                            + fileArr[choice - 1]);


            String fileName =
                    fileArr[choice - 1];

            bout.write(fileName.getBytes());

            bout.flush();


            FileInputStream fin =
                    new FileInputStream(
                            "files/" + fileName);

            BufferedInputStream fileBin =
                    new BufferedInputStream(fin);

            byte[] buffer = new byte[1024];

            int bytes;

            while ((bytes = fileBin.read(buffer)) != -1) {

                bout.write(buffer, 0, bytes);
            }

            bout.flush();

            System.out.println("File Sent Successfully");


            fileBin.close();
            fin.close();

            bin.close();
            in.close();

            bout.close();
            out.close();

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class server {

    public static void main(String[] args) {

        try {

            ServerSocket ss =
                    new ServerSocket(5555);

            System.out.println("Server Started...");

            while (true) {

                Socket s = ss.accept();

                System.out.println("Client Connected");

                ClientThread ct =
                        new ClientThread(s);

                ct.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}