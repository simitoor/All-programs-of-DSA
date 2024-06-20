import java.util.ArrayList;
import java.util.PriorityQueue;

public class connectcitieswithmincost {
    static class Pair implements Comparable<Pair>
    {
        int node;
        int weight;
        Pair(int node,int weight)
        {
            this.node=node;
            this.weight=weight;
        }
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
    public static void sols(ArrayList<Edge> arr[])
    {
        boolean vis[]=new boolean[arr.length];
       PriorityQueue<Pair> q=new PriorityQueue<>();
       q.add(new Pair(0, 0));
       int cost=0;
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
            q.add(new Pair(e.dest, e.wt));
          }
          }
       }
       System.out.println(cost);
    }
    public static void main(String[] args) {
        int cities[][]={{0,1,2,3,4},
            {1,0,5,0,7},
            {2,5,0,6,0},
            {3,0,6,0,0},
            {4,7,0,0,0}};
            @SuppressWarnings("unchecked")
            ArrayList<Edge> arr[]=new ArrayList[cities.length];
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=new ArrayList<>();
            }
            for(int i=0;i<cities.length;i++)
            {
                for(int j=0;j<cities[0].length;j++)
                {
                    if(cities[i][j]!=0)
                    arr[i].add(new Edge(i,j,cities[i][j]));
                }
            }
            sols(arr);
    }
}
