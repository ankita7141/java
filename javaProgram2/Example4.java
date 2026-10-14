class A{
    private static int x;
    void fun1(){
        x=22;

    }
    void fun2(){
        System.out.println("value of x is "+x);
    }
    void fun3(){
        x=45;
    }
}
class Example4{
    public static void main(String args[]){
    A obj1=new A();
    A obj2=new A();
    obj1.fun1();
    obj2.fun3();
    obj1.fun2();
    
//static variable is created only once and shared by all objects of the class. So, the value of x is 45 which is set by obj2.fun3() method.
}
}