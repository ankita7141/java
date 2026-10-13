class Ankita{
    int x;//instance/object member variable
    int y;//instance/object member variable
    void fun1(){//instance/object member function
        System.out.println("This is fun1 method");

    }
}



class Example2{
    static void main(String args[]){

        Ankita obj=new Ankita();
        obj.fun1();
        obj.x=10;
        
        System.out.println("value of x is "+obj.x);
        System.out.println("value of y is "+obj.y); //default value of y is 0

    }
}
