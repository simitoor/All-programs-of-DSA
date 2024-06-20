import java.util.Comparator;
import java.util.PriorityQueue;

public class kthlargesteleinstream {
   
    
    public static void main(String[] args) {
      int arr[] = {10, 20, 11, 70, 50, 40, 100, 5}; 
      int k = 3,n=arr.length;
      PriorityQueue <Integer> sb=new PriorityQueue<>(Comparator.reverseOrder());
      int sol[]=new int[n];
      for(int i=0;i<k;i++)
      {
        sb.add(arr[i]);
        if(i!=k-1)
        {
            sol[i]=0;
        }
        else{
            int a=sb.remove();
            int b=sb.remove();
            sol[i]=sb.peek();
            sb.add(a);
            sb.add(b);
        }
       
      }
      for(int i=k;i<n;i++)
      {
        sb.add(arr[i]);
        int a=sb.remove();
        int b=sb.remove();
        sol[i]=sb.peek();
        sb.add(a);
        sb.add(b);
      }
      
      for(int i=0;i<sol.length;i++)
      {
        System.out.println(sol[i]);
      }
    }
}
