import java.io.*;
import java.util.*;

class Student implements Serializable {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class readWrite {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Create");
        System.out.println("2.Display");

        int ch = sc.nextInt();

        FileOutputStream fos = new FileOutputStream("student.txt", true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        if (ch == 1) {

            System.out.print("Enter Id: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            Student s = new Student(id, name);

            oos.writeObject(s);

            System.out.println("Object Saved");
        }

        oos.close();

        if (ch == 2) {

            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();

            System.out.println("Id = " + s.id);
            System.out.println("Name = " + s.name);

            ois.close();
        }
    }
}