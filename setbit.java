class setbit{
public static void main(String[] args) {
    int n=5;//in binary 101
    int position=1;
    int bitmask=1<<position;
    //left shift operator
    int newnumber=bitmask | n;
    System.out.println(newnumber);//output :7
    //explanation: in binary 101 | 010=111 so new number is 7
    //bitmask is used to set the particular bit in a number
}
}