public class WildCardMatching {
    public static boolean dettabl(String s1,String s2,boolean dp[][])
    {
      dp[0][0]=true;
      for(int i=1;i<dp.length;i++)
      dp[i][0]=false;
      for(int j=1;j<dp[0].length;j++)
      {
        if(s2.charAt(j-1)=='*')
        dp[0][j]=dp[0][j-1];
      }
      for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1)||s2.charAt(j-1)=='?')
                dp[i][j]=dp[i-1][j-1];
                else if(s2.charAt(j-1)=='*'){
                    dp[i][j]=dp[i-1][j]||dp[i][j-1];
                }
                else{
                    dp[i][j]=false;
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
    public static void main(String[] args) {
         String s="baaabab";
    String t="**ba**ab";
   boolean dp[][]=new boolean[s.length()+1][t.length()+1];
     System.out.println(dettabl(s, t,dp));
}
}
