class bitmask{
    public static void  main(String[] args){
        int n=5;//in binary 101
        int position=2;
        int bitmask=1<<position;
        //left shift operator
        if((bitmask & n)==0){
            System.out.println("bit was zero");


        }
        else{
            System.out.println("bit was one");
        }

    }
}//output: bit was one// 
//explanation: in binary 101 & 010=0 so bit was one
//bitmask is used to check the particular bit in a number