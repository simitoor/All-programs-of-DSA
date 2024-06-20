import java.util.*;
public class ksubarraygreedy {
    public static void fe(int arr[],int k)
    {
        int i=0,minsum=0,sum=0;
        int idx=k;
        while(k>1)
        {
         minsum=Math.max(minsum,arr[arr.length-1]);
         k--;
        }
        if(k==1)
        {
            for(i=arr.length-idx;i>=0;i--)
            {
                sum+=arr[i];
            }
            if(sum>minsum)
            {
                minsum=sum;
            }
        }
        System.out.println(minsum);
    }
    public static void main(String[] args) {
        int arr[]={1,1,2};
        int k=3;
        Arrays.sort(arr);
        fe(arr,k);
    }
}
