import java.util.Stack;
public class decodestring {
    public static void decodes(String a,Stack <Character> sb)
    {
        String d="";
        String ans="";
      for(int i=0;i<a.length();i++)
      {
        ans="";
        if(a.charAt(i)==']')
        {
          while(sb.peek()!='[')
          {
          d=sb.pop()+d;
          }
         sb.pop();
          int z = Character. getNumericValue(sb.pop());
          while(z!=0)
          {
            for(int j=0;j<d.length();j++)
            {
            ans+=d.charAt(j);
            }
            z--;
          }
          
         d=ans;
         }
        else{
          sb.push(a.charAt(i));
      }
      
      }
      System.out.println(d); 
    }
    public static void main(String[] args) {
        String a="3[b2[v]]";
        Stack <Character> sb=new Stack<>();
        decodes(a, sb);
    }
}
