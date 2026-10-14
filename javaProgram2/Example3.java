class demo{
    private static int x;
    void fun(){ //use static keyword to access fun in main without creating object of class demo
        x=212;
        System.out.println("value of x is "+x);

    }
}


class Example3{
    public static void main(String args[]){
        demo obj=new demo();
        obj.fun();



    }
}