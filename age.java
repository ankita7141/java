
import java.util.Scanner;

class age{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your running age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("you are adult");
        }
        else{
            System.out.println("you are teenager");
        }
    }
}