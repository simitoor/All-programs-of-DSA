import java.util.*;
public class Kosaraju_algo {
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
       public static void topoSort(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s)
       {
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(!vis[e.dest])
            {
                topoSort(graph,e.dest, vis, s);
            }
        }
        s.push(curr);
       }
       public static void kosa(ArrayList<Edge> graph[],int V)
       {
        Stack <Integer> s=new Stack<>();
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            topoSort(graph, i, vis, s);
        }
        @SuppressWarnings("unchecked")
        ArrayList<Edge> transpose[]=new ArrayList[V];
        for(int i=0;i<transpose.length;i++)
        {
            vis[i]=false;
          transpose[i]=new ArrayList<Edge>();
        }
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e=graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest,e.src));
            }
        }
        while(!s.isEmpty())
        {
            int d=s.pop();
            if(!vis[d])
            {
                System.out.print("SCC->");
                dfs(transpose,d,vis);
                System.out.println();
            }
        }
       }
       public static void dfs(ArrayList<Edge> arr[],int curr,boolean vis[])
       {
        vis[curr]=true;
        System.out.print(curr);
        for(int i=0;i<arr[curr].size();i++)
        {
            Edge e=arr[curr].get(i);
            if(!vis[e.dest])
            dfs(arr,e.dest, vis);
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
             arr[0].add(new Edge(0, 3));
             arr[0].add(new Edge(0, 2)); 
             arr[1].add(new Edge(1, 0));
             arr[2].add(new Edge(2, 1));
             arr[3].add(new Edge(3, 4));
             kosa(arr, V);
         
          
          

}
     
}
