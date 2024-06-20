public class stockspanmaximum {
    public static void maxi(int arr[])
    {
        int maxprofit=0,buy=arr[0];
       for(int i=1;i<arr.length;i++)
       {
         if(buy>arr[i])
         {
            buy=arr[i];
         }
         else{
            if(arr[i]-buy>maxprofit)
            {
                maxprofit=arr[i]-buy;
            }
         }
       }
       System.out.println(maxprofit);
    }
    public static void main(String[] args) {
        int arr[]={7, 1, 5, 6, 4};
        maxi(arr);
    }
  }
