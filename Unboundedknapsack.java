public class Unboundedknapsack {
   
        public static int Knapsacktab(int val[],int wt[],int W,int n,int dp[][])
    {
        for(int i=0;i<dp.length;i++)
        dp[i][0]=0;
        for(int j=0;j<dp[0].length;j++)
        dp[0][j]=0;
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(wt[i-1]<=j)
                {
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    } 
    
    public static void main(String[] args) {
    int val[]={15,14,10,45,30};
    int wt[]={2,5,1,3,4};
    int Weight=7;
    int dp[][]=new int[val.length+1][Weight+1];
    for(int i=0;i<dp.length;i++)
    {
        for(int j=0;j<dp[0].length;j++)
        {
            dp[i][j]=-1;
        }
    }
    System.out.print(Knapsacktab(val, wt, Weight, wt.length,dp));
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
