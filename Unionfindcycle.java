public class Unionfindcycle {
    Edge edge[];
    class Edge {
        int src, dest;
    };
    int V;
    int E;
    public Unionfindcycle(int v,int e)
    {
       V=v;
       E=e;
       edge =new Edge[E];
       for(int i=0;i<v;i++)
       {
        edge[i]=new Edge();
       } 
    }
    public int find(int par[],int x)
    {
     if(x==par[x])
     return x;
     return find(par,par[x]);
    }
  
    public  int isCycle(Unionfindcycle graph)
    {
        int parent[]=new int [graph.V];
        for(int i=0;i<parent.length;i++)
        {
            parent[i]=i;
        }
       for(int i=0;i<graph.E;i++)
       {
        int x=graph.find(parent,graph.edge[i].src);
        int y=graph.find(parent,graph.edge[i].dest);
        if(x==y)
        return 1;
        graph.union(parent,x,y);
       } 
       return 0;
    }
    public void union(int parent[], int x, int y)
    {
        parent[x] = y;
    }
    public static void main(String[] args) {
      int V = 3, E = 3;
      Unionfindcycle graph = new Unionfindcycle(V, E);
      graph.edge[0].src = 0;
      graph.edge[0].dest = 1;
      graph.edge[1].src = 1;
      graph.edge[1].dest = 2;
    //  graph.edge[2].src = 0;
     // graph.edge[2].dest = 2;
      if (graph.isCycle(graph) == 1)
      System.out.println("Graph contains cycle");
      else
      System.out.println("Graph doesn't contain cycle");
    }
}
