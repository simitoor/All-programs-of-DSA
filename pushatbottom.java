import java.util.Stack;

public class pushatbottom
{
    public static void pushatbottoms(Stack <Integer> sb,int data)
    {
        if(sb.isEmpty())
        {
            sb.push(data);
            return;
        }
        int top=sb.pop();
        pushatbottoms(sb, data);
        sb.push(top);
    }
    public static void main(String acnr[])
    {
       Stack <Integer> sb=new Stack<>();
       sb.push(1);
       sb.push(2);
       sb.push(3);
       pushatbottoms(sb,4);
     
       while(!sb.isEmpty())
       {
          System.out.print(sb.pop());
      }
    }
}