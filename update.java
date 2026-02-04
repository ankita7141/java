import java.util.Scanner;
class update{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int operator= sc.nextInt();
        int n=5;
        int position=1;
        int bitmask=1<<position;
       if(operator==1){
           int newnumber=bitmask | n;
           System.out.println(newnumber);
       }
       else{
           int notbit=~bitmask;
           int newnumber=notbit & n;
           System.out.println(newnumber);
       }
    }
}