class demo{
    private int mic;
    private int cam;
    void fun1(){
        mic=22;
        cam=45;
    }
    void display(){
        System.out.println("value of mic is "+mic);
        System.out.println("value of cam is "+cam);
    }

}


class Example5{
    public static void main(String args[]){
        demo obj=new demo();
        obj.display();

        obj.fun1();
        obj.display();


    }
}