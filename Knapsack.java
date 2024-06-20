public class  Knapsack {
    public static int knaps(int val[],int wt[],int W,int n)
    {
        if(n==0 || W==0)
        return 0;
        if(wt[n-1]<=W)
        {
            int ans1=val[n-1]+knaps(val,wt,W-wt[n-1],n-1);
            int ans2=knaps(val,wt,W,n-1);
            return Math.max(ans1, ans2);
        }
        else
         { 
             return knaps(val, wt, W, n-1);
         }

    }
    public static int knapsmem(int val[],int wt[],int W,int n,int dp[][])
    {
        if(n==0 || W==0)
        return 0;
        if(dp[n][W]!=-1)
        return dp[n][W];
        if(wt[n-1]<=W)
        {
            int ans1=val[n-1]+knapsmem(val,wt,W-wt[n-1],n-1,dp);
            int ans2=knapsmem(val,wt,W,n-1,dp);
            dp[n][W]=Math.max(ans1, ans2);
            return dp[n][W];
        }
        
        else
         { 
            dp[n][W]=knapsmem(val, wt, W, n-1,dp);
            return dp[n][W];
         }
    }
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
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
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
    }
}
