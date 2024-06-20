import java.util.Arrays;

public class MinimumArrayJumps {
    public static int minarrayjumps(int arr[]) {
       int n=arr.length;
       int dp[]=new int[n];
       Arrays.fill(dp,-1);
       dp[n-1]=0;
       for(int i=n-2;i>=0;i--)
      {
        int ans=Integer.MAX_VALUE;
        int steps=arr[i];
        for(int k=i+1;k<=i+steps && k<n;k++)
        {
            if(dp[k]!=-1)
            ans=Math.min(ans,dp[k]+1);
        }
        if(ans!=Integer.MAX_VALUE)
        dp[i]=ans;
      }
      return dp[0];
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        System.out.println(minarrayjumps(arr));
    }
}
