
class A implements Cloneable {

    int i;
    int[] a;

    public A() {
        i = 1;
        a = new int[1];
        a[0] = 1;
    }

    public Object clone() throws CloneNotSupportedException {

        A obj = (A) super.clone();

        obj.a = new int[a.length];

        obj.a[0] = a[0];

        return obj;
    }
}

public class demo {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        A obj = new A();

        A obj2 = (A) obj.clone();

        obj.a[0] = 133;

        System.out.println(obj2.a[0]);
    }
}