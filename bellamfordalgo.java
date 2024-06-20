import java.util.*;
public class bellamfordalgo {
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
    public static void dij(ArrayList<Edge> arr,int src,int V)
    {
        int dis[]=new int[V];
        for(int i=0;i<dis.length;i++)
        {
            if(i!=src)
            {
                dis[i]=Integer.MAX_VALUE;
            }
        }
        dis[src]=0;
        for(int i=0;i<V-1;i++)
        {
            for(int j=0;j<arr.size();j++)
            {
                Edge e=arr.get(j);
                int u=e.src;
                int v=e.dest;
                int weight=e.wt;
                if(dis[u]!=Integer.MAX_VALUE && dis[u]+weight<dis[v])
                {
                    dis[v]=dis[u]+weight;
                }
            }
        }
        for(int i=0;i<dis.length;i++)
        {
            System.out.println(dis[i]);
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge> arr=new ArrayList<>();
       arr.add(new Edge(0,1,2));
        arr.add(new Edge(0, 2, 4));
        arr.add(new Edge(1, 2, -4));
        arr.add(new Edge(2, 3, 2));
        arr.add(new Edge(3, 4, 4));
        arr.add(new Edge(4, 1, -1));
        dij(arr,0,5);
    }
}
