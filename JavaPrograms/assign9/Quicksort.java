
class Quick {

       public int partition(int[] arr,int l,int r){
            int pivot=arr[r];
            int i=l-1;
            for(int j=l;j<=r-1;j++){
                if(arr[j]<pivot){
                       i++;
                       swap(arr,i,j);
                 }
             }
            
            swap(arr,i+1,r);
            return i+1;
      }

        public void swap(int[] arr,int i,int j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
      }

       public void quickSort(int[] arr,int l,int r){
        if(l<r){
            int p=partition(arr,l,r);

            quickSort(arr,l,p-1);
            quickSort(arr,p+1,r);
            
        }
      }
}

class Quicksort{
    public static void main(String[] args){
        int[] arr={90,5,-4,55,1};
        Quick q=new Quick();

        int p=q.partition(arr,0,arr.length-1);

        Runnable r=()->{
            q.quickSort(arr,0,p-1);
        };
        Runnable r2= ()->{
            q.quickSort(arr,p+1,arr.length-1);
        };

        Thread t=new Thread(r);
        Thread t2=new Thread(r2);
        t.start();
        t2.start();

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
