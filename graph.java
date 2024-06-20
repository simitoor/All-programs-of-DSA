import java.util.*;
public class graph {
    static class Edge
    {
        int src;
        int dest;
        int weight;
        Edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
         }
   public static void main(String[] args) {
     int V=5;
     @SuppressWarnings("unchecked")`  
      ArrayList<Edge> arr[]=new ArrayList[V];
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=new ArrayList<>();
      }
      arr[0].add(new Edge(0, 1, 5));
      arr[1].add(new Edge(1, 2, 1));
      arr[1].add(new Edge(1, 0, 5));
      arr[1].add(new Edge(1, 3, 3));
      arr[2].add(new Edge(2, 1, 1));
      arr[2].add(new Edge(2, 3, 1));
      arr[2].add(new Edge(2, 4, 2));
      arr[3].add(new Edge(3, 1, 3));
      arr[3].add(new Edge(3, 2, 1));
      arr[4].add(new Edge(4, 2, 2));
      for(int i=0;i<arr[2].size();i++)
      {
        Edge e=arr[2].get(i);
        System.out.println(e.dest);
      }
   } 
}
