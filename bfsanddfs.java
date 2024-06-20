import java.util.*;
public class bfsanddfs {
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
    //bfsfordisjoint
  /*  public static void bfs(ArrayList<Edge> arr[])
    {
        boolean v[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(!v[i])
            {
                bfsUtil(arr, v);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge> arr[],boolean visited[])
    {
        Queue<Integer> q=new LinkedList<>();
           q.add(0);
       while(!q.isEmpty())
       {
        int curr=q.remove();
        if(!visited[curr])
        {
            System.out.println(curr);
            visited[curr]=true;
            for(int i=0;i<arr[curr].size();i++)
            {
              Edge e=arr[curr].get(i);
              q.add(e.dest);
            }
        }
       }
    }*/ 
    //dfsfordisjointgraph
   /*  public static void dfs(ArrayList<Edge> arr[])
   {
     boolean v[]=new boolean[arr.length];
     for(int i=0;i<arr.length;i++)
     {
        dfsUtil(arr, i, v);
     }
   }
    public static void dfsUtil(ArrayList<Edge> arr[],int curr,boolean a[])
    {
        System.out.println(curr);
        a[curr]=true;
        for(int i=0;i<arr[curr].size();i++)
        {
            Edge e=arr[curr].get(i);
            if(!a[e.dest])
            {
                dfs(arr,e.dest);
            }
        }
    }*/
     public static boolean hasPath(ArrayList<Edge> arr[],int curr,int loc)
     {
        if(curr==loc)
        return true;
        a[curr]=true;
        for(int i=0;i<arr[curr].size();i++)
        {
          Edge e=arr[curr].get(i);
          if(!a[e.dest] && hasPath(arr,e.dest, loc))
          {
            return true;
          }
        }
        return false;
      }
    public static boolean a[]=new boolean[7];
    public static void dfs(ArrayList<Edge> arr[],int curr)
    {
        System.out.println(curr);
        a[curr]=true;
        for(int i=0;i<arr[curr].size();i++)
        {
            Edge e=arr[curr].get(i);
            if(!a[e.dest])
            {
                dfs(arr,e.dest);
            }
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
    public static void bfs(ArrayList<Edge> arr[])
    {
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[arr.length];
        q.add(0);
       while(!q.isEmpty())
       {
        int curr=q.remove();
        if(!visited[curr])
        {
            System.out.println(curr);
            visited[curr]=true;
            for(int i=0;i<arr[curr].size();i++)
            {
              Edge e=arr[curr].get(i);
              q.add(e.dest);
            }
        }
       }
    }
    public static void main(String[] args) {
        int V=7;
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
         arr[2].add(new Edge(2, 4));
         arr[3].add(new Edge(3, 1));
         arr[3].add(new Edge(3, 4));
         arr[3].add(new Edge(3, 5));
         arr[4].add(new Edge(4, 2));
         arr[4].add(new Edge(4, 3));
         arr[4].add(new Edge(4, 5));
         arr[5].add(new Edge(5, 3));
         arr[5].add(new Edge(5, 4));
         arr[5].add(new Edge(5, 6));
         arr[6].add(new Edge(6, 5));
        // bfs(arr);
        //dfs(arr,arr[0].get(0).src);
       // System.out.print(hasPath(arr,0,4));
       
       System.out.println(cycledetect(arr));

}
}
