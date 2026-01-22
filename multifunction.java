
import java.util.Scanner;

class multifunction{
    public static int multi(int a,int b){
int multi=a*b;
return multi;
    };
    public static void main(String[] args) {
        System.out.println("enter two numbers for product");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

int multiplication=multi(a,b);
System.out.println("product of two num is "+ multiplication);

    }
}