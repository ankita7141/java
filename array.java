//new is used to create a new space in memory
class array{
    public static void main(String[] args) {
        
        // int[] marks=new int[3];
        int marks[]=new int[3];//both methods are correct
        marks[0]=83;
        marks[1]=99;
        marks[2]=88;
        System.out.println("marks in subject 2 is "+ marks[1]);
        for(int i=0;i<=2;i++){
            System.out.println(marks[i]);
        }

        int rmarks[]={85,90,87};
        for(int i=0;i<3;i++){
            System.out.println(rmarks[i]);
        }
    }
}