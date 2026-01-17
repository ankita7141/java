
import java.util.Scanner;

class greater{
    public static void main(String[] args) {
        System.out.println("enter two num");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x==y){
            System.out.println("both are equal");
        }
        else if(x>y){
            System.out.println(x+ " is greater than" + y);
        }
        else{
           System.out.println(y+ " is greater than " + x); 
        }
    }
}