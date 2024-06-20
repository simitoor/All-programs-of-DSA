import java.util.*;
public class cycledetectundirbfs {
     public static boolean cycledetect(ArrayList<Integer> arr[],int j,boolean vis[])
     {
        int parent[]=new int[arr.length];
       Arrays.fill(parent,-1);
       Queue<Integer> q=new LinkedList<>();
       q.add(j);
       vis[j]=true;
            while(!q.isEmpty())
       {
        int curr=q.remove();
            for(int i=0;i<arr[curr].size();i++)
            {
              int v=arr[curr].get(i);
              if(!vis[v])
              {
                q.add(v);
                vis[v]=true;
                parent[v]=curr;
              }
              else if(parent[curr]!=v) {
                 return true;
              }
            }
        }
        return false;
       }
       public static boolean cycle(ArrayList<Integer> arr[])
       {
        boolean vis[]=new boolean[arr.length];
       Arrays.fill(vis,false);
       
       for(int i=0;i<arr.length;i++)
       {
        if(!vis[i])
        {
            if(cycledetect(arr,i,vis))
            return true;
        }
       }
       return false;
       }
      public static void insert(ArrayList<Integer> a[],int u,int v)
      {
        a[u].add(v);
        a[v].add(u);
      } 
    public static void main(String[] args) 
    {
        int V=10;
    @SuppressWarnings("unchecked")
    ArrayList <Integer> a[]=new ArrayList[V];
    for(int i=0;i<a.length;i++)
    {
        a[i]=new ArrayList<Integer>();
    }
    insert(a,1,9);
    insert(a, 1,5);
    insert(a,5,9);
    insert(a,5,2);
    insert(a,2,4);
    System.out.println(cycle(a));
    }
}
