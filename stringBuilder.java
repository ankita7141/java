

class stringBuilder{

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);
        //print character at index 1
        System.out.println(sb.charAt(1));

        //set character at index 1
        sb.setCharAt(0, 'M');
        System.out.println(sb);
        //insert character at index 5
        sb.insert(5, 'w');
        System.out.println(sb);
        //delete character at index 5
        sb.delete(5,6);
        //6 is excluded
        System.out.println(sb);
        //append method
        sb.append(" world");
        System.out.println(sb);
    sb.length();
    System.out.println("length of stringbuilder is: "+sb.length());
    //reverse method
    sb.reverse();
    System.out.println("reversed stringbuilder is: "+sb);
        
        
        
        
        }
}