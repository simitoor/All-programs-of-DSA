
import java.util.*;
public class ropesconnect {
     public static void ropes(int arr[])
        {
            PriorityQueue<Integer> q= new PriorityQueue<Integer>();
            
             int res=0;
            for(int i=0;i<arr.length;i++)
            {
              q.add(arr[i]);
             }
            while(q.size()>1)
            {
              int first=q.remove();
              int second=q.remove();
              res+=first+second;
              q.add(first+second);
            }
            System.out.print(res);
        }    
         public static void main(String args[])
        {
            int arr[] = {2,3,3,4,6};
            ropes(arr);
        }
      } 

