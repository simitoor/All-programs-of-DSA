import java.util.ArrayList;
import java.util.Arrays;

public class Mothervertex {
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
    public static void mother(ArrayList<Edge> arr[],int v)
    {
        int flag=0;
        boolean vis[]=new boolean[v];
        for(int i=0;i<v;i++)
        {
            dfs(arr,i,vis);
            for(int j=0;j<vis.length;j++)
            {
                if(vis[j]==false)
               flag=1;
            }
            if(flag==0){
            System.out.println(i+" is the mother vertex");
            return;
            }
            Arrays.fill(vis,false);
        }
        System.out.println("there is no mother vertex");
    }
    public static void dfs(ArrayList<Edge> arr[],int curr,boolean vis[])
    {
        vis[curr]=true;
        for(int i=0;i<arr[curr].size();i++)
        {
            Edge e=arr[curr].get(i);
            if(!vis[e.dest])
            {
                dfs(arr,e.dest, vis);
            }
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
         arr[0].add(new Edge(0, 2));
         arr[0].add(new Edge(0, 3));
         arr[1].add(new Edge(1, 0));
         //arr[2].add(new Edge(2, 1));
         arr[3].add(new Edge(3, 4));
         mother(arr, V);
    }

}
