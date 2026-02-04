class clearbit{
    public static void main(String[] args) {
        int n=5;
        int position=2;
        int bitmask=1<<position;
        int notbit=~bitmask;
        int newnumber=notbit & n;
        System.out.println(newnumber);
    }
}