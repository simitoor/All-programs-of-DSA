public class lastoccurencefib {
    public static int firstoccur(int arr[],int i,int key)
    {
      if(arr[i]==key)
      {
        return i;
      }
      if(i==0)
      {
        return -1;
      }
      return firstoccur(arr, i-1, key);
    }
    public static void main(String args[])
    {
        int arr[]={1,4,4,4,4};
        int n=arr.length-1;
      System.out.print(firstoccur(arr,n,4));
    }
}
