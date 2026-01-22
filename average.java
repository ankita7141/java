
import java.util.Scanner;

class average{

    public static float  avg(float a,float b,float c){
    float average=(a+b+c)/3;
    return average;
    };
    public static void main(String[] args) {
        System.out.println("enter three num for average:");
        Scanner sc=new Scanner(System.in);
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        float z=sc.nextFloat();
        float average=avg(x,y,z);
        System.out.println("avg of three num is: "+ average);
        
    }
}