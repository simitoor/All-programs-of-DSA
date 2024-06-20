import java.util.ArrayList;
public class Finishalltasksgraph {
    public static class Edge
    {
         int src;
         int dest;
        public Edge(int src,int dest)
        {
            this.dest=dest;
            this.src=src;
        }
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
           if(!vis[e.dest] && arr[e.dest]!=null)
           {
               if(cycleUtil(arr,e.dest, stack,vis))
               return true;
           }
       }
       stack[curr]=false;
     
    return false;
     }
    public static void main(String[] args) {
        int arr[][]={{1,0},{0,1}};
        int v=4;
        if(arr.length==1)
        {
            System.out.print("Events will be finished");
        }
        else{
        @SuppressWarnings("unchecked")
        ArrayList<Edge> matrix[]=new ArrayList[v];
        for(int i=0;i<arr.length;i++)
        {
            matrix[i]=new ArrayList<>();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length-1;j++)
            {
            matrix[arr[i][j+1]].add(new Edge(arr[i][j+1],arr[i][j]));
            }
        }
        boolean vis[]=new boolean[v+1];
        for(int i=0;i<vis.length;i++)
        vis[i]=false;
        boolean stack[]=new boolean[v+1];
        for(int i=0;i<stack.length;i++)
        stack[i]=false;
       if(cycleUtil(matrix,0,stack,vis))
       {
        System.out.println("Events will not be finished");
       }
       else{
        System.out.println("Events will be finished");
       }
    }
}
}
