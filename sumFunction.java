
import java.util.Scanner;

class sumFunction{
public static int printSum(int a,int b){
return a+b;
};
public static void main(String[] args) {
    
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    System.out.println("sum of two num is "+printSum(n,m));

    
    
}
}