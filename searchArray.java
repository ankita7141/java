
import java.util.Scanner;

class searchArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enyter size of array");
        int size=sc.nextInt();//num.length is indirectly means size of array
        int num[]=new int[size];

System.out.println("enter elements of array");
for(int i=0;i<size;i++){
    num[i]=sc.nextInt();

}
System.out.println("enter value to be searched");
int value=sc.nextInt();
for(int i=0;i<size;i++){
    if(num[i]==value){
        System.out.println("num found at index "+i );

    }

}
    }
}