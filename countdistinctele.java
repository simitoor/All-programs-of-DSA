import java.util.HashSet;


public class countdistinctele {
    public static void main(String[] args) {
        int arr[]={4,3,2,5,6,7,3,4,2,1};
        HashSet <Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            s.add(arr[i]);
        }
      System.out.println(s.size());
    }
}
