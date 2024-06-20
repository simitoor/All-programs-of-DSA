import java.util.*;
public class weakestsolider  {
     static class Info implements Comparable <Info>{
        int count;
        int idx;
        public Info(int count,int idx)
        {
            this.count=count;
            this.idx=idx;
        }
        @Override
        public int compareTo(Info r)
        {
            if(this.count-r.count==0)
            return this.idx-r.idx;
            else{
                return this.count-r.count;
            }
        }
     }
    public static void main(String[] args) {
      PriorityQueue <Info> q=new PriorityQueue<>();
      int arr[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
      int k=0;
       for(int i=0;i<arr.length;i++)
       {
        k=0;
          for(int j=0;j<arr[0].length;j++)
          {
            if(arr[i][j]==1)
            {
                  k++;
            }
          }
          q.add(new Info(k, i));
       }
      for(int i=0;i<2;i++)
       {
        System.out.println("R" +q.remove().idx );
       }
    }
}
