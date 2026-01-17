
import java.util.Scanner;

class oddeven{
    public static void main(String[] args) {
        System.out.println("enter a num");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}