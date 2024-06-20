import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {
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
    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair(int n,int path)
        {
            this.n=n;
            this.path=path;
        }
        @Override
        public int compareTo(Pair p2)
        {
            return this.path-p2.path;
        }
    }
    public static void dij(ArrayList<Edge> arr[],int src)
    {
        int dis[]=new int[arr.length];
        for(int i=0;i<dis.length;i++)
        {
            if(i!=src)
            dis[i]=Integer.MAX_VALUE;
        }
        PriorityQueue<Pair> q=new PriorityQueue<>();
        q.add(new Pair(src,0));
        boolean vis[]=new boolean[arr.length];
        while(!q.isEmpty())
        {
            Pair curr=q.remove();
            if(!vis[curr.n])
            {
                vis[curr.n]=true;
                for(int i=0;i<arr[curr.n].size();i++)
                {
                    Edge e=arr[curr.n].get(i);
                    int v=e.dest;
                    int u=e.src;
                    int weight=e.wt;
                    if(dis[u]+weight<dis[v])
                    {
                        dis[v]=dis[u]+weight;
                        q.add(new Pair(v,dis[v]));
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(dis[i]);
        }
    }
    public static void main(String []a)
    {
        int V=6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> arr[]=new ArrayList[V];
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=new ArrayList<>();
        }
        arr[0].add(new Edge(0,1,2));
        arr[0].add(new Edge(0, 2, 4));
        arr[1].add(new Edge(1,3, 7));
        arr[1].add(new Edge(1, 2, 1));
        arr[2].add(new Edge(2, 4, 3));
        arr[3].add(new Edge(3, 5, 1));
        arr[4].add(new Edge(4, 3, 2));
        arr[4].add(new Edge(4, 5, 5));
        dij(arr, 0);
    }
}
