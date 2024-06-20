import java.util.ArrayList;

public class Bridge_in_Graph {
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
      public static void dfs(ArrayList <Edge> arr[],int curr,int parent,int low[],int dt[],boolean vis[],int time)
      {
        vis[curr]=true;
        dt[curr]=low[curr]=++time;
        for(int i=0;i<arr[curr].size();i++)
        {
            Edge e=arr[curr].get(i);
            if(parent==e.dest)
            continue;
            else if(!vis[e.dest])
            {
                dfs(arr,e.dest, curr, low, dt, vis, time);
                low[curr]=Math.min(low[curr],low[e.dest]);
                if(dt[curr]<low[e.dest])
                System.out.println("Bridge:"+curr+"-----"+e.dest);
            }
            else{
                low[curr]=Math.min(low[curr],dt[e.dest]);
            }
        }
      }
      public static void simp(ArrayList<Edge> arr[],int V)
      {
        int low[]=new int[V];
        int dt[]=new int[V];
        boolean vis[]=new boolean[V];
        int time=0;
        for(int i=0;i<V;i++)
        {
          if(!vis[i])
          dfs(arr,i,-1,low,dt,vis,time);
        }
      }
    public static void main(String[] args) {
        int V=5;
            @SuppressWarnings("unchecked")
            ArrayList<Edge> arr[]=new ArrayList[V];
            for(int i=0;i<arr.length;i++)
            {
              arr[i]=new ArrayList<>();
            }
             arr[0].add(new Edge(0, 1));
             arr[0].add(new Edge(0, 2)); 
             arr[0].add(new Edge(0, 3)); 
             arr[1].add(new Edge(1, 0));
             arr[1].add(new Edge(1, 2));
             arr[2].add(new Edge(2, 0));
             arr[2].add(new Edge(2, 1));
             arr[3].add(new Edge(3, 0));
             arr[3].add(new Edge(3, 4));
             arr[4].add(new Edge(4, 3));
             simp(arr, V);
    }
}
