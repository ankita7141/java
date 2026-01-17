
import java.util.Scanner;

class table{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int multi=1;
        for(int i=1;i<=10;i++){
multi=x*i;
        System.out.println(x+"*"+i+"="+multi);

        }
    }
}