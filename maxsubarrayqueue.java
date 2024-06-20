import java.util.*;
public class maxsubarrayqueue {
    public static void maximum(Deque<Integer> d,int k,int i)
    {
      
        if(i==k-1)
        {
            System.out.println(max);
            return;
        }
         if(i==0)
         {
            max=d.removeFirst();
         }
      
        int a=d.removeFirst();
        if(a>max)
        {
            max=a;
         }
        maximum(d, k, i+1);
       
        d.addFirst(a);
    }
    public static int max=0;
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        Deque <Integer> q=new LinkedList<>();
        for(int i=0;i<arr.length;i++)
        {
           q.addLast(arr[i]);
        }
        for(int i=0;i<arr.length-1;i++)
        {
          
          maximum(q, 3,0);
          }
       
    }
}
