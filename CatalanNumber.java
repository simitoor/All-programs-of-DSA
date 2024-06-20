public class CatalanNumber {
    public static int cattabl(int n,int C[])
    {
      
       C[0]=1;
       C[1]=1;
       for(int j=2;j<=n;j++)
       {
        C[j]=0;
           for(int i=0;i<=j-1;i++)
        {
             C[j]+=C[i]*C[j-i-1];
        }
       
    }
        return C[n];
    }
    public static int catmem(int n,int C[])
     {
       
        if(n==0||n==1)
        return C[n]=1;
        if(C[n]!=-1)
        return C[n];
        int ans=0;
        for(int i=0;i<=n-1;i++)
        {
            ans+=catmem(i, C)*catmem(n-i-1, C);
        }
        return C[n]=ans;
     }
    public static void main(String[] args) {
       int n=4;
       int C[]=new int[n+1];
       for(int i=0;i<C.length;i++)
       C[i]=-1;
       System.out.println(cattabl(n,C)); 
    }
}
