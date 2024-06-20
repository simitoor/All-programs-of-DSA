public class Coinchange {
    public static int Knapsacktab(int wt[],int W,int n,int dp[][])
    {
        for(int i=0;i<dp.length;i++)
        dp[i][0]=1;
        for(int j=0;j<dp[0].length;j++)
        dp[0][j]=0;
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(wt[i-1]<=j)
                {
                    dp[i][j]=dp[i][j-wt[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    } 
    public static void main(String[] args) {
        
        int wt[]={1,2,3};
        int Weight=4;
        int dp[][]=new int[wt.length+1][Weight+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.print(Knapsacktab( wt, Weight, wt.length,dp));
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
