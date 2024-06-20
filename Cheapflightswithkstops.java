import java.util.*;

public class Cheapflightswithkstops 
{
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
    static class Pair
     {
        int dest;
        int weight;
        int stops;
        Pair(int dest,int weight,int stops)
        {
            this.dest=dest;
            this.weight=weight;
            this.stops=stops;
        }
     }
     public static int cheap(int d,ArrayList<Edge> arr[],int src,int dest,int levels)
     {
       int dis[]=new int[d];
       for(int i=0;i<d;i++)
       {
        if(i!=src)
        dis[i]=Integer.MAX_VALUE;
       }
       Queue<Pair> q=new LinkedList<>();
       q.add(new Pair(src,0, 0));
       while(!q.isEmpty())
       {
        Pair a=q.remove();
        if(a.stops>levels){
        break;
        }
        for(int i=0;i<arr[a.dest].size();i++)
       {
        Edge e=arr[a.dest].get(i);
        int v=e.dest;
        int w=e.wt;
        if(a.weight+w<dis[v] && a.stops<=levels)
        {
            dis[v]=a.weight+w;
            q.add(new Pair(v,dis[v],a.stops+1));
        }
       }
       }
       if(dis[dest]==Integer.MAX_VALUE)
       return -1;
       else 
       return dis[dest];
     }
    public static void main(String[] args) 
    {
        int V=6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> arr[]=new ArrayList[V];
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=new ArrayList<>();
        }
        arr[0].add(new Edge(0, 1, 100));
        arr[0].add(new Edge(0, 2,100));
        arr[1].add(new Edge(1, 2, 100)); 
        arr[1].add(new Edge(1,3, 600));
        arr[2].add(new Edge(2, 3, 200));
        System.out.print(cheap(4,arr,0,3,1));  
    }
}
