import java.util.*;

public class primalgo {
    static class Pair implements Comparable<Pair>
    {
        int node;
        int weight;
        public Pair(int node,int weight)
        {
            this.node=node;
            this.weight=weight;
        }
        @Override
        public int compareTo(Pair p1)
        {
            return this.weight-p1.weight;
        }
    }
    static class Edge
    {
        int src;
        int dest;
        int wt;
       Edge(int s,int d,int wt)
        {
            this.src=s;
            this.dest=d;
            this.wt=wt;
        }
    }
    public static int cost=0;
    public static void sols(ArrayList<Edge> arr[])
    {
        boolean vis[]=new boolean[arr.length];
        PriorityQueue<Pair> q=new PriorityQueue<>();
        q.add(new Pair(0, 0));
        while(!q.isEmpty())
        {
            Pair a=q.remove();
            if(!vis[a.node])
            {
               vis[a.node]=true;
               cost+=a.weight;
               for(int i=0;i<arr[a.node].size();i++)
               {
                Edge e=arr[a.node].get(i);
                q.add(new Pair(e.dest,e.wt));
              }
            }
        }
    }
    public static void main(String[] args) {
        int V=4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> arr[]=new ArrayList[V];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=new ArrayList<>();
        }
        arr[0].add(new Edge(0, 1, 10));
        arr[0].add(new Edge(0,3, 30));
        arr[0].add(new Edge(0, 2, 15));
        arr[1].add(new Edge(1, 3, 40));
        arr[2].add(new Edge(2, 0, 15));
        arr[2].add(new Edge(2, 3, 50));
        arr[3].add(new Edge(3, 0, 30));
       sols(arr);
       System.out.println(cost);
    }
}
