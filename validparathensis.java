import java.util.Stack;

public class validparathensis {
    public static void valid(String d,int i,Stack <Character> sb)
    {
        if(i==d.length() && sb.isEmpty())
        {
          System.out.print("It is valid");
          return;
        }
       else if(i==d.length() && !sb.isEmpty())
       {
        System.out.print("It is not valid");
        return;
       }
       if(d.charAt(i)==')'){
       if(sb.peek()=='(')
         {
            sb.pop();
        }
        else{
            sb.push(d.charAt(i));
        }
       }
      else if(d.charAt(i)=='}')
       {
        if(sb.peek()=='{')
        {
            sb.pop();
        }
        else{
            sb.push(d.charAt(i));
        }
       }
       else if(d.charAt(i)==']')
       {
        if(sb.peek()=='[')
        {
            sb.pop();
        }
        else{
            sb.push(d.charAt(i));
        }
    }
        else{
            sb.push(d.charAt(i));
        }
       
       valid(d, i+1, sb);
          }
    public static void main(String aroke[])
    {
       String s="{()}";
       Stack <Character> sb=new Stack<>();
       sb.push(s.charAt(0));
       valid(s,1,sb);
    }
}
