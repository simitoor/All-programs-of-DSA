import java.util.*;
public class cycledetectdirected {
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
    public static boolean cycle(ArrayList<Edge> arr[])
    {
        boolean stack[]=new boolean[7];
        boolean vis[]=new boolean[7];
        for(int i=0;i<arr.length;i++)
        {
            if(!vis[i])
            {
              if(cycleUtil(arr,i, stack,vis))
              return true;
        }
       }
        return false;
     }
   public static boolean cycleUtil(ArrayList<Edge> arr[],int curr,boolean stack[],boolean vis[])
     {
        vis[curr]=true;
        stack[curr]=true;
        for(int i=0;i<arr[curr].size();i++)
        {
            Edge e=arr[curr].get(i);
            if(stack[e.dest]==true)
            return true;
            if(!vis[e.dest])
            {
                if(cycleUtil(arr,e.dest, stack,vis))
                return true;
            }
        }
        stack[curr]=false;
        return false;
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
         arr[1].add(new Edge(1, 3));
         arr[2].add(new Edge(2, 3));
         arr[3].add(new Edge(3, 0));
          System.out.println(cycle(arr));
     
      
    }
}
