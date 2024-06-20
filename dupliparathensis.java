import java.util.Stack;

public class dupliparathensis {
    public static boolean dupli(String s,Stack <Character> sb,int i,int flag)
    {
      if(i==s.length() && flag!=0)
      {
        return true;
      }
      else if(i==s.length() && flag==0)
      {
        return false;
      }
     if(s.charAt(i)=='(')
     {
        sb.push('(');
     }
     else if(s.charAt(i)==')')
     {
       if(sb.peek()=='(')
       {
        sb.pop();
        flag=1;
       }
       else 
       {
                while(sb.peek()!='(')
         {
            sb.pop();
         }
         sb.pop();
       }
     }
     else {
        sb.push(s.charAt(i));
     }
     if(dupli(s, sb, i+1, flag))
     return true;
     return false;

    }
    public static void main(String ian[])
    {
       String s="((((a)+(b))+c+d))";
       Stack <Character> sb=new Stack<>();
       int flag=0;
       if(dupli(s,sb,0,flag))
       {
        System.out.print("It is duplicate");
       }
       else {
        System.out.print("It is not duplic");
       }
       
    }
}
