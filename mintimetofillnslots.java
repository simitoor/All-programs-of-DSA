import java.util.*;
public class mintimetofillnslots {
    public static void min(int arr[],int n,int k)
    {
       Queue <Integer> sb=new LinkedList<>();
       boolean a[]=new boolean[n+1];
       for(int i=0;i<k;i++)
       {
        sb.add(arr[i]);
        a[arr[i]]=true;
       }

       while(sb.size()>0)
       {
        for(int i=0;i<sb.size();i++)
         {
         int curr=sb.remove();
         if(curr-1>=1 && a[curr-1]!=true)
         {
            sb.add(curr-1);
            a[curr-1]=true;
         }
         if(curr+1<=n && a[curr+1]!=true)
         {
            sb.add(curr+1);
            a[curr+1]=true;
         }
       }
       time++;
       }
    System.out.println(time-1);
    }
    public static int time=0;
    public static void main(String[] args) {
        int n = 6;
        int arr[] = { 2, 6 };
        int k=arr.length;
        min(arr,n,k);
    }
}
