public class Climbing_Stairs {
     public static int count=0;
    public static int climb(int n,int dest)
    {
        if(n==dest)
        return 1;
        if(n<dest)
        return 0;
        count=climb(n-1, dest)+climb(n-2, dest);
        return count;
    }
    public static int climbmem(int n,int curr,int p[])
    {
        if(n==curr){
        p[0]=1;
        return p[0];
        }
        if(n<curr)
        return 0;
       if(p[n]!=0)
       return p[n];
      p[n]=climbmem(n-1,curr,p)+climbmem(n-2,curr,p);
        return p[n];
    }
    public static int climbtabl(int n,int dest)
    {
       int ans[]=new int[dest+1];
       ans[0]=1;
       for(int i=1;i<ans.length;i++)
       {
        if(i>1)
        {
        ans[i]=ans[i-1]+ans[i-2];
        }
        else
        ans[i]=ans[i-1];
       }
       return ans[dest];
    }
    public static void main(String[] args) {
       // System.out.println(climb(5,0));
       int n=5;
       int p[]=new int[n+1];
      // System.out.println(climbmem(5,0, p));
      System.out.println(climbtabl(0,n));
    }
}
