import java.util.*;

public class topologicalsorting {
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
        public static void inidx(int indegree[],ArrayList<Edge> arr[])
        {
            for(int i=0;i<arr.length;i++)
            {
             for(int j=0;j<arr[i].size();j++)
            {
              Edge e=arr[i].get(j);
              indegree[e.dest]++;
            }
            }
        }
        public static void topobfs(ArrayList<Edge> arr[])
         {
            int indegree[]=new int[arr.length];
            inidx(indegree,arr);
            Queue<Integer> q=new LinkedList<>();
            for(int i=0;i<indegree.length;i++)
            {
                if(indegree[i]==0){
                q.add(i);
             }
            }
           while(!q.isEmpty())
           {
            int curr=q.remove();
            System.out.print(curr+" ");
            for(int i=0;i<arr[curr].size();i++)
            {
                Edge e=arr[curr].get(i);
                indegree[e.dest]--;
                if(indegree[e.dest]==0)
                q.add(e.dest);
            }
            }
         }
        public static void topo(ArrayList<Edge> arr[])
        {
            boolean vis[]=new boolean[arr.length];
            Stack<Integer> s=new Stack<>();
            for(int i=0;i<arr.length;i++)
            {
                if(!vis[i])
                {
                    topoUtil(arr,i,vis,s);
                }
            }
         while(!s.isEmpty())
         {
            System.out.println(s.pop());
         }
        }
        public static void topoUtil(ArrayList<Edge> arr[],int curr,boolean vis[],Stack<Integer> s)
         {
            vis[curr]=true;
            for(int i=0;i<arr[curr].size();i++)
            {
                Edge e=arr[curr].get(i);
                if(!vis[e.dest])
                {
                    topoUtil(arr,e.dest, vis, s);
                }
            }
            s.add(curr);
         }
        public static void main(String[] args) {
        int V=6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> arr[]=new ArrayList[V];
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=new ArrayList<>();
        }
            arr[2].add(new Edge(2, 3));
          arr[3].add(new Edge(3, 1));
         arr[4].add(new Edge(4, 1));
          arr[4].add(new Edge(4, 0));
       
        arr[5].add(new Edge(5, 0));
        arr[5].add(new Edge(5, 2));
     
       topo(arr);
        //topobfs(arr);
    }
}
