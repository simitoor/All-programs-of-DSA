import java.util.*;
public class Articulation_point {
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
      public static void simp(ArrayList<Edge> arr[],int V)
      {
        int low[]=new int[V];
        int dt[]=new int[V];
        boolean vis[]=new boolean[V];
        boolean ap[]=new boolean[V];
        int time=0;
        for(int i=0;i<V;i++)
        {
          if(!vis[i])
          dfs(arr,i,-1,low,dt,vis,time,ap);
        }
      }
      public static boolean ap[]=new boolean[5];
      public static void dfs(ArrayList <Edge> arr[],int curr,int parent,int low[],int dt[],boolean vis[],int time,boolean ap[])
      {
        vis[curr]=true;
        dt[curr]=low[curr]=++time;
        int children=0;
        for(int i=0;i<arr[curr].size();i++)
        {
            Edge e=arr[curr].get(i);
            int neigh=e.dest;
            if(neigh==parent)
            continue;
            else if(vis[neigh])
            low[curr]=Math.min(low[curr],dt[neigh]);
            else{
                dfs(arr,neigh,curr,low,dt,vis,time,ap);
                low[curr]=Math.min(low[curr], low[neigh]);
                if(parent!=-1 && dt[curr]<=low[neigh]){
                System.out.println("AP:"+curr);
                ap[curr]=true;
               
                }
                children++;
            }
        }
        if(parent==-1 && children>1)
        {
            System.out.println("AP:"+curr);
            ap[curr]=true;
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
             for(int i=0;i<V;i++)
             {
              if(ap[i]==true)
              System.out.println(i);
             }
    }
}
