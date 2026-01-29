class compareString{
    public static void main(String[] args) {
        String name1="ankita";
        String name2="ankita";
        //compare two strings
        //1 s1>s2: positive value
        //2 s1<s2: negative value
        //3 s1==s2: 0
        if(name1.compareTo(name2)==0){
            System.out.println("both strings are equal");
    }
    else {
        System.out.println("strings are not equal");
    }
}}