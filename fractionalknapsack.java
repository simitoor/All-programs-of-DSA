import java.util.Arrays;
import java.util.Comparator;

public class fractionalknapsack {

    public static void main(String[] args) {
        int weight[]={10,20,30};
        int value[]={60,100,120};
       
        double overall[][]=new double[value.length][2];
        for(int i=0;i<value.length;i++)
        {
            overall[i][0]=i;
            overall[i][1]=(value[i]/(double)weight[i]);
        }
        Arrays.sort(overall,Comparator.comparingDouble(o->o[1]));
        int capacity=50,values=0;
        for(int i=overall.length-1;i>=0;i--)
        {
            int idx=(int)overall[i][0];
          if(capacity>=weight[idx])
           {
            values+=value[idx];
            capacity=capacity-weight[idx];
           } 
           else{
            values+=overall[i][1]*capacity;
            break;
           }
         }
         System.out.println(values);
     }
}
