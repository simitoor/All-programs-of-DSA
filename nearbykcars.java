import java.util.*;
public class nearbykcars {
    static class Info implements Comparable<Info>{
        int x;
        int y;
        int distsq;
        int idx;
        public Info(int x,int y,int distsq,int idx)
        {
           
            this.x=x;
            this.y=y;
            this.distsq=distsq;
            this.idx=idx;
        }
        @Override
        public  int compareTo(Info r)
        {
            return this.distsq-r.distsq;
        }
    }

    public static void main(String[] args) {
       PriorityQueue <Info> s=new PriorityQueue<>();
        int arr[][]={{3,3},{5,-1},{-2,4}};
        for(int i=0;i<arr.length;i++)
        {
            int distsq=arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1];
             s.add(new Info(arr[i][0],arr[i][1] , distsq, i));
        }
        int i=1,k=2;
        while(i<=k)
        {
            System.out.println("C" +s.remove().idx);
            i++;
        }
    }
}
