
import java.util.Scanner;



class greeting{
    public static void main(String[] args){
        System.out.println("enter 1 for gm,2 for ohayo and 3 for konichiwa");

        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x==1){
            System.out.println("Good morning!");
        }
        else if (x==2){
            System.out.println("Arigato gojaematsu!");
        }
        else if(x==3){
            System.out.println("konichiwa!");
        }
        else{
            System.out.println("invalid input!");
        }
    }
}