import java.util.Scanner;

class twodArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and columns");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int[][] arr=new int[rows][columns];
        System.out.println("enter elements of array");
        //input elements in 2d array
        
        for(int i=0;i<rows;i++){//rows
            for(int j=0;j<columns;j++){//columns
                arr[i][j]=sc.nextInt();//input elements
            }
        }
        System.out.println("elements in 2d array are");
        //print elements of 2d array
        for(int i=0;i<rows;i++){

            for(int j=0;j<columns;j++){

                System.out.println(arr[i][j] +" ");//print elements
            }
            System.out.println();
        }


    }
}