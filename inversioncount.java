public class inversioncount {
    public static void mergesort(int arr[],int si,int mid,int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si;
        int k=0;
        int j=mid+1;
        while(i<=mid && j<=ei)
        {
            if(arr[i]>arr[j])
            {
              temp[k]=arr[j];
              count+=(mid-i+1);
               j++;
            }
            else
            {
                temp[k]=arr[i];
                i++;
            }
            k++;
         }
         while(i<=mid)
         {
            temp[k]=arr[i];
            i++;
            k++;
            
         }
         while(j<=ei)
         {
            temp[k]=arr[j];
            j++;
            k++;
         }
         for(k=0,i=si;k<temp.length;i++,k++)
         {
            arr[i]=temp[k];
         }
    }
    public static void merge(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=(si+ei)/2;
        merge(arr,si,mid);
        merge(arr,mid+1,ei);
        mergesort(arr,si,mid,ei);
    }
    
    static int count=0;
    //recursive approach
   /*  public static void countinver(int arr[],int idx,int count)
    {
        if(idx==0)
        {
            System.out.print(count);
            return;
        }
        for(int i=0;i<idx;i++)
        {
            if(arr[i]>arr[idx])
            {
                count++;
            }
        }
        countinver(arr, idx-1, count);
    }*/
    public static void main(String []arg)
    {
        int arr[]={2, 4, 1, 3, 5};
        merge(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.print(count);
    }
}
