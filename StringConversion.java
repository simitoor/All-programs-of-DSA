public class StringConversion {
    public static int dettabl(String s1,String s2,int m,int n,int dp[][])
    {
      for(int i=0;i<dp.length;i++)
      dp[i][0]=0;
      for(int j=0;j<dp[0].length;j++)
      dp[0][j]=0;
      for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                dp[i][j]=dp[i-1][j-1]+1;
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String s="aceg";
        String t="abcdef";
        int len=s.length()-t.length();
        int dp[][]=new int[s.length()+1][t.length()+1];

        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        int u=Math.min(t.length(),s.length())-dettabl(s, t, s.length(), t.length(),dp);
        int delete,add;
        if(len>0)
        {
         delete=len+u;
         add=u;
        }
        else{
            add=Math.abs(len)+u;
            delete=u;
        }
        System.out.println(delete);
        System.out.println(add);
    }
}
