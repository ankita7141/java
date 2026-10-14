import java.util.*;
import math.*;
import math.Special.*;

public class Task3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no 1:");
    int no1 = sc.nextInt();
    System.out.println("Enter the no 2:");
    int no2 = sc.nextInt();
    
    Add obj1 = new Add();
    System.out.println("Addition is "+obj1.add(no1, no2));
    
    Sub obj2 = new Sub();
    System.out.println("Difference is "+obj2.sub(no1, no2));
    
    Mul obj3 = new Mul();
    System.out.println("Multiplication is "+obj3.mul(no1, no2));
    
    Div obj4 = new Div();
    System.out.println("Division is "+obj4.div(no1, no2));
    
    EvenOdd obj5 = new EvenOdd();
    System.out.println("Enter the number to check it is even or odd");
    int num = sc.nextInt();
    System.out.println(obj5.isEven(num));
    
    Factorial obj6 = new Factorial();
    System.out.println("Enter the number to find factorial");
    int num1 = sc.nextInt();
    System.out.println("Factorial is "+obj6.fact(num1));
    
    Power obj7 = new Power();
    System.out.println("Enter numbers to find out the power of a given number:");
    System.out.println("Enter the no 1:");
    int p1 = sc.nextInt();
    System.out.println("Enter the no 2:");
    int p2 = sc.nextInt();
    System.out.println("Power is "+obj7.power(p1, p2));

    sc.close();
  }
}
