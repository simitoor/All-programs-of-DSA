public class EditDistance {
    public static int dettabl(String s1,String s2,int m,int n,int dp[][])
    {
      for(int i=0;i<dp.length;i++)
      dp[i][0]=i;
      for(int j=0;j<dp[0].length;j++)
      dp[0][j]=j;
      for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
              if(s1.charAt(i-1)==s2.charAt(j-1))
                dp[i][j]=dp[i-1][j-1];
                else
                {
                    dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
    String s="intention";
    String t="execution";
    
    int dp[][]=new int[s.length()+1][t.length()+1];
    for(int i=0;i<dp.length;i++)
    {
        for(int j=0;j<dp[0].length;j++)
        {
            dp[i][j]=-1;
        }
    }
    System.out.println(dettabl(s, t, s.length(), t.length(),dp));
    
}
}
