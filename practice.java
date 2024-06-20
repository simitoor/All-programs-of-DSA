import java.util.*;
public class practice
{
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
   public static void alien(ArrayList<Edge> arr[],String a[])
   {
    for(int j=0;j<a.length-1;j++)
    {
      String s1=a[j];
      String s2=a[j+1];
      int len=Math.min(s1.length(),s2.length());
      for(int i=0;i<len;i++)
      {
        if(s1.charAt(i)!=s2.charAt(i)){
        arr[s1.charAt(i)-'a'].add(new Edge(s1.charAt(i)-'a',s2.charAt(i)-'a'));
        break;
        }
      }
    }
    topo(arr);
   }
    public static void main(String[] args) 
   {
    int V=4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> arr[]=new ArrayList[V];
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=new ArrayList<>();
        } 
        String a[]={"baa","abcd","abca","cab","cad"};
         alien(arr, a);
 }

}
