import java.util.ArrayList;

import java.util.Collections;
public class Kruskalalgo {
    static class Edge implements Comparable<Edge>
    {
        int src;
        int dest;
        int wt;
       Edge(int s,int d,int wt)
        {
            this.src=s;
            this.dest=d;
            this.wt=wt;
        }
        @Override
        public int compareTo(Edge e)
        {
            return this.wt-e.wt;
        }
    }
    public static void s(ArrayList<Edge> arr)
    {
        Collections.sort(arr);
        int cost=0;
       for(int i=0;i<arr.size()-1;i++)
       {
        Edge e=arr.get(i);
        int par1=par[e.src];
        int par2=par[e.dest];
        if(par1==par2)
        {
            continue;
        }
        else{
            union(par1, par2);
            cost+=e.wt;
        }
       }
       System.out.println(cost);
    }
    static int rank[]=new int[4];
    static int par[]=new int [4];
    public static void init()
    {
        for(int i=0;i<par.length;i++)
        {
            par[i]=i;
        }
    }
    public static int find(int x)
    {
     if(x==par[x])
     return x;
     return find(par[x]);
    }
    public static void union(int x,int y)
    {
     int par1=find(x);
     int par2=find(y);
     if(rank[par1]==rank[par2])
     {
         par[par2]=par1;
         rank[par1]++;
     }
     else if(rank[par1]<rank[par2])
     {
         par[par1]=par2;
     }
     else{
         par[par2]=par1;
     }
    }
    public static void main(String[] args) {
        ArrayList <Edge> arr=new ArrayList<>();
        arr.add(new Edge(0,1, 10));
       arr.add(new Edge(0, 3, 30));
        arr.add(new Edge(0,2, 15));
        arr.add(new Edge(1, 3, 40));
        arr.add(new Edge(1, 0, 10));
        arr.add(new Edge(2, 0, 15));
        arr.add(new Edge(2, 3, 50));
        arr.add(new Edge(3, 0, 30));
        arr.add(new Edge(3, 1, 40));
        arr.add(new Edge(3, 2, 50));
        init();
        s(arr);
    }
}

