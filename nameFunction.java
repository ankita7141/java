
import java.util.Scanner;

class nameFunction{
    public static void printName(String name){
        System.out.println(name);
        
    };
    public static void main(String[] args) {
        System.out.println("enter your name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printName(name);

    };
}