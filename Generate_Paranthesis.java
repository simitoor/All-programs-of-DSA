public class Generate_Paranthesis {
    

    public List<String> AllParenthesis(int n) 
  {
      int dp[]=new int[n];
      for(int i=2;i<n;i++)
      {
          dp[i]=0;
          for(int j=0;j<=i-1;j++)
          {
              dp[i]+=dp[j]*dp[i-j-1];
          }
      }
      List<String> a=new ArrayList<String>();
    
      Stack <Character> s=new Stack<>();
        a=sol(n,a,0,0,s,"");
      return a;
  }
  public List<String> sol(int n,List<String> a,int opencount,int closecount,Stack <Character> s,String d)
  {
      if(opencount==n && closecount==n)
      {
          if(s.isEmpty()){
          a.add(d);
          return a;
          }
      }
      if(opencount<n)
      {
          s.push('(');
          sol(n,a,opencount+1,closecount,s,d+'(');
          s.pop();
      }
      if(closecount<opencount && !s.isEmpty())
      {
          s.pop();
          sol(n,a,opencount,closecount+1,s,d+')');
          s.push('(');
      }
      return a;
  }
}

