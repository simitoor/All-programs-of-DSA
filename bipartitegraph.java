import java.util.*;
public class bipartitegraph {
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
    public static boolean cycledetect(ArrayList<Edge> arr[])
    {
        boolean a[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(!a[i])
            {
                if(cycledetectUtil(arr,i,-1,a))
                return true;
            }
        }
        return false;
    }
   
    
    public static boolean cycledetectUtil(ArrayList<Edge> arr[],int curr,int parent,boolean vis[])
    {
          vis[curr]=true;
        for(int i=0;i<arr[curr].size();i++)
         {
            Edge e=arr[curr].get(i);
            if(!vis[e.dest])
            {
                if(cycledetectUtil(arr,e.dest,curr,vis))
                return true;
            }
            else if(vis[e.dest])
            {
                if(e.dest!=parent)
                return true;
            }
         }
        return false;
    }
    public static boolean bi2(ArrayList <Edge> arr[])
    {
      int n=0;
        if(cycledetect(arr)==true)
        {
          Queue<Integer> q=new LinkedList<>();
          boolean visited[]=new boolean[arr.length];
          q.add(0);
         while(!q.isEmpty())
         {
          int curr=q.remove();
          if(!visited[curr])
          {
              n++;
              visited[curr]=true;
              for(int i=0;i<arr[curr].size();i++)
              {
                Edge e=arr[curr].get(i);
                q.add(e.dest);
              }
          }
         }
         if(n%2!=0)
         return false;
        }
        return true;
    }
    public static boolean bipartite(ArrayList <Edge> arr[])
    {
        int col[]=new int[arr.length];
        Queue <Integer> sb=new LinkedList<>();
        for(int i=0;i<col.length;i++)
        {
            col[i]=-1;
        }
         for(int i=0;i<arr.length;i++)
         {
          if(col[i]==-1)
          {
            sb.add(i);
            col[i]=0;
            if(bipartiteUtil(arr, sb, col)==false)
            return false;
          }
         }
          return true;
     }
    public static boolean bipartiteUtil(ArrayList<Edge> arr[],Queue<Integer> q,int col[])
     {
         while(!q.isEmpty())
       {
        int curr=q.remove();
                for(int i=0;i<arr[curr].size();i++)
             {
              Edge e=arr[curr].get(i);
              if(col[e.dest]==-1)
              {
               if(col[curr]==1)
                col[e.dest]=0;
                else if(col[curr]==0)
                col[e.dest]=1;
                q.add(e.dest);
              }
              else
              {
                if(col[e.dest]==col[curr])
                return false;
              }
             }
        }
        return true;
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
         arr[1].add(new Edge(1, 0));
         arr[1].add(new Edge(1, 3));
         arr[2].add(new Edge(2, 0));
         arr[2].add(new Edge(2, 3));
         arr[3].add(new Edge(3, 1));
         arr[3].add(new Edge(3, 2));
       //arr[4].add(new Edge(4, 2));
       // arr[4].add(new Edge(4, 3));
        System.out.println(bipartite(arr));
       //System.out.println(bi2(arr));
    }
}
