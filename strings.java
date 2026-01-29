
import java.util.Scanner;

class strings{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        System.out.println("you entered: "+str);
        System.out.println("enter first name and last name");
        //concatination means joining of two strings
        String firstname=sc.nextLine();
        String lastname=sc.nextLine();
        String fullname=firstname+" "+lastname;
        System.out.println("full name is: "+fullname);
        System.out.println(fullname.length());//length of string    
        //charAt() method
        for(int i=0;i<fullname.length();i++){
System.out.println(fullname.charAt(i));
        }
    }
}