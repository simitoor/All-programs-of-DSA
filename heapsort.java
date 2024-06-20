public class heapsort {
      private static void hashify(int i,int arr[],int n)
     {
        int maxidx=i;
        int leftc=2*i+1;
        int rightc=2*i+2;
        if(leftc<n && arr[leftc]>arr[maxidx])
        {
            maxidx=leftc;
        } 
        if(rightc<n && arr[rightc]>arr[maxidx])
        {
            maxidx=rightc;
        }
        if(maxidx!=i)
        {
            int ir=arr[i];
            arr[i]=arr[maxidx];
            arr[maxidx]=ir;
            hashify(maxidx,arr,n);
        }
     }  
     public static void lastlevel(int arr[])
     {
        int n=arr.length;
        for(int i=n/2;i>=0;i--)
        {
              hashify(i,arr,n);
        }
        for(int i=n-1;i>=0;i--)
        {
        int temp=arr[0];
        arr[0]=arr[i];
        arr[i]=temp;
        hashify(0,arr,i);
        }
    }
      public static void main(String[] args) {
        int arr[]={4,2,1,5,3};
      lastlevel(arr);
      for(int i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]);
      }
    }
}
