import java.util.*;
public class mindepthintree {
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
    static boolean a[]=new boolean[10];
    public static int min=Integer.MAX_VALUE;
   
    public static int mint(ArrayList<Edge> arr[],int curr,int parent[])
    {
      a[curr]=true;
      if(arr[curr].size()==1 && arr[curr].get(0).dest==parent[curr])
      {
      return 0;
      }
      for(int i=0;i<arr[curr].size();i++)
      {
        Edge e=arr[curr].get(i);
        if(!a[e.dest])
        {
            parent[e.dest]=curr;
          min=Math.min(min,mint(arr,e.dest,parent)+1);
        }
      }
      return min;
    }
    public static void main(String[] args) 
    {
        int V=10;
        @SuppressWarnings("unchecked")
           ArrayList<Edge> arr[]=new ArrayList[V];
         for(int i=0;i<arr.length;i++)
         {
           arr[i]=new ArrayList<>();
         }
         arr[1].add(new Edge(1, 8));
         arr[1].add(new Edge(1, 2));
         arr[8].add(new Edge(8, 1));
         arr[8].add(new Edge(8, 6));
         arr[8].add(new Edge(8, 5));
         arr[2].add(new Edge(2, 1));
         arr[2].add(new Edge(2, 9));
         arr[6].add(new Edge(6, 8));
         arr[6].add(new Edge(6, 7));
         arr[5].add(new Edge(5, 8));
         arr[9].add(new Edge(9, 2));
         arr[7].add(new Edge(7, 6));
        int parent[]=new int[10];
         Arrays.fill(parent,-1);
         System.out.print(mint(arr,1,parent));
    }
}
