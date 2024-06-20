public class DisjointSetUnion {
    static int n=7;
    static int rank[]=new int[n];
    static int par[]=new int [n];
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
    if(par1==par2)
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
        init();
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));

    }
}
