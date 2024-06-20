import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activityselection {

    public static void main(String[] args) {
        int start[]={0,3,8,5,1,5};
        int end[]={6,4,9,7,2,9};
        int overall[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++)
        {
            overall[i][0]=i;
            overall[i][1]=start[i];
            overall[i][2]=end[i];
        } 
        Arrays.sort(overall,Comparator.comparingDouble(o->o[2]));
        int maxact=0;
        ArrayList <Integer> idx=new ArrayList<>();
        maxact=1;
        idx.add(overall[0][0]);
        int lastact=overall[0][2];
        for(int i=1;i<start.length;i++)
        {
          if(overall[i][1]>=lastact)
          {
            maxact++;
            lastact=overall[i][2];
            idx.add(overall[i][0]);
          }
        }
        System.out.println("the number of maximum activities is "+maxact);
        for(int i=0;i<idx.size();i++)
        {
            System.out.print("A"+idx.get(i)+" ");
        }
     }
}
