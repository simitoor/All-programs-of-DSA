import java.util.*;

public class subarraywithsumk 
{
    public static void sub(int arr[],int key)
    {
     HashMap <Integer,Integer> map=new HashMap<>();
     map.put(0,1);
     int sum=0,count=0;
     for(int i=0;i<arr.length;i++)
     {
        sum+=arr[i];
        if(map.containsKey(sum-key))
         {
          count+=map.get(sum-key);
         }
        map.put(sum,map.getOrDefault(sum, 0)+1);
     }
     System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
         int key=-10;
         sub(arr, key);
    }
}
