import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class DeShaw_Q3_smallestmex {
    public static int findKthSmallestMex(List<Integer> arr,int e)
    {
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> sol=new ArrayList<>();
        ArrayList<Integer> s=new ArrayList<>();
     for (int i = 0; i < arr.size(); i++)
     {
      for (int j = i; j < arr.size(); j++) 
      {
         for (int k = i; k <=j; k++){
          
            s.add(arr.get(k));
         }
         
           int b=1;
          while(s.contains(b)!=false)
          {
            b++;
          }
          sol.add(b);
          s.clear();
                }
            }  
            if (e> sol.size()) {
            return -1; // Return -1 if k exceeds the number of MEX values
        }
        
        Collections.sort(sol);
         System.out.print(sol);
        return sol.get(e-1);
    }
     public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(3,2,1,4));
        int k = 8;

        int kthSmallestMex = findKthSmallestMex(arr, k);
        System.out.println("Kth smallest MEX: " + kthSmallestMex);
    }
}
