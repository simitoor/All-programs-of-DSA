import java.util.PriorityQueue;
public class slidingwindowsameasmaxsubarray {
    static class Info implements Comparable<Info>
    {
        int idx;
        int data;
        public Info(int data,int idx)
         {
          this.data=data;
          this.idx=idx;
         }
        @Override
        public int compareTo(Info s)
        {
            return s.data-this.data;//descending order
        }
    }
    public static void main(String[] args) 
    {
        PriorityQueue <Info> sb=new PriorityQueue<>();
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int sol[]=new int[arr.length-k+1];
        for(int i=0;i<k;i++)
        {
            sb.add(new Info(arr[i],i));
        }
        sol[0]=sb.peek().data;
        for(int i=k;i<arr.length;i++)
        {
        while(sb.size()>0 && sb.peek().idx<=i-k)
        {
            sb.remove();
        }
        sb.add(new Info(arr[i], i));
        sol[i-k+1]=sb.peek().data;
       }
     for(int i=0;i<sol.length;i++)
     {
        System.out.println(sol[i]);
     }
    }
}
