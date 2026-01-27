class templehole{
    public static void main(String[] args) {
        int n=6;
        int m=3;
        int t=4;

        //4 line star
        for(int i=1;i<=m;i++){
            for(int j=1;j<m+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //triangle vala he

        for(int i=1;i<=t;i++){
//space
for(int j=1;j<=t-i;j++){
    System.out.print(" ");
}
//star 1st aur last line vali
if(i==1 || i==t){
    for(int j=1;j<=2*i-1;j++){
       
       
        System.out.print("*");
    }}

    //space
    else{

        for(int j=1;j<=1;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*i-3;j++){
            System.out.print(" ");
        }
         for(int j=1;j<=1;j++){
            System.out.print("*");
        }
    }
   
    //star
   

System.out.println("");

        }

//square vala he ye
        for(int i=1;i<=1;i++){
            for(int j=1;j<=n+1;j++){
                System.out.print("*");
            }
        }
        System.out.println("");
        for(int i=1;i<=m;i++){
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            for(int j=2;j<=m+3;j++){
                System.out.print(" ");
            }
            for(int j=m+1;j<=m+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        

          for(int i=1;i<=1;i++){
            for(int j=1;j<=n+1;j++){
                System.out.print("*");
            }
        }

       
            
            
           
           
            
        

    }
    }




    
