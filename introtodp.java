public class introtodp {
    public static int fibanocci(int n,int f[])//memoziation
    {
        int number=0;
          if(n==0)
          {
            f[n]=0;
            return 0;
          }
          if(n==1)
          {
            f[n]=1;
            return 1;
          }
          if(f[n]!=0)
          {
            return f[n];
          }
         f[n]=fibanocci(n-1,f)+fibanocci(n-2,f);
        return f[n];
    }
     public static int fibtabulation(int n)
     {
        int ans[]=new int[n+1];
        ans[0]=0;
        ans[1]=1;
        for(int i=2;i<ans.length;i++)
        {
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans[n];
     }
    public static void main(String arr[])
    {
        int n=5;
        int f[]=new int [n+1];
       // System.out.print(fibanocci(n,f));
        System.out.println(fibtabulation(n));
    }
}