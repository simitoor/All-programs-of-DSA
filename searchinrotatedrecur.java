public class searchinrotatedrecur {
    public static int sortedsearch(int arr[],int key,int si,int ei)
    {
        if(si>ei)
        {
            return -1;
        }
        int mid=(si+ei)/2;
        if(arr[mid]==key)
        return mid;
        else if(arr[si]<=arr[mid])
        {
            if(arr[si]<=key && key<=arr[mid])
            {
                return sortedsearch(arr,key,si,mid-1);
            }
            else
            {
                return sortedsearch(arr,key,mid+1,ei);
            }
        }
        else
        {
            if(arr[mid]<=key && key<=arr[ei])
            {
               return sortedsearch(arr,key,mid+1,ei);
            }
            else{
                return sortedsearch(arr,key,si,mid-1);
            }
        }
    }
    public static void main(String arg[])
    {
        int arr[]={3,4,5,6,7,
            0,1,2};
        System.out.print(sortedsearch(arr,1,0,arr.length-1));
    }
}
