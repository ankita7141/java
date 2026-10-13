//Example of static method
//static method can be called without creating object of class
class Area{
    static void fun1(){
        System.out.println("Area of Circle is 3.14*r*r");
    }
}
class Example1{
   static void fun1(){
        System.out.println("hey!!");
    }
    static void fun2(){
        System.out.println("hello!!");
    }

    public static void main(String args[]){
        System.out.println("This is main method");
        fun1();
        Example1.fun2();
        Area.fun1();
    }
}