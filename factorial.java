
import java.util.Scanner;

class factorial{
    public static int fact(int n){
       
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
            
        }
return factorial;
    }
    public static void main(String[] args) {
        System.out.println("enter a num to find factorial");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int factorial=fact(num);
System.out.println("factorial of num is : "+ factorial);
        
    }
}










//we can use recursion method also