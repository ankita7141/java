class temple{
    public static void main(String[] args) {
        int m=7;
        int n=4;
        int r=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=3;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(i-1)+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=r;i++){
            for(int j=1;j<=3;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(i-1)+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=r;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}