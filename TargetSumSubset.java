public class TargetSumSubset{
    public static boolean subset(int wt[],int W,int n,boolean dp[][])
    {
        for(int i=0;i<dp.length;i++)
        dp[i][0]=true;
        for(int j=1;j<dp[0].length;j++)
        dp[0][j]=false;
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(wt[i-1]<=j && dp[i-1][j-wt[i-1]]==true)
                {
                    dp[i][j]=true;
                }
                else{
                   if(dp[i-1][j]==true)
                   dp[i][j]=true;
                }
            }
        }
        return dp[n][W];
    }
  public static void main(String[] args) {
    
        int wt[]={4,2,7,1,3};
        int Weight=10;
        boolean dp[][]=new boolean[wt.length+1][Weight+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=false;
            }
        }
        System.out.print(subset( wt, Weight, wt.length,dp));
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
  }
}