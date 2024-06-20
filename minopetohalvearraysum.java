 import java.util.Comparator;
import java.util.PriorityQueue;

public class minopetohalvearraysum {

    public static void main(String[] args) {
        int arr[]={1,5,8,19},sum=0;
        for(int i=0;i<arr.length;i++)
        {
           sum+=arr[i];
        }
        double s1=sum/2;
        PriorityQueue <Integer> sb=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            sb.add(arr[i]);
        }
        int count=0;
        while(sum>s1)
        {
            int a=sb.remove();
            a=a/2;
            sum-=a;
            sb.add(a);
            count++;
        }
        System.out.println(count);
      }
}
