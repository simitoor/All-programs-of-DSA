import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class allpathfromsrctotar {
    static class Edge
    {
        int src;
        int dest;
       Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
             }
    }
      public static void dfs(ArrayList<Edge> arr[],int curr,Queue<Integer> q,int des)
         {  
        for(int i=0;i<arr[curr].size();i++)
        {
            q.add(curr);
            if(curr==des)
             {
                while(!q.isEmpty())
                 {
                    System.out.print(q.remove()+" ");
                 }
                return;
             }
            Edge e=arr[curr].get(i);
              dfs(arr,e.dest, q, des);
            }
         }
    public static void main(String[] args) 
    {
        int V=7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> arr[]=new ArrayList[V];
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=new ArrayList<>();
        }
        arr[0].add(new Edge(0, 3));
        arr[2].add(new Edge(2, 3));
        arr[3].add(new Edge(3, 1));
        arr[4].add(new Edge(4, 1));
        arr[4].add(new Edge(4, 0));
        arr[5].add(new Edge(5, 0));
       arr[5].add(new Edge(5, 2));
       Queue<Integer> q=new LinkedList<>();
       dfs(arr, 5,q, 1);
    }
}
