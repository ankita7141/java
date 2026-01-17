
import java.util.Scanner;

class que1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers for sumation");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.print("sum of " + a +" & " +b + " is "+ sum);//concatenation method
        System.err.printf("\nsum of two num %d & %d is %d",a,b,sum);

    }
}