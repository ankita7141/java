
import java.util.Scanner;

class sum{
    public static void main(String[] args) {
        System.out.println("enter value");
        Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int sum=0;
for(int i=1;i<=x;i++){
sum=sum+i;
}
System.out.println(sum);

    }
}