import java.util.Scanner;

class Person {

    int id;
    String name;

    static int count = 1;

    Person(String name) {

        id = count;
        count++;

        this.name = name;
    }

    void display() {

        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
    }
}

public class demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Person arr[] = new Person[10];

        int n = 0;
        int choice;

        do {

            System.out.println("\n1. Create Object");
            System.out.println("2. Display Object");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    arr[n] = new Person(name);

                    System.out.println("Object Created");
                    n++;

                    break;

                case 2:

                    for (int i = 0; i < n; i++) {

                        arr[i].display();
                        System.out.println();
                    }

                    break;

                

                default:

                    System.out.println("invalid input");
            }

        } while (choice != 3);
    }
}