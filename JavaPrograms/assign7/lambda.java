import java.io.*;
import java.util.*;

public class lambda {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter File Name: ");
        String name = sc.nextLine();

        File f = new File(name);

        PrintWriter pw = new PrintWriter( //printwriter class is used to write formatted text to a file
                new FileWriter(f, true)); //FileWriter class is used to write characters to a file, and the second argument 'true' is used to append to the file instead of overwriting it

        System.out.println("Enter Text (type Exit to stop):");

        while (true) {

            String s = sc.nextLine();

            if (s.equalsIgnoreCase("Exit"))//equalsIgnoreCase method is used to compare two strings, ignoring case considerations. It returns true if the strings are equal, ignoring case, and false otherwise
                break;

            pw.println(s);//println method of PrintWriter class is used to write a line of text to the file, and it automatically adds a newline character at the end of the line
        }

        pw.close();

        BufferedReader br = new BufferedReader( //BufferedReader class is used to read text from a character-input stream, buffering characters for efficient reading of characters, arrays, and lines
                new FileReader(f));//FileReader class is used to read characters from a file, and it takes a File object as an argument to specify the file to be read

        String line;

        System.out.println("\nFile Content:");

        while ((line = br.readLine()) != null) {//readLine method of BufferedReader class is used to read a line of text from the file, and it returns null when the end of the file is reached
            System.out.println(line);
        }

        br.close();
    }
}