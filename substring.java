class substring{
    public static void main(String[] args) {
        String sentence="welcome to java programming";
        //substring() method
        String sub=sentence.substring(11,sentence.length());
        //from index 11 to end and last index is excluded meaning it will go to index 10
        System.out.println(sub);
        String sub2=sentence.substring(0,7);
        //from index 0 to index 6
        System.out.println(sub2);
        String sub3=sentence.substring(8,11);
        //from index 8 to index 9   
        System.out.println(sub3);
        String sub4=sentence.substring(11);
        //from index 11 to end
System.out.println(sub4);
    }
}